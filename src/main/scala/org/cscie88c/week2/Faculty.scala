package org.cscie88c.week2

class Faculty( val courseID: String, name: String, email: String) extends UniversityEmployee(name, email){
  override def description: String = "Name: " + name + "," + " Email: " + email + "," + " Course: " + courseID
}

object test extends App {
  val uni = new Faculty("History101", "Devin", "nostro37@gmail.com")

  println(uni.description)
}



// Scala program of extending a class


// credit https://www.geeksforgeeks.org/extending-a-class-in-scala/
// Base class
//class Geeks1
//{
//  var Name: String = "chaitanyashah"
//}

// Derived class
// Using extends keyword
//class Geeks2 extends Geeks1
//{
//  var Article_no: Int = 30
//
//  // Method
//  def details()
//  {
//    println("Author name: " + Name);
//    println("Total numbers of articles: " + Article_no);
//  }
//}
//
//// Creating object
//object GFG
//{
//
//  // Driver code
//  def main(args: Array[String])
//  {
//
//    // Creating object of derived class
//    val ob = new Geeks2();
//    ob.details();
//  }
//}