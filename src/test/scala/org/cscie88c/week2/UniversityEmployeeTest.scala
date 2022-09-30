package org.cscie88c.week2

import org.cscie88c.testutils.StandardTest

class UniversityEmployeeTest extends StandardTest {
  val uniEmployee1 = new UniversityEmployee("Anakin SkyWalker", "skywalker@gmail.com")
  val uniEmployee2 = new UniversityEmployee("Luke SkyWalker", "skywalker2@gmail.com")

  "UniversityEmployee" when {
    "initialized" should {
      "have a name" in {
        uniEmployee1.name shouldBe("Anakin SkyWalker")
        uniEmployee2.name shouldBe("Luke SkyWalker")
      }
      "have an email" in {
        uniEmployee1.email shouldBe ("skywalker@gmail.com")
        uniEmployee2.email shouldBe ("skywalker2@gmail.com")
      }
    }
    "description" should {
      "description contains name and email of the employee1" in {
        uniEmployee1.description shouldBe ("Name: Anakin SkyWalker, Email: skywalker@gmail.com")
      }
      "description contains name and email of the employee2" in {
        uniEmployee2.description shouldBe ("Name: Luke SkyWalker, Email: skywalker2@gmail.com")
      }
    }
  }

}





//"Prerequisite functions" when {
//  val testData: List[CustomerTransaction] = List (
//  "CS6043,15-Jan-14,98",
//  "CS4147,08-Jul-13,121",
//  "CS4655,30-Mar-13,93",
//  "CS3904,20-Jul-14,103",
//  "CS4102,09-Jul-13,96",
//  "CS2086,05-Mar-13,75"
//  ).map (CustomerTransaction (_) )
//
//  "executed" should {
//  "filter transactions greater than $100" in {
//  val expectedResult = List ("CS6043,15-Jan-14,98", "CS4655,30-Mar-13,93", "CS4102,09-Jul-13,96", "CS2086,05-Mar-13,75").map (CustomerTransaction (_) )
//  Prerequisite.getFilteredTransactions (testData) shouldBe (expectedResult)
//}
//
//  "calculate average transaction amount by month and year" in {
//  Prerequisite.getAverageTransactionAmountByMonthAndYear (testData) should contain (("Jan", "14") -> 98.0)
//  Prerequisite.getAverageTransactionAmountByMonthAndYear (testData) should contain (("Mar", "13") -> (93.0 + 75.0) / 2)
//}
//}
//}