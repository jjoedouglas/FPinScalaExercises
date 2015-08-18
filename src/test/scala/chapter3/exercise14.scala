package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex14 extends FlatSpec {
  "Append" must "return List(1,2,3,4) for List(1,2), List(3,4)" in {
    assert(Exercise14.Append(List(1,2), List(3,4)) == List(1,2,3,4))
  }

  it must "return List(4,5) for List(4,5), Nil" in {
    assert(Exercise14.Append(List(4,5), Nil) == List(4,5))
  }

  it must "return List(6,7) for Nil, List(6,7)" in {
    assert(Exercise14.Append(Nil, List(6,7)) == List(6,7))
  }

  it must "return Nil for Nil, Nil" in {
    assert(Exercise14.Append(Nil, Nil) == Nil)
  }
}
