package com.jjoedouglas.FPinScalaExercises.chapter4

sealed trait Option[+A]
case class Some[+A] (get: A) extends Option[A]
case object None extends Option[Nothing]

object Option {
  def mean(xs: Seq[Double]): Option[Double] =
    if (xs.isEmpty) None
    else Some(xs.sum / xs.length)
}
