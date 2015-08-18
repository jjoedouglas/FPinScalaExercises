package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise3 {
  def setHead[A](xs: List[A], x: A): List[A] = {
    xs match {
      case Cons(_, rest) => Cons(x, rest)
      case Nil => Nil
    }
  }
}
