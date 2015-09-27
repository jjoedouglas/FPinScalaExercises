package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise26 {
  def maximum(t: Tree[Int]): Int = {
    def findMax(t: Tree[Int], currentMax: Option[Int]): Option[Int] = (t, currentMax) match {
      case (Leaf(x), None) => Some(x)
      case (Leaf(x), Some(y)) => Some(x max y)
      case (Branch(left, right), cur) => {
        val leftMax = if(left != null) findMax(left, cur) else None
        val rightMax = if(right != null) findMax(right, cur) else None
        (leftMax, rightMax) match {
          case (None, None) => None
          case (None, Some(x)) => Some(x)
          case (Some(x), None) => Some(x)
          case (Some(x), Some(y)) => Some(x max y)
        }
      }
    }

    findMax(t, None) match {
      case Some(x) => x
      case None => throw sys.error("Cannot find maximum of empty tree")
    }
  }
}
