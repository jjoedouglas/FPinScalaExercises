package com.jjoedouglas.FPinScalaExercises.chapter5

import org.scalatest._

class Ch5Ex1 extends FlatSpec {
  "toList" must "convert to a list" in {
    val stream = Stream(1,2,3)
    val expectedList = List(1,2,3)

    assert(Exercise1.toList(stream) == expectedList)
  }

  it must "convert to nil for empty stream" in {
    val stream = Empty
    assert(Exercise1.toList(stream) == Nil)
  }
}
