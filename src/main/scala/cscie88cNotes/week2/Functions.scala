package cscie88cNotes.week2

object Functions extends App{

  // the value fo the last expression is what the function returns

  def max(x: Int, y: Int): Int = {
    if (x > y)
      x
    else
      y
  }

  // Unit for when no type is returned
  def printSalary(baseSalary: Double): Unit = {
    println("Salary: " + baseSalary)
  }

  printSalary(300)

  def bonusAmount(baseSalary: Long, bonusPercent: Double): Double = {
    baseSalary * bonusPercent / 100.0
  }

  def mult2(num1:Int, num2: Int): Int = num1 * num2
  def mult3(num1:Int, num2: Int): Int = num1 * num2

  println(mult2(2,3))

}
