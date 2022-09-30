package org.cscie88c.week2

//Define a case class Student to represent an entry in the student table
//The Student case class should have the following fields
//id, firstName, lastName, email, gender, country
//Note: Write the class in the file src/main/scala/org/cscie88c/week2/Student.scala

final case class Student(
                        id: Int,
                        firstName: String,
                        lastName: String,
                        email: String,
                        gender: String,
                        country: String,
                        )


//Write a Student companion object with a data constructor to create a Student object from
//a comma-separated-value (CSV) string

object Student{

  def apply(csvRow: String): Student = {
    val fields = csvRow.split(",")
    Student(
      id = fields(0).toInt,
      firstName = fields(1),
      lastName = fields(2),
      email = fields(3),
      gender = fields(4),
      country = fields(5)
    )
  }

  val allStudents: List[Student] = List(
    "1,Emmy,Conrart,econrart0@gizmodo.com,Male,China",
    "2,Marin,Blasoni,mblasoni1@edublogs.org,Female,United States",
    "3,Jesse,Chismon,jchismon2@hostgator.com,Male,China",
    "4,Delmore,Scriver,dscriver3@boston.com,Male,United States",
    "5,Jocelyn,Blaxlande,jblaxlande4@europa.eu,Female,China"
  ).map(Student(_))


  def studentNamesByCountry(country: String): List[String] = {
    allStudents.filter(_.country == country)
    .map(student => student.firstName + " " + student.lastName)
  }

  def studentTotalsByCountry(country: String): Int = {
    allStudents.count(_.country == country)
  }

}

object test3 extends App {
  println(Student.studentNamesByCountry("United States"))
}




//reference: https://nrinaudo.github.io/scala-best-practices/tricky_behaviours/final_case_classes.html
////final case class PositiveInt(value: Int)
////
////object PositiveInt {
////  def fromInt(i: Int): Option[PositiveInt] =
////    if(i > 0) Some(new PositiveInt(i))
////    else      None
////}
