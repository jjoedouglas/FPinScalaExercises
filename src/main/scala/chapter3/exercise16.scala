package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise16 {
  def addOne(ints: List[Int]): List[Int] = ints match {
    case Cons(ele, rest) => Cons(ele + 1, addOne(rest))
    case Nil => Nil
  }
}
