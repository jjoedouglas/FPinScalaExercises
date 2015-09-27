package com.jjoedouglas.FPinScalaExercises.chapter4

object Exercise4 {
  def sequence[A](a: List[Option[A]]): Option[List[A]] = {
    a match {
      case Nil => Some(Nil)
      case head :: tail => Exercise1.flatMap(head)(h => 
        Exercise1.map(sequence(tail))(newTail => h +: newTail)
      )
    }
  }
}
