package org.jetbrains.dummy.lang.tree

abstract class DummyLangVisitor<out R, in D> {
    abstract fun visitElement(element: Element, data: D): R

    open fun visitFile(file: File, data: D): R {
        return visitElement(file, data)
    }

    open fun visitFunctionDeclaration(functionDeclaration: FunctionDeclaration, data: D): R {
        return visitElement(functionDeclaration, data)
    }

    open fun visitBlock(block: Block, data: D): R {
        return visitElement(block, data)
    }

    open fun visitStatement(statement: Statement, data: D): R {
        return visitElement(statement, data)
    }

    open fun visitAssignment(assignment: Assignment, data: D): R {
        return visitStatement(assignment, data)
    }

    open fun visitIfStatement(ifStatement: IfStatement, data: D): R {
        return visitStatement(ifStatement, data)
    }

    open fun visitVariableDeclaration(variableDeclaration: VariableDeclaration, data: D): R {
        return visitStatement(variableDeclaration, data)
    }

    open fun visitReturnStatement(returnStatement: ReturnStatement, data: D): R {
        return visitStatement(returnStatement, data)
    }

    open fun visitExpression(expression: Expression, data: D): R {
        return visitStatement(expression, data)
    }

    open fun visitVariableAccess(variableAccess: VariableAccess, data: D): R {
        return visitExpression(variableAccess, data)
    }

    open fun visitIntConst(intConst: IntConst, data: D): R {
        return visitExpression(intConst, data)
    }

    open fun visitBooleanConst(booleanConst: BooleanConst, data: D): R {
        return visitExpression(booleanConst, data)
    }

    open fun visitFunctionCall(functionCall: FunctionCall, data: D): R {
        return visitExpression(functionCall, data)
    }
}