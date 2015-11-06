package com.jjoedouglas.FPinScalaExercises.chapter5

object Exercise4 {
  def forAll[A](stream: Stream[A])(p: A => Boolean): Boolean =
    stream match {
      case Empty => true
      case Cons(h, t) => {
        if(p(h())) forAll(t())(p)
        else false
      }
    }
}
