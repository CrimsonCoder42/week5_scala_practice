package org.cscie88c.week4
import scala.math._

import org.cscie88c.testutils.{StandardTest}

class TrigUtilsTest extends StandardTest {
  
  "TrigUtils" when {
    "calling sin" should {
      "return the correct value for 90" in {
        val sinNum: Double = TrigUtils.sinDegrees(90.0)
        val sinExpectNum: Double = sin(90.0.toRadians)
        sinNum should equal(sinExpectNum)
      }
      "return the correct value for 0" in {
        val sinNum: Double = TrigUtils.sinDegrees(0.0)
        val sinExpectNum: Double = sin(0.0.toRadians)
        sinNum should equal(sinExpectNum)
      }
    
    }
    "calling cos" should {
      "return the correct value for 90" in {
        val cosNum: Double = TrigUtils.cosDegrees(90.0)
        val cosExpectNum: Double = cos(90.0.toRadians)
        cosNum should equal(cosExpectNum)
      }
      "return the correct value for 0" in {
        val cosNum: Double = TrigUtils.cosDegrees(0.0)
        val cosExpectNum: Double = cos(0.0.toRadians)
        cosNum should equal(cosExpectNum)
      }

    }
    "calling squared" should {
      "return the correct value for 5" in {
        val squaredNum: Double = TrigUtils.squared(5.0)
        val squaredExpectNum: Double = (5 * 5)
        squaredNum should equal(squaredExpectNum)
      }
      "return the correct value for 10" in {
        val squaredNum: Double = TrigUtils.squared(10.0)
        val squaredExpectNum: Double = (10 * 10)
        squaredNum should equal(squaredExpectNum)
      }

    }


  }
}
