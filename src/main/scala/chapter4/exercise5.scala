package com.jjoedouglas.FPinScalaExercises.chapter4

object Exercise5 {
  def traverse[A,B](a: List[A])(f: A => Option[B]): Option[List[B]] =
    a match {
      case Nil => Some(Nil)
      case head :: tail => {
        Exercise1.flatMap(f(head))(h =>
          Exercise1.map(traverse(tail)(f))(newTail => h +: newTail)
        )
      }
    }
  def seqByTraverse[A](a: List[Option[A]]): Option[List[A]] = traverse(a)(x => x)
}
