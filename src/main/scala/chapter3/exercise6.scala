package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise6 {
  def init[A](l: List[A]): List[A] = {
    l match {
      case Nil => Nil
      case Cons(x, Nil) => Nil
      case Cons(x, rest @ Cons(_, _)) => Cons(x, init(rest))
    }
  }
}
