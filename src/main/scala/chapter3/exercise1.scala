package com.jjoedouglas.FPinScalaExercises.chapter3

import scala.collection.immutable._

object Exercise1 {
  def matchyMatchy(ints: List[Int]): Int = {
    ints match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + List.sum(t)
      case _ => 101
    }
  }
}
