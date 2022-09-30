package org.cscie88c.week3
import org.scalatest._
import wordspec._

class StudentTest extends AnyWordSpec {

  val test1: Student = new Student(
    "Emmy",
    "econrart0@gizmodo.com",
    "Physics",
    90)

  val test2: Student = new Student(
    "Emmy",
    "mblasoni1@edublogs.org",
    "Chemistry",
    82)

  val test3: Student = new Student(
    "Jesse",
    "jchismon2hostgator.com",
    "Chemistry",
    95)

  val test4: Student = new Student(
    "Jesse",
    "jchismon2hostgator.com",
    "Physics",
    89)

  val test5: Student = new Student(
    "Emmy",
    "jblaxlande4@europa.eu",
    "Chemistry",
    96)

  // create total list, list by student, list by subject
  val studentAll : List[Student] = List(test1, test2, test3, test4, test5)


  // validates Student class
  "A student" should {
    "have a valid name" in {
      assert(test1.name.equals("Emmy"))
      assert(test2.name.equals("Emmy"))
      assert(test3.name.equals("Jesse"))
      assert(test4.name.equals("Jesse"))
      assert(test5.name.equals("Emmy"))
    }

  }
  // validates 2.1 emails
  "A student email" should {
    "have an @ symbol" in {
      assert(Student.validateEmail(test1).equals(true))
      assert(Student.validateEmail(test2).equals(true))
      assert(Student.validateEmail(test3).equals(false))
      assert(Student.validateEmail(test4).equals(false))
      assert(Student.validateEmail(test5).equals(true))
    }
  }

  val subjectChemistry: Double = ((test2.score + test3.score + test5.score) / 3)
  val subjectPhysics: Double = ((test4.score + test1.score) / 2)
  "averageScorebySubject" should {
    "return the average score by subject" in {
      assert(Student.averageScoreBySubject("Chemistry", studentAll)
        .equals(subjectChemistry))
      assert(Student.averageScoreBySubject("Physics", studentAll)
        .equals(subjectPhysics))
    }
  }

  val studentEmmy: Double = ((test1.score + test2.score + test5.score) / 3)
  val studentJesse: Double = ((test3.score + test4.score) / 2)
  "averageScorebyStudent" should {
    "return the average score by student" in {
      assert(Student.averageScoreByStudent(test1, studentAll)
        .equals(studentEmmy))
      assert(Student.averageScoreByStudent(test3, studentAll)
        .equals(studentJesse))
    }
  }

}
