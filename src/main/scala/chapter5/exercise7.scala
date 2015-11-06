package com.jjoedouglas.FPinScalaExercises.chapter5

object Exercise7 {
  def map[A,B](stream: Stream[A])(f: A => B): Stream[B] = {
    stream.foldRight(Stream.empty[B])((a,b) => Stream.cons(f(a), b))
  }

  def filter[A,B](stream: Stream[A])(p: A => Boolean): Stream[A] = {
    stream.foldRight(Stream.empty[A])((a,b) =>
      if(p(a)) Stream.cons(a, b)
      else b
    )
  }

  def append[A,B>:A](stream: Stream[A])(toAppend: Stream[B]): Stream[B] = {
    stream.foldRight(toAppend)((a, b) => Stream.cons(a, b))
  }

  def flatMap[A,B](stream: Stream[A])(f: A => Stream[B]): Stream[B] = {
    stream.foldRight(Stream.empty[B])((a,b) => append(f(a))(b))
  }
}
