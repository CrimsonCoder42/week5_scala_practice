package org.cscie88c.week3

import org.cscie88c.testutils.{ StandardTest }

class UtilFunctionsTest extends StandardTest {
  "UtilFunctions" when {
    val sample1 = UtilFunctions.pythTriplesUpto100(25)
    val sample2 = UtilFunctions.pythTriplesUpto100(50)
    val sample3 = UtilFunctions.pythTriplesUpto100(75)

  "pythTriplesUpto100" should {
    "sample 1 should be a Pythagorean Triples" in {
      val ptTester: Boolean = UtilFunctions.pythTest(sample1._1,sample1._2, sample1._3)
      ptTester shouldBe true
    }
    "sample 2 should be a Pythagorean Triples" in {
      val ptTester2: Boolean = UtilFunctions.pythTest(sample2._1, sample2._2, sample2._3)
      ptTester2 shouldBe true
    }
    "sample 3 should be a Pythagorean Triples" in {
      val ptTester3: Boolean = UtilFunctions.pythTest(sample3._1, sample3._2, sample3._3)
      ptTester3 shouldBe true
    }
  }
  }
}
