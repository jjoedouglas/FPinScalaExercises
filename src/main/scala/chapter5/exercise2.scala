package com.jjoedouglas.FPinScalaExercises.chapter5

object Exercise2 {
  def take[A](stream: Stream[A], n: Int): Stream[A] =
    if (n < 0) throw new Exception("n must be 0 or a positive number")
    else if(n == 0) Empty
    else stream match {
      case Empty => Empty
      case Cons(h, t) => Cons(h, () => take(t(), n - 1))
    }

  def drop[A](stream: Stream[A], n: Int): Stream[A] =
    if(n < 0) throw new Exception("n must be 0 or a positive number")
    else if (n == 0) stream
    else stream match {
      case Empty => Empty
      case Cons(h, t) => drop(t(), n-1)
    }
}
