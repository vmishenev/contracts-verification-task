package org.jetbrains.dummy.lang

import org.jetbrains.dummy.lang.tree.Element
import java.io.OutputStream
import java.io.PrintStream

class DiagnosticReporter(
    outputStream: OutputStream
) {
    private val outputStream = PrintStream(outputStream)

    fun report(element: Element, message: String) {
        outputStream.println("ERROR: line ${element.line}: $message")
    }
}