package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex15 extends FlatSpec {
  "flatten" must "return List(1,2,3,4) for List(List(1,2), List(3, 4))" in {
    assert(Exercise15.flatten(List(List(1,2), List(3, 4))) == List(1,2,3,4))
  }

  it must "return List(1,2,3) for List(Nil, List(1), Nil, List(2,3))" in {
    assert(Exercise15.flatten(List(Nil, List(1), Nil, List(2,3))) == List(1,2,3))
  }

  it must "return Nil for List(Nil, Nil, Nil)" in {
    assert(Exercise15.flatten(List(Nil, Nil, Nil)) == Nil)
  }
}
