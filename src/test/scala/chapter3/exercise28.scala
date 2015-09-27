package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex28 extends FlatSpec {
  "map" must "be able to add one to tree" in {
    val originalTree = Branch(Leaf(1), Branch(Leaf(2), Leaf(5)))
    val expectedTree = Branch(Leaf(2), Branch(Leaf(3), Leaf(6)))

    assert(Exercise28.map(originalTree)(_ + 1) == expectedTree)
  }

  it must "handle null trees" in {
    assert(Exercise28.map(null)((x: Int) => x + 1) == null)
  }
}
