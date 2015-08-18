package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex9 extends FlatSpec {
  "length" must "return 0 for empty list" in {
    assert(Exercise9.length(Nil) == 0)
  }

  it must "return 3 for List(1,1,1)" in {
    assert(Exercise9.length(List(1,1,1)) == 3)
  }
}
