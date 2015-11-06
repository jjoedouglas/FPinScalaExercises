package com.jjoedouglas.FPinScalaExercises.chapter5

object Exercise5 {
  def takeWhile[A](stream: Stream[A])(p: A => Boolean): Stream[A] =
    stream.foldRight(Stream.empty[A])((a, b) =>
        if(p(a)) Stream.cons(a, b)
        else Stream.empty
      )
}
