package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex6 extends FlatSpec {
  "init" must "return (1,2,3) for (1,2,3,4)" in {
    assert(Exercise6.init(List(1,2,3,4)) == List(1,2,3))
  }

  it must "return Nil for List(1)" in {
    assert(Exercise6.init(List(1)) == Nil)
  }

  it must "return Nil for Nil" in {
    assert(Exercise6.init(Nil) == Nil)
  }
}
