package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise24 {
  def hasSubsequence[A](sup: List[A], sub:List[A]): Boolean = {
    (sup, sub) match {
      case (_, Nil) => true
      case (Nil, _) => false
      case (Cons(h1, t1), Cons(h2,t2)) => {
        if(h1 == h2) hasSubsequence(t1, t2) || hasSubsequence(t1, sub)
        else hasSubsequence(t1, sub)
        }
    }
  }
}
