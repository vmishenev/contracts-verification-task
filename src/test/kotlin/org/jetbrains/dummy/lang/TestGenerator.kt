package org.jetbrains.dummy.lang

import org.jetbrains.dummy.lang.utils.prettyPrinter
import java.io.File

fun main() {
    generateTests(
        testDataRoot = "testData",
        abstractTestClassName = "AbstractDummyLanguageTest"
    )

//    Пример того, как сгенерировать тесты для файлов в директории `testData/someOtherTests`
//    generateTests(
//        testDataRoot = "testData/someOtherTests",
//        abstractTestClassName = "AbstractDummyLanguageTest"
//    )
}

/**
 * [testDataRoot] -- относительный путь к директории, в которой хранятся тестовые файлы
 * [abstractTestClassName] -- имя абстрактного тестового класса, на основе которого будут сгенерированны тесты
 *     Требования к [abstractTestClassName]:
 *     - имя класса должно начинаться с перфикса `Abstract`
 *     - класс должен находиться в пакете `org.jetbrains.dummy.lang`
 *     - класс должен содержать в себе метод `fun doTest(path: String)`
 *
 * Генератор создаёт тесты только для тестовых файлов, которые находятся непосредственно в
 *     переданной директории, и не ходит по вложенным директориям
 */
private fun generateTests(testDataRoot: String, abstractTestClassName: String) {
    val testDataDir = File(testDataRoot)
    val parentPrefix = testDataDir.absolutePath + File.separator
    val fileNames = testDataDir.listFiles()!!
        .filter { it.extension == "dummy" }
        .map {
            it.absolutePath.removePrefix(parentPrefix)
        }.sorted().toList()

    val commonPrefix = parentPrefix.removePrefix(File(".").absolutePath.dropLast(1))
    val generatedTestName = abstractTestClassName.replace("Abstract", "") + "Generated"

    File("src/test/kotlin/org/jetbrains/dummy/lang/$generatedTestName.kt").prettyPrinter().use { printer ->
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

            println("class $generatedTestName : $abstractTestClassName() {")
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