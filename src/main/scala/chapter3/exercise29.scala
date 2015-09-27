package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise29 {
  def fold[A,B](t: Tree[A], z: B)(f: A => B)(g: (B,B) => B): B = t match {
    case Leaf(x) => f(x)
    case Branch(left, right) => g(fold(left, z)(f)(g), fold(right, z)(f)(g))
    case null => z
  }
}
