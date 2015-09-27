package com.jjoedouglas.FPinScalaExercises.chapter4

object Exercise7 {
  def traverse[E,A,B](as: List[A])(f: A => Either[E,B]): Either[E, List[B]] =
    as match {
      case Nil => Right(Nil)
      case head :: tail => {
        Exercise6.flatMap(f(head))(h =>
          Exercise6.map(traverse(tail)(f))(newTail => h +: newTail))
      }
    }

  def sequence[E,A,B](eithers: List[Either[E,A]]): Either[E, List[A]] =
      traverse(eithers)(x => x)
}
