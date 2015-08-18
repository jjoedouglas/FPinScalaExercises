package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise9 {
  def length[A] (as: List[A]): Int = List.foldRight(as, 0)((x, y) => 1 + y)
}
