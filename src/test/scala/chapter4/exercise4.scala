package com.jjoedouglas.FPinScalaExercises.chapter4

import org.scalatest._
import scala.util.Random

class Ch4Ex4 extends FlatSpec {
  "sequence" must "return None if any element is None" in {
    assert(Exercise4.sequence(List(None, Some(2), Some(3))) == None)
    assert(Exercise4.sequence(List(Some(1), None, Some(3))) == None)
    assert(Exercise4.sequence(List(Some(1), Some(2), None)) == None)
  }

  it must "return Some(List(1,2,3)) for List(Some(1), Some(2), Some(3))" in {
    assert(Exercise4.sequence(List(Some(1), Some(2), Some(3))) == Some(List(1,2,3)))
  }

  it must "return Some(Nil) for Nil" in {
    assert(Exercise4.sequence(Nil) == Some(Nil))
  }
}
