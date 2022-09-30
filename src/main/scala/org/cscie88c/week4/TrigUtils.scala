package org.cscie88c.week4
import scala.math._


object TrigUtils{

  // https://www.scala-lang.org/api/2.13.6/scala/math/index.html
  // use the function literal syntax for sin and cos
  // https://www.alphacodingskills.com/scala/notes/scala-math-sin.php#:~:text=The%20Scala%20Math%20sin(),then%20the%20result%20is%20NaN.
  //https://www.geeksforgeeks.org/scala-float-toradians-method-with-example/

  val sinDegrees: Double => Double = (x: Double) => sin(x.toRadians)
  val cosDegrees: Double => Double = (x: Double) => cos(x.toRadians)


  // use the placeholder syntax for squared
  val squared: Double => Double = (x: Double) => pow(x,2)


}
