package org.cscie88c.week2

final case class Subject (
                         id: Int,
                         name: String,
                         isStem: Boolean
                         )
object Subject {

  def apply(csvRow: String): Subject = {
    val fields = csvRow.split(",")
    Subject(
      id = fields(0).toInt,
      name = fields(1),
      isStem = fields(2).toBoolean
    )
  }

  val allSubjects: List[Subject] = List(
    "1,Physics,true",
    "2,Chemistry,true",
    "3,Math,true",
    "4,English,false"
  ).map(Subject(_))

  def stemSubjects: List[Subject] = allSubjects.filter(_.isStem == true)

}


object test5 extends App {
  println(Subject.stemSubjects)
}