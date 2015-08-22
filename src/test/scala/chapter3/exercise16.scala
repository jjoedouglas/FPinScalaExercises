package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex16 extends FlatSpec {
  "addOne" must "return List(2,3,4) for List(1,2,3)" in {
    assert(Exercise16.addOne(List(1,2,3)) == List(2,3,4))
  }

  it must "return nil for nil" in {
    assert(Exercise16.addOne(Nil) == Nil)
  }
}
