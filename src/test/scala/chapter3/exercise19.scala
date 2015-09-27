package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex19 extends FlatSpec {
  "filter" must "returns 2 for List(1,2,3)(x % 2 == 0)" in {
    assert(Exercise19.filter(List(1,2,3))(_ % 2 == 0) == List(2))
  }

  it must "return Nil for List(1,2,3)((x: Int) => false)" in {
    assert(Exercise19.filter(List(1,2,3))((x: Int) => false) == Nil)
  }
}
