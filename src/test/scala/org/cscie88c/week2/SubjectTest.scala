package org.cscie88c.week2
import org.cscie88c.testutils.{StandardTest}


class SubjectTest extends StandardTest {
  "Subject functions" when {
    "executed" should{
      "Show Subject" in {
        val expectedResult = List("1,Physics,true").map(Subject(_))
        val nextResult = Subject.apply("1,Physics,true")
//        println(expectedResult(0).name)
//        println(nextResult.name)
        expectedResult(0).name shouldBe(nextResult.name)
      }
    }
  }
}
