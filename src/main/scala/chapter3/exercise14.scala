package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise14 {
  def Append[A](as: List[A], toAppend: List[A]): List[A] = {
    Exercise10.foldLeft(Exercise12.reverse(as), toAppend)((resultList: List[A], appendElement: A) => Cons(appendElement, resultList))
  }
}
