package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise21 {
  def filter[A](as: List[A])(f: A => Boolean) = Exercise20.flatmap(as)(a => if(f(a)) List(a) else Nil)
}
