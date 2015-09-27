package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise19 {
  //could make this stack safe by reversing input list
  //and accumulating filtered elements
  def filter[A](as: List[A])(f: (A => Boolean)): List[A] = as match {
    case Cons(ele, rest) => if(f(ele)) Cons(ele, filter(rest)(f)) else filter(rest)(f)
    case Nil => Nil
  }
}
