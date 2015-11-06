package com.jjoedouglas.FPinScalaExercises.chapter5

import org.scalatest._

class Ch5Ex4 extends FlatSpec {
  "forAll" must "return true for an empty stream" in {
    assert(Exercise4.forAll(Empty)(x => false))
  }

  it must "return true if all elements match predicate in stream" in {
    assert(Exercise4.forAll(Stream(1,2,3))(_ < 5))
  }

  it must "return false if any element does not match predicate in stream" in {
    assert(!Exercise4.forAll(Stream(1,2,3))(_ == 2))
  }
}
