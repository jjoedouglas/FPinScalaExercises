package com.jjoedouglas.FPinScalaExercises.chapter4

object Exercise6 {
  def map[A,B,E](either: Either[E,A])(f: A => B): Either[E,B] =
    either match {
      case Left(e) => Left(e)
      case Right(a) => Right(f(a))
    }

  def flatMap[A,B,E](either: Either[E,A])(f: A => Either[E, B]): Either[E, B] =
    either match {
      case Left(e) => Left(e)
      case Right(a) => f(a)
    }
  def orElse[A,B>:A,E](either: Either[E,A])(b: => Either[E,B]): Either[E, B] =
    either match {
      case Left(e) => b
      case Right(_) => either
    }
  def map2[A,B,C,E](either: Either[E,A])(eitherB: Either[E, B])(f: (A, B) => C): Either[E, C] =
    Exercise6.flatMap(either)(a => Exercise6.map(eitherB)(b =>f(a, b)))
}
