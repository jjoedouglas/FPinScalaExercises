package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex10 extends FlatSpec {
  "foldLeft" must "be able to sum a list" in {
    assert(Exercise10.foldLeft(List(1,2,3), 0)(_ + _) == 6)
  }
}
