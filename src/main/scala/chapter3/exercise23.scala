package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise23 {
  def zipWith[A,B](lhs: List[A], rhs: List[A])(f: (A, A) => B): List[B] = (lhs, rhs) match {
    case (Nil, _) => Nil
    case (_, Nil) => Nil
    case(Cons(h1, t1), Cons(h2, t2)) => Cons(f(h1, h2), zipWith(t1, t2)(f))
  }
}
