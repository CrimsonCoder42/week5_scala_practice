package org.cscie88c.week3

final case class Student(name: String, email: String, subject: String, score: Int) {

}

object Student {
  def validateEmail(student: Student): Boolean = student.email.contains("@")

  def averageScoreBySubject(subject: String, studentList: List[Student]): Double = {
    val scoreFilter = studentList.filter(_.subject.equals(subject)).map(_.score)
    val averageScore = scoreFilter.sum / scoreFilter.size
    if(scoreFilter.nonEmpty) averageScore.toDouble else 0.0
  }

  def averageScoreByStudent(student: Student, studentList: List[Student]): Double = {
    val scoreFilter = studentList.filter(_.name.equals(student.name)).map(_.score)
    val averageScore = scoreFilter.sum / scoreFilter.size
    if (scoreFilter.nonEmpty) averageScore.toDouble else 0.0
  }

}
