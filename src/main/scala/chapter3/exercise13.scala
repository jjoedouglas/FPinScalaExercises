package com.jjoedouglas.FPinScalaExercises.chapter3

import scala.annotation.tailrec

object Exercise13 {
  def foldLeftFromFoldRight[A,B](as: List[A], z: B)(f: (B, A) => B): B = {
    List.foldRight(Exercise12.reverse(as), z)((a, b) => f(b, a))
  }
}
