package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise25 {
  def size[_](t: Tree[_]): Int = t match {
    case Leaf(_) => 1
    case Branch(left, right) => size(left) + size(right) + 1
    case null => 0
  }
}
