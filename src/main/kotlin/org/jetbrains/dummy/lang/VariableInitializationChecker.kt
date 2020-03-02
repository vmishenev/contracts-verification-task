package org.jetbrains.dummy.lang

import org.jetbrains.dummy.lang.tree.File
import org.jetbrains.dummy.lang.tree.VariableAccess

class VariableInitializationChecker(private val reporter: DiagnosticReporter) : AbstractChecker() {
    override fun inspect(file: File) {
        TODO("not implemented")
    }

    // Use this method for reporting errors
    private fun reportAccessBeforeInitialization(access: VariableAccess) {
        reporter.report(access, "Variable '${access.name}' is accessed before initialization")
    }
}