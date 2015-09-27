package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex22 extends FlatSpec {
  "zipAddInts" must "add corresponding elements" in {
    assert(Exercise22.zipAddInts(List(1,2,3), List(4,5,6)) == List(5,7,9))
  }

  it must "end early if no matching element found" in {
    assert(Exercise22.zipAddInts(List(1,2,3), List(1)) == List(2))
    assert(Exercise22.zipAddInts(List(7), List(4,5)) == List(11))
  }
}
