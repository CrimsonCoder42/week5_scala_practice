package org.cscie88c.week4

import scala.collection.immutable.ListMap
//https://www.geeksforgeeks.org/scala-lists/
object ListUtils extends App{
  // complete the function below
  def initDoubleList(initValue: Double)(size: Int): List[Double] = List.fill(size)(initValue)

  // complete the functions below using currying
  def ones: Int => List[Double] = initDoubleList(1.0)
  def zeros: Int => List[Double] = initDoubleList(0.0)

  // complete the functions below
  //https://www.w3resource.com/scala-exercises/list/scala-list-exercise-22.php
  def charCounts(sentence: String): Map[Char, Int] = sentence
    .toCharArray()
    .filterNot(_.isWhitespace)
    .groupBy(el => el)
    .map(e => (e._1, e._2.length))

  // sort by smallest to greatest and take la-st nth.
  //https://www.geeksforgeeks.org/how-to-sort-a-scala-map-by-value/
  def topN(n: Int)(frequencies: Map[Char, Int]): Map[Char, Int] = ListMap(frequencies
    .toSeq
    .sortWith(_._2 > _._2):_*)
    .take(n)


}
