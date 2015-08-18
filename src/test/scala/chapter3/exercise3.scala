package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex3 extends FlatSpec {
  "setHead" must "replace first element for multi-element List" in {
    assert(Exercise3.setHead(List(1,2), 3) == List(3,2))
  }

  it must "replace first element for single element list" in {
    assert(Exercise3.setHead(List(1), 7) == List(7))
  }

  it must "not change Nil lists" in {
    assert(Exercise3.setHead(Nil, 10) == Nil)
  }
}
