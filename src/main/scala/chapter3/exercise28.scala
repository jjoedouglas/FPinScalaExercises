package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise28 {
  def map[A,B](t: Tree[A])(f: A => B): Tree[B] = t match {
    case null => null
    case Leaf(x) => Leaf(f(x))
    case Branch(left, right) => Branch(map(left)(f), map(right)(f))
  }
}
