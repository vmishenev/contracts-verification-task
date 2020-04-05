package org.jetbrains.dummy.lang


import org.jetbrains.dummy.lang.tree.*


class VariableInitializationChecker(private val reporter: DiagnosticReporter) : AbstractChecker() {

    class Scope : Cloneable {
        val declaredVars: HashMap<String, VariableDeclaration> = HashMap()
        val assignedVars: HashSet<VariableDeclaration> = HashSet()

        fun addAssignedVar(name: String) {
            val decl = declaredVars.get(name)
            if (decl != null)
                addAssignedVar(decl)
            else
                println(name + "is not declared")
        }

        fun addAssignedVar(varDecl: VariableDeclaration) {
            assignedVars.add(varDecl)
        }

        fun addVarDecl(varDecl: VariableDeclaration, isInit:Boolean = false) {
            declaredVars.put(varDecl.name, varDecl)
            if(isInit)
                addAssignedVar(varDecl)
        }

        fun checkVarInit(name: String): Boolean {
            val decl = declaredVars.get(name)
            if (decl != null)
                return assignedVars.contains(decl)
            else
                return false
        }

        public override fun clone(): Scope {
            val sc = Scope()
            sc.declaredVars.putAll(declaredVars)
            sc.assignedVars.addAll(assignedVars)
            return sc
        }

    }

    override fun inspect(file: File) {
        val currentScope = Scope()
        var visitor = checkerVisitor()
        //visitor.visitFile(file, currentScope)
        file.acceptChildren(visitor, currentScope)
    }

    inner class checkerVisitor : DummyLangVisitor<Scope, Scope>() {
        override fun visitElement(element: Element, data: Scope): Scope {
            element.acceptChildren(this, data)
            return data
        }

        override fun visitFunctionDeclaration(functionDeclaration: FunctionDeclaration, data: Scope): Scope {
            val newScope = Scope()
            println("visitFunctionDeclaration " + functionDeclaration.name)
            functionDeclaration.parameters.forEach {
                val vd = VariableDeclaration(functionDeclaration.line, it, null)
                newScope.addVarDecl(vd, true)
            }
            functionDeclaration.acceptChildren(this, newScope)
            return data
        }

        override fun visitVariableAccess(variableAccess: VariableAccess, data: Scope): Scope {
            println("visitVariableAccess " + variableAccess.name)
            if (!data.checkVarInit(variableAccess.name)) {
                reportAccessBeforeInitialization(variableAccess)
            }
            return data
        }

        override fun visitVariableDeclaration(variableDeclaration: VariableDeclaration, data: Scope): Scope {
            println("visitVariableDeclaration " + variableDeclaration.name + " " + variableDeclaration.line)
            val newScope = visitStatement(variableDeclaration, data)
            newScope.addVarDecl(variableDeclaration, variableDeclaration.initializer != null)
            return newScope
        }


        override fun visitAssignment(assignment: Assignment, data: Scope): Scope {
            val newScope = visitStatement(assignment, data)
            newScope.addAssignedVar(assignment.variable)
            return newScope
        }

        override fun visitIfStatement(ifStatement: IfStatement, data: Scope): Scope {
            val scope1 = visitExpression(ifStatement.condition, data)

            var scopeThen = scope1.clone()
            scopeThen = visitBlock(ifStatement.thenBlock, scopeThen)
            if (ifStatement.elseBlock != null) {
                var scopeElse = scope1.clone();
                scopeElse = visitBlock(ifStatement.elseBlock, scopeElse)

                val intersect = HashSet(scopeThen.assignedVars);
                intersect.retainAll(scopeElse.assignedVars)
                scope1.assignedVars.addAll(intersect)
            }
            return scope1;

        }
    }


    // Use this method for reporting errors
    private fun reportAccessBeforeInitialization(access: VariableAccess) {
        reporter.report(access, "Variable '${access.name}' is accessed before initialization")
    }

}