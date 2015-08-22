package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex25 extends FlatSpec {
  "size" must "return 1 for leaf" in {
    assert(Exercise25.size(Leaf(7)) == 1)
  }

  it must "return size of left and right branches plus one" in {
    val simpleTree = Branch(Leaf("left"), Leaf("right"))
    assert(Exercise25.size(simpleTree) == 3)
  }

  it must "handle asymmetric trees" in {
    val asymetricTree = Branch(null, Leaf("right"))
    assert(Exercise25.size(asymetricTree) == 2)
  }
}
