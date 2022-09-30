package org.cscie88c.week2

object UtilFunctions extends App {

  def maximum(a: Int, b: Int): Int = if(a > b) a else b

  def average(a: Int, b: Int): Double = (a.toDouble + b.toDouble) / 2

  println(average(1,2))
}
