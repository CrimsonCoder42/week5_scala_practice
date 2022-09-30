package cscie88cNotes.week2

object StringInterop extends App {

  // prefix format string with s"...", use expression in format string.

  def bonusAmount(baseSalary: Long, bonusPercent: Double): Unit = {
    val total = baseSalary * bonusPercent / 100.0
    println(s"Your total bonus is ${total}")
  }

  bonusAmount(10000000, 5.0)
}
