package org.jetbrains.dummy.lang

import org.jetbrains.dummy.lang.utils.prettyPrinter
import java.io.File

fun main() {
    val testDataDir = File("testData")
    val parentPrefix = testDataDir.absolutePath + File.separator
    val fileNames = testDataDir.listFiles()!!
        .filter { it.extension == "dummy" }
        .map {
            it.absolutePath.removePrefix(parentPrefix)
        }.sorted().toList()

    val commonPrefix = parentPrefix.removePrefix(File(".").absolutePath.dropLast(1))

    File("src/test/kotlin/org/jetbrains/dummy/lang/DummyLanguageTestGenerated.kt").prettyPrinter().use { printer ->
        with(printer) {
            println("package org.jetbrains.dummy.lang")
            println()

            val imports = listOf(
                "org.junit.Test"
            )

            for (import in imports) {
                println("import $import")
            }
            println()

            println("class DummyLanguageTestGenerated : AbstractDummyLanguageTest() {")
            withIndent {
                fileNames.forEachIndexed { index, fileName ->
                    println("@Test")
                    println("fun test${fileName.removeSuffix(".dummy").capitalize()}() {")
                    withIndent {
                        println("doTest(\"${commonPrefix + fileName}\")")
                    }
                    println("}")

                    if (index < fileNames.size - 1) {
                        println()
                    }
                }
            }
            println("}")
        }
    }
}