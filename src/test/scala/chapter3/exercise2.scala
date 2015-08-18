package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex2 extends FlatSpec {
  "tail" must "return Some(List(2)) for List(1,2)" in {
    assert(Exercise2.tail(List(1,2)).get == List(2))
  }

  it must "return Some(Nil) for List(1)" in {
    assert(Exercise2.tail(List(1)).get == Nil)
  }

  it must "return None for Nil" in {
    assert(Exercise2.tail(Nil) == None)
  }

  it must "return Some(List(2,3)) for List(1,2,3)" in {
    assert(Exercise2.tail(List(1,2,3)).get == List(2,3))
  }
}
