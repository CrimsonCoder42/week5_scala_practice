package org.cscie88c.week2

import org.cscie88c.testutils.StandardTest

class FacultyTest extends StandardTest{
  val uniFaculty1 = new Faculty("History101","Anakin SkyWalker", "skywalker@gmail.com")
  val uniFaculty2 = new Faculty("CSCI101","Luke SkyWalker", "skywalker2@gmail.com")

  "Faculty" when {
    "initialized" should {
      "have a name" in {
        uniFaculty1.name shouldBe ("Anakin SkyWalker")
        uniFaculty2.name shouldBe ("Luke SkyWalker")
      }
      "have an email" in {
        uniFaculty1.email shouldBe ("skywalker@gmail.com")
        uniFaculty2.email shouldBe ("skywalker2@gmail.com")
      }
      "have a courseId" in {
        uniFaculty1.courseID shouldBe ("History101")
        uniFaculty2.courseID shouldBe ("CSCI101")
      }
    }
    "description" should {
      "description contains name and email of the employee1" in {
        uniFaculty1.description shouldBe ("Name: Anakin SkyWalker, Email: skywalker@gmail.com, Course: History101")
      }
      "description contains name and email of the employee2" in {
        uniFaculty2.description shouldBe ("Name: Luke SkyWalker, Email: skywalker2@gmail.com, Course: CSCI101")
      }
    }
  }
}
