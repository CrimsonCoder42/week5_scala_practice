package org.cscie88c.week4

import org.cscie88c.testutils.{StandardTest}

class ListUtilsTest extends StandardTest {
  "ListUtils" when {
    "calling ones" should {
      "return the correct value" in {
        // write unit test here
        ListUtils.ones(12).map(x => x + 1).sum shouldBe 24
      }
    }
    "calling zeros" should {
      "return the correct value" in {
        // write unit test here
        ListUtils.zeros(12).map(x => x + 1).sum shouldBe 12
      }
    }
    "calling CharCounts Hello World" should {
      "return the correct mapping" in {
        // write unit test here
        val testMap = Map('e' -> 1, 'l' -> 3, 'H' -> 1, 'W' -> 1, 'r' -> 1, 'o' -> 2, 'd' -> 1)
        val mainMap = ListUtils.charCounts("Hello World")
        mainMap should equal(testMap)
      }
    }
    "calling CharCounts quick brown fox" should {
      "return the correct mapping" in {
        // write unit test here
        val testMap = Map('e' -> 3, 'n' -> 1, 't' -> 1, 'a' -> 1, 'm' -> 1, 'i' -> 1, 'v' -> 1, 'p' -> 1, 'r' -> 2, 'w' -> 1, 'k' -> 1, 's' -> 1, 'x' -> 1, 'j' -> 1, 'y' -> 1, 'T' -> 1, 'u' -> 2, 'f' -> 1, 'q' -> 1, 'b' -> 1, 'g' -> 1, 'l' -> 1, 'c' -> 1, 'h' -> 2, 'o' -> 4, 'z' -> 1, 'd' -> 1)
        val mainMap = ListUtils.charCounts("The quick brown fox jumps over the lazy dog")
        mainMap should equal(testMap)
      }
    }
    "calling topN hello world" should {
      "return the correct mapping" in {
        // write unit test here
        val testMap = ListUtils.charCounts("Hello World")
        val expectedMap = Map('l' -> 3, 'o' -> 2)
        val mainMap = ListUtils.topN(2)(testMap)
        mainMap should equal(expectedMap)
      }
    }
  }

}
