package com.jjoedouglas.FPinScalaExercises.chapter5

object Exercise6 {
  def headOption[A](stream: Stream[A]): Option[A] = {
    stream.foldRight[Option[A]](None)((a, b) =>
      Some(a)
    )
  }
}
