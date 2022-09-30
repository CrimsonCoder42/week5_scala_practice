package cscie88cNotes.week2

object OOPScala extends App{

  // use object to create object keyword.

  println(User1.displayString())
  val mike = new User("Mike", "mike@gmail.com")
  println(mike.displayString())

}

object User1 {
  val name: String = "Scott"
  val email: String = "scott@test.com"
  def displayString() = s"name= ${name} email= ${email}"
}

class User(val name: String, email: String) {
  def displayString(): String = s"name= ${name} email= ${email}"
}

