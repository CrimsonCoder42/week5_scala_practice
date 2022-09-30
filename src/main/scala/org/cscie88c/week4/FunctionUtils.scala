package org.cscie88c.week4

object FunctionUtils extends App{
  
  // complete the implementation of the higher order functions below
  //https://alvinalexander.com/scala/how-to-create-range-list-seq-array-numbers-in-scala/
  //https://www.baeldung.com/scala/folding-lists

  def applyNtimes(n: Int)(x: Int)(f: Int => Int): Int = (1 to n).fold(x)((accu: Int, _) => f(accu))

  def myPositivePower(x: Int, n: Int): Int = applyNtimes(n)(1)((a:Int) => x * a)

  def deferredExecutor(name: String)(f: Int => Int): Int => Int = {
    print("running on deferred executor" + name + "with value: ")
    ((accu: Int) => f(accu))
  }
  def add5(x:Int) = x + 5

  val myDeferredFunction = deferredExecutor("CPU Pool")(add5)
  val result = myDeferredFunction(4)

  print(result)
}
