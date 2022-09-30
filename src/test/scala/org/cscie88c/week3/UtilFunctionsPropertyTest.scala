package org.cscie88c.week3

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks
import org.scalacheck._

import java.util.Properties



class UtilFunctionsPropertyTest extends Properties("String") {

  test("verify that the distributive property of multiplication is true.") {
    assert(UtilFunctions.mult2(12,104) == UtilFunctions.mult2(12,(100 + 4)))
    // 12 * 104 = 12(100 + 4) = 12(100) + 12(4) = 1200 + 48 = 1248
    assert(UtilFunctions.mult2(824,25) == UtilFunctions.mult2(25,(800 + 24)))
    // 824 * 25 = (800+20+4)×25 = 800×25+20×25+4×25 = 20000+600 = 20600
  }

  test("generator that randomly selects a item from the list of pythagorean triples.") {
    assert(UtilFunctions.mult2(12, 104) == UtilFunctions.mult2(12, (100 + 4)))
    // 12 * 104 = 12(100 + 4) = 12(100) + 12(4) = 1200 + 48 = 1248
    assert(UtilFunctions.mult2(824, 25) == UtilFunctions.mult2(25, (800 + 24)))
    // 824 * 25 = (800+20+4)×25 = 800×25+20×25+4×25 = 20000+600 = 20600
  }


}
