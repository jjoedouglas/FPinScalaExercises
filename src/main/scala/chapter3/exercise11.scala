package com.jjoedouglas.FPinScalaExercises.chapter3

import scala.annotation.tailrec

object Exercise11 {
  def sum(as: List[Int]): Int = Exercise10.foldLeft(as, 0)(_ + _)
  def product(as: List[Int]): Int = Exercise10.foldLeft(as, 1)(_ * _)
  def length[A](as: List[A]): Int = Exercise10.foldLeft(as, 0)((x: Int, dontCare: A) => x + 1)
}
