package com.jjoedouglas.FPinScalaExercises.chapter5

object Exercise3 {
  def takeWhile[A](stream: Stream[A])(p: A => Boolean): Stream[A] =
    stream match {
      case Empty => Empty
      case Cons(h, t) => {
        val head = h()
        if(p(head)) Cons(() => head, () => takeWhile(t())(p))
        else Empty
      }
    }
}
