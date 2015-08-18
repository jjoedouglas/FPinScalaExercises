package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise4 {
  def drop[A](l: List[A], n: Int): List[A] = {
    if (n < 0) throw new Exception("n must be 0 or a positive number")
    if (n == 0) return l
    else
      Exercise2.tail(l) match {
        case Some(rest) => drop(rest, n - 1)
        case None => Nil
      }
  }
}
