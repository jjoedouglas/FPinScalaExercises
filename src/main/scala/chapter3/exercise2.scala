package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise2 {
  //other options for handling Nil case:
  //1. Throw an exception. Option is better by making potential
  //  runtime error into compile time
  //2. Return Some(Nil). Doesn't make sense, Nil doesn't have a tail.
  def tail[A](xs: List[A]): Option[List[A]] = {
    xs match {
      case Cons(_, rest) => Some(rest)
      case Nil => None
    }
  }
}
