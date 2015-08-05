package com.jjoedouglas.FPinScalaExercises.chapter2

object Exercise2 {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    as match {
      case Array() => true
      case Array(_) => true
      case Array(_, _, _*) => as.zip(as.drop(1)).map({ case (x, y) => ordered(x, y)}).reduce(_ && _)
    }
  }
}
