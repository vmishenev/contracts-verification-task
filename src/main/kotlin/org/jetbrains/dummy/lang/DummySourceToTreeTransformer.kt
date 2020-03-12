package org.jetbrains.dummy.lang

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.antlr.v4.runtime.tree.TerminalNode
import org.jetbrains.dummy.lang.DummyLanguageParser.*
import org.jetbrains.dummy.lang.tree.*

class DummySourceToTreeTransformer {
    fun transform(sourceFileName: String): File {
        val lexer = DummyLanguageLexer(CharStreams.fromFileName(sourceFileName))
        lexer.removeErrorListeners()
        lexer.addErrorListener(ThrowingErrorListener)
        val tokens = CommonTokenStream(lexer)

        val parser = DummyLanguageParser(tokens)
        return parser.prog().transform()
    }


    private fun ProgContext.transform(): File {
        val functionDeclarations = func_def().map { it.transform() }
        return File(line, functionDeclarations)
    }

    private fun Func_defContext.transform(): FunctionDeclaration {
        val ids = ID()
        val name = ids.first().text
        val parameters = ids.drop(1).map { it.text }
        val body = block().transform()
        return FunctionDeclaration(line, name, parameters, body)
    }

    private fun BlockContext.transform(): Block {
        return Block(
            line,
            stat().map { it.transform() }
        )
    }

    private fun StatContext.transform(): Statement {
        val varDefContext: Var_defContext? = var_def()
        val assignContext: AssignContext? = assign()
        val exprContext: ExprContext? = expr()
        val ifStatementContext: If_statementContext? = if_statement()
        val returnStatementContext: Return_statementContext? = return_statement()

        return when {
            varDefContext != null -> varDefContext.transform()
            assignContext != null -> assignContext.transform()
            exprContext != null -> exprContext.transform()
            ifStatementContext != null -> ifStatementContext.transform()
            returnStatementContext != null -> returnStatementContext.transform()
            else -> throw IllegalStateException()
        }
    }

    private fun Return_statementContext.transform(): ReturnStatement {
        return ReturnStatement(
            line,
            result = expr()?.transform()
        )
    }

    private fun Var_defContext.transform(): VariableDeclaration {
        return VariableDeclaration(
            line,
            name = ID().text,
            initializer = expr()?.transform()
        )
    }

    private fun AssignContext.transform(): Assignment {
        return Assignment(
            line,
            variable = ID().text,
            rhs = expr().transform()
        )
    }

    private fun If_statementContext.transform(): IfStatement {
        return IfStatement(
            line,
            condition = expr().transform(),
            thenBlock = block(0).transform(),
            elseBlock = block(1)?.transform()
        )
    }

    private fun ExprContext.transform(): Expression {
        val id: TerminalNode? = ID()
        val trueLiteral: TerminalNode? = TRUE()
        val falseLiteral: TerminalNode? = FALSE()
        val number: TerminalNode? = NUMBER()
        val functionCall: Func_callContext? = func_call()

        return when {
            id != null -> VariableAccess(line, id.text)
            trueLiteral != null -> BooleanConst(line, true)
            falseLiteral != null -> BooleanConst(line, false)
            number != null -> IntConst(line, number.text.toInt())
            functionCall != null -> functionCall.transform()
            else -> throw IllegalStateException()
        }
    }

    private fun Func_callContext.transform(): FunctionCall {
        return FunctionCall(
            line,
            ID().text,
            expr().map { it.transform() }
        )
    }

    private val ParserRuleContext.line: Int
        get() = start.line

    private object ThrowingErrorListener : BaseErrorListener() {
        override fun syntaxError(
            recognizer: Recognizer<*, *>?,
            offendingSymbol: Any?,
            line: Int,
            charPositionInLine: Int,
            msg: String?,
            e: RecognitionException?
        ) {
            throw ParseCancellationException("line $line:$charPositionInLine $msg");
        }
    }
}