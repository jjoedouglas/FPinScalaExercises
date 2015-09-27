package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex26 extends FlatSpec {
  "maximum" must "return element for Leaf" in {
    assert(Exercise26.maximum(Leaf(7)) == 7)
  }

  it must "return maximum element in symmetric tree" in {
    assert(Exercise26.maximum(Branch(Leaf(1), Leaf(2))) == 2)
  }

   it must "handle asymmetric trees" in {
    assert(Exercise26.maximum(Branch(Leaf(2), Branch(Leaf(3), Leaf(1)))) == 3)
    assert(Exercise26.maximum(Branch(Leaf(3), Branch(null, Leaf(5)))) == 5)
   }
}
