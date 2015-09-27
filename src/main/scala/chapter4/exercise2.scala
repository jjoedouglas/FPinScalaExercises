package com.jjoedouglas.FPinScalaExercises.chapter4

object Exercise2 {
  def variance(xs: Seq[Double]): Option[Double] = {
    Exercise1.flatMap(Option.mean(xs))((m: Double) =>
      Option.mean(xs.map((x: Double) => math.pow(x - m, 2)))
    )
  }
}
