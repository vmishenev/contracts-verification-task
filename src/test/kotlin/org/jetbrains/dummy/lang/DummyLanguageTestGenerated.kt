package org.jetbrains.dummy.lang

import org.junit.Test

class DummyLanguageTestGenerated : AbstractDummyLanguageTest() {
    @Test
    fun test1() {
        doTest("testData/1.dummy")
    }
    
    @Test
    fun testBad() {
        doTest("testData/bad.dummy")
    }
    
    @Test
    fun testFn_paramerters() {
        doTest("testData/fn_paramerters.dummy")
    }
    
    @Test
    fun testGood() {
        doTest("testData/good.dummy")
    }
    
    @Test
    fun testIte_1() {
        doTest("testData/ite_1.dummy")
    }
    
    @Test
    fun testIte_ite_1() {
        doTest("testData/ite_ite_1.dummy")
    }
    
    @Test
    fun testReturn() {
        doTest("testData/return.dummy")
    }
}
