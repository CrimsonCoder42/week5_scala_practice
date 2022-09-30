package org.cscie88c.week2

class Administrator(val budget: Long, name:String, email: String) extends UniversityEmployee(name, email){
  override def description: String = "Name: " + name + "," + " Email: " + email + "," + " Budget: $" + budget
}

object test1 extends App {
  val uni = new Administrator(1500800, "Devin", "nostro37@gmail.com")

  println(uni.description)
}
