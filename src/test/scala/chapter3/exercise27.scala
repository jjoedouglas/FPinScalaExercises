package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex27 extends FlatSpec {
  "depth" must "return 1 for leaf" in {
    assert(Exercise27.depth(Leaf(7)) == 1)
  }

  it must "handle branches" in {
    assert(Exercise27.depth(Branch(Leaf(3), Branch(Leaf(5), Leaf(22)))) == 3)
  }

  it must "handle empty branches" in {
    assert(Exercise27.depth(Branch(null, null)) == 1)
  }

  it must "handle null trees" in {
    assert(Exercise27.depth(null) == 0)
  }
}
