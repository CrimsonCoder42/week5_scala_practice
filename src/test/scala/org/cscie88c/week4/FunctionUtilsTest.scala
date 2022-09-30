package org.cscie88c.week4

import org.cscie88c.testutils.{StandardTest}

class FunctionUtilsTest extends StandardTest {

   "FunctionUtils" when {
    "calling applyNtimes" should {
      "return the correct value" in {
        // write unit test here
        def add5(x:Int) = x + 5
        val appVal = FunctionUtils.applyNtimes(3)(0)(add5)
        appVal.equals(15)
      }
    
    }
     "calling deferredExecutor" should {
       "return the correct value" in {
         def add5(x: Int) = x + 5
         val myDeferredFunction = FunctionUtils.deferredExecutor("CPU Pool")(add5)
         val result = myDeferredFunction(4)
         result.equals(9)
       }
     }}
}
