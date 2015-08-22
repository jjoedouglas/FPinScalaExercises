package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise27 {
  def depth[A](t: Tree[A]): Int = t match {
    case null => 0
    case Leaf(_) => 1
    case Branch(left, right) => 1 + (depth(left) max depth(right))
  }
}
