package org.jetbrains.dummy.lang

import org.jetbrains.dummy.lang.tree.File

abstract class AbstractChecker {
    abstract fun inspect(file: File)
}