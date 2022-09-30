package cscie88cNotes.week2


// Inheritance: Derive subclasses from the parent or base class. Reuse data and methods.

object InheritanceOrSubclass extends App{

}

class Employee(
    name: String,
    email: String,
    salary: Int
              ) extends User(name, email)
// companion objects must have same name as the class

object Employee {
  val MAX_SALARY: Int = 1000

  def apply(name: String, email: String, salary: Int): Employee =
    new Employee(name, email, salary)

  def apply(email: String): Employee =
    new Employee(email, email, 0)

}

