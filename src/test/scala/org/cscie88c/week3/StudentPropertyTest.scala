//package org.cscie88c.week3
//import org.scalatest.funsuite.AnyFunSuite
//import com.sun.tools.javac.jvm.Gen
//import org.scalacheck._
//import jdk.nashorn.internal.objects.NativeRegExp.test
//import org.scalatest.funsuite.AnyFunSuite
//import org.scalatest.matchers.should.Matchers
//import org.scalatest.Inspectors.forAll
//import org.scalatest.flatspec._
//import org.scalatest.matchers.should._
//
//import scala.sys.Prop
//
//class StudentPropertyTest extends AnyFunSuite with Matchers with ScalaCheckPropertyChecks {
//
//  val studentGen: Gen[Student] = for {
//    name <- Gen.alphaStr
//    email <- Gen.alphaStr
//    subject <- Gen.oneOf("Physics", "Chemistry")
//    score <- Gen.chooseNum(0, 100)
//  } yield Student(name, email, subject, score)
//
//}
