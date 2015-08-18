package com.jjoedouglas.FPinScalaExercises.chapter3

import scala.annotation.tailrec

object Exercise12 {
  def reverse[A](as: List[A]): List[A] = {
    Exercise10.foldLeft(as, List[A]())((reversed: List[A], a: A) => Cons(a, reversed))
  }
}
