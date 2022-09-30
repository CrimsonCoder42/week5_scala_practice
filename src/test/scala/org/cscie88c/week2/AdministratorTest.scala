package org.cscie88c.week2

import org.cscie88c.testutils.StandardTest

class AdministratorTest extends StandardTest{
  val uniAdmin1 = new Administrator(1500800,"Anakin SkyWalker", "skywalker@gmail.com" )
  val uniAdmin2 = new Administrator(5500800, "Luke SkyWalker", "skywalker2@gmail.com")

  "Faculty" when {
    "initialized" should {
      "have a name" in {
        uniAdmin1.name shouldBe ("Anakin SkyWalker")
        uniAdmin2.name shouldBe ("Luke SkyWalker")
      }
      "have an email" in {
        uniAdmin1.email shouldBe ("skywalker@gmail.com")
        uniAdmin2.email shouldBe ("skywalker2@gmail.com")
      }
      "have a courseId" in {
        uniAdmin1.budget shouldBe (1500800)
        uniAdmin2.budget shouldBe (5500800)
      }
    }
    "description" should {
      "description contains name and email of the employee1" in {
        uniAdmin1.description shouldBe ("Name: Anakin SkyWalker, Email: skywalker@gmail.com, Budget: $1500800")
      }
      "description contains name and email of the employee2" in {
        uniAdmin2.description shouldBe ("Name: Luke SkyWalker, Email: skywalker2@gmail.com, Budget: $5500800")
      }
    }
  }
}
