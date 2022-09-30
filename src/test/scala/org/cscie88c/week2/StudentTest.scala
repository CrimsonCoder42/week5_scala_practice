package org.cscie88c.week2
import org.cscie88c.testutils.{StandardTest}


class StudentTest extends StandardTest {
  "Student functions" when {
    val testData2: List[Student] = List(
      "1,Emmy,Conrart,econrart0@gizmodo.com,Male,China",
      "2,Marin,Blasoni,mblasoni1@edublogs.org,Female,United States",
      "3,Jesse,Chismon,jchismon2@hostgator.com,Male,China",
      "4,Delmore,Scriver,dscriver3@boston.com,Male,United States",
      "5,Jocelyn,Blaxlande,jblaxlande4@europa.eu,Female,China"
    ).map(Student(_))
    "executed" should {
      "Show" in {
        val expectedResult = List("4,Delmore,Scriver,dscriver3@boston.com,Male,United States").map(Student(_))
        val nextResult = Student.apply("4,Delmore,Scriver,dscriver3@boston.com,Male,United States")
        //        println(expectedResult(0).firstName)
        //        println(nextResult.firstName)
        expectedResult(0).firstName shouldBe (nextResult.firstName)
      }
      "executed" should {
        "filter transactions greater than $100" in {
          val expectedResult2 = List("Marin Blasoni", "Delmore Scriver").map(Student(_))
          //Student.studentTotalsByCountry("United States") shouldBe ("Marin Blasoni", "Delmore Scriver")
          //Student.studentNamesByCountry("United States") shouldBe
         println(expectedResult2);
      }
    }
  }
  }
}

