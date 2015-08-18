package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex4 extends FlatSpec {
  "drop" must "return the original list if no elements are dropped" in {
    assert(Exercise4.drop(List(1,2,3), 0) == List(1,2,3))
  }

  it must "return the list minus the first 2 elements if 2 elements can be dropped" in {
    assert(Exercise4.drop(List(1,2,3), 2) == List(3))
  }

  it must "return the empty list if more elements are dropped than available" in {
    assert(Exercise4.drop(List(1,2), 4) == Nil)
  }

  it must "return the empty list if dropping elements from the empty list" in {
    assert(Exercise4.drop(Nil, 10) == Nil)
  }

  it should "throw an exception if dropping a negative number of elements" in {
    intercept[Exception] {
      Exercise4.drop(List(1,2), -2)
    }
  }
}
