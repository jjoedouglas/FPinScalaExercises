package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex12 extends FlatSpec {
  "reverse" must "return List(3,2,1) from List(1,2,3)" in {
    assert(Exercise12.reverse(List(1,2,3)) == List(3,2,1))
  }

  it must "return empty list for empty list" in {
    assert(Exercise12.reverse(List()) == List())
  }

  it must "return Nil for Nil" in {
    assert(Exercise12.reverse(Nil) == Nil)
  }
}
