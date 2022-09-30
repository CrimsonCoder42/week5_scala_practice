package cscie88cNotes.week2

object TypeSystem extends App {
  // Scala is strongly typed => every literal, value, function expression has a type.

  // Uses a type inference system => Specifying types is often optional
  val isManager : Boolean = true
  // above is "typed" below is manager not using type to define value
  val isManager2 = true


  // Special Types Any, Null, Unit, Nothing, Nil (value), None

  def myFunction(name: String): String =
    if (name == "Devin") "Fu"
    else "Bar"

  println(myFunction("Devin"))

}
