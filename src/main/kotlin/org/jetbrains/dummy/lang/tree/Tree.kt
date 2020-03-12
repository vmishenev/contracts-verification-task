package org.jetbrains.dummy.lang.tree

sealed class Element {
    abstract val line: Int

    abstract fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R
    abstract fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D)
}

class File(
    override val line: Int,
    val functions: List<FunctionDeclaration>
) : Element() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitFile(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {
        functions.forEach { it.accept(visitor, data) }
    }
}

class FunctionDeclaration(
    override val line: Int,
    val name: String,
    val parameters: List<String>,
    val body: Block
) : Element() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitFunctionDeclaration(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {
        body.accept(visitor, data)
    }
}

class Block(
    override val line: Int,
    val statements: List<Statement>
) : Element() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitBlock(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {
        statements.forEach { it.accept(visitor, data) }
    }
}

// --------------- Statements ---------------

sealed class Statement : Element()

// variable = rhs
class Assignment(
    override val line: Int,
    val variable: String,
    val rhs: Expression
) : Statement() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitAssignment(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {
        rhs.accept(visitor, data)
    }
}

class IfStatement(
    override val line: Int,
    val condition: Expression,
    val thenBlock: Block,
    val elseBlock: Block?
) : Statement() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitIfStatement(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {
        condition.accept(visitor, data)
        thenBlock.accept(visitor, data)
        elseBlock?.accept(visitor, data)
    }
}

class VariableDeclaration(
    override val line: Int,
    val name: String,
    val initializer: Expression?
) : Statement() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitVariableDeclaration(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {
        initializer?.accept(visitor, data)
    }
}

class ReturnStatement(
    override val line: Int,
    val result: Expression?
) : Statement() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitReturnStatement(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {
        result?.accept(visitor, data)
    }
}

// --------------- Expressions ---------------

sealed class Expression : Statement()

class VariableAccess(
    override val line: Int,
    val name: String
) : Expression() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitVariableAccess(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {}
}

class IntConst(
    override val line: Int,
    val value: Int
) : Expression() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitIntConst(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {}
}

class BooleanConst(
    override val line: Int,
    val value: Boolean
) : Expression() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitBooleanConst(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {}
}

class FunctionCall(
    override val line: Int,
    val function: String,
    val arguments: List<Expression>
) : Expression() {
    override fun <R, D> accept(visitor: DummyLangVisitor<R, D>, data: D): R {
        return visitor.visitFunctionCall(this, data)
    }

    override fun <D> acceptChildren(visitor: DummyLangVisitor<*, D>, data: D) {
        arguments.forEach { it.accept(visitor, data) }
    }
}