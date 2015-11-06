package com.jjoedouglas.FPinScalaExercises.chapter5

import org.scalatest._

class Ch5Ex6 extends FlatSpec {
  "headOption" must "return Some(a) for non-empty stream" in {
    val stream = Stream(1,2,3)
    val expected = Some(1)

    assert(Exercise6.headOption(stream) == expected)
  }

  it must "return None for empty stream" in {
    assert(Exercise6.headOption(Empty) == None)
  }
}
