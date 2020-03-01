package org.jetbrains.dummy.lang.utils

import java.io.Closeable
import java.io.File
import java.io.OutputStream
import java.io.PrintStream

class PrettyPrinter(
    outputStream: OutputStream,
    private val indent: String = "    "
) : Closeable {
    private val outputStream = PrintStream(outputStream)
    private var indentCounter: Int = 0

    fun println(vararg strings: String) {
        for (i in 1..indentCounter) {
            outputStream.print(indent)
        }
        outputStream.println(strings.joinToString(separator = " "))
    }

    fun withIndent(block: () -> Unit) {
        indentCounter++
        try {
            block()
        } finally {
            indentCounter--
        }
    }

    override fun close() {
        outputStream.close()
    }
}

fun File.prettyPrinter(): PrettyPrinter {
    return PrettyPrinter(outputStream())
}