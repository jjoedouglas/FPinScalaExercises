package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise20 {
  def flatmap[A,B](as: List[A])(f: A => List[B]): List[B] = as match {
    case Nil => Nil
    case Cons(a, rest) => Exercise14.Append(f(a), flatmap(rest)(f))
  }
}
