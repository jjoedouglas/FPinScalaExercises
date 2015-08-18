package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise5 {
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Cons(x, rest) => if (f(x)) dropWhile(rest, f) else l
      case Nil => Nil
    }
  }
}
