package com.jjoedouglas.FPinScalaExercises.chapter3

import scala.annotation.tailrec

object Exercise10 {
  @tailrec
  def foldLeft[A,B](as: List[A], z: B)(f: (B, A) => B): B = {
    as match {
      case Nil => z
      case Cons(a, tail) => foldLeft(tail, f(z, a))(f)
    }
  }
}
