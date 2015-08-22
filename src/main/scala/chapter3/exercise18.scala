package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise18 {
  def map[A,B](l: List[A])(f: A => B): List[B] = l match {
    case Nil => Nil
    case Cons(ele, rest) => Cons(f(ele), map(rest)(f))
  }
}
