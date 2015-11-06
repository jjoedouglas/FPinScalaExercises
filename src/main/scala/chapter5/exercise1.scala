package com.jjoedouglas.FPinScalaExercises.chapter5


object Exercise1 {
  def toList[A](stream: Stream[A]): List[A] =
    stream match {
      case Empty => Nil
      case Cons(h, t) => h() +: Exercise1.toList(t())
    }
}
