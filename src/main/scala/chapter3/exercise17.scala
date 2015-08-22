package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise17 {
  def DoublesToStrings(doubles: List[Double]): List[String] = doubles match {
    case Cons(ele, rest) => Cons(ele.toString(), DoublesToStrings(rest))
    case Nil => Nil
  }
}
