package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise22 {
  def zipAddInts(lhs: List[Int], rhs: List[Int]): List[Int] = (lhs,rhs) match {
    case (Nil, _) => Nil
    case (_, Nil) => Nil
    case (Cons(lhsEle, lhsRest), Cons(rhsEle, rhsRest)) => Cons(lhsEle + rhsEle, zipAddInts(lhsRest, rhsRest))
  }
}
