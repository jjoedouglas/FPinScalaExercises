package com.jjoedouglas.FPinScalaExercises.chapter4

object Exercise3 {
  def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = {
    Exercise1.flatMap(a)(valA => Exercise1.map(b)(valB => f(valA, valB)))
    /*
    Personally, I think the match expression is more readable
    but the book said to try to avoid them
    (a, b) match {
      case (None, _) => None
      case (_, None) => None
      case (Some(x), Some(y)) => Some(f(x,y))
    }*/
  }
}
