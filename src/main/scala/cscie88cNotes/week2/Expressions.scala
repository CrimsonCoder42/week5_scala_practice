package cscie88cNotes.week2

object Expressions extends App {


  // these are expressions.
  val isManager = true
  val dailyHours = 8
  val departmentName = "Engineering"

  // var can lead to issues across multiple threads because of it's mutability

  val result = dailyHours + 2

  // Scala will detect values and expressions

  //println(result + dailyHours)

  // Every expression has a value and will be evaluated.

  val res2 = if (isManager) "Manager" else "Developer"

  //println(res2)

  val className = "another class"
  println(className)


}
