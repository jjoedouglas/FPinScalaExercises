package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex18 extends FlatSpec {
  "map" must "do addOne" in {
    val l = List(1,2,3)
    assert(Exercise18.map(l)(_ + 1) == Exercise16.addOne(l))
  }

  it must "return nil for nil lists" in {
    assert(Exercise18.map(List[Int]())(_ + 1) == Nil)
  }

  it must "do doublesToStrings" in {
    val l = List(1.0, 2.0, 3.0)
    assert(Exercise18.map(l)(_.toString) == Exercise17.DoublesToStrings(l))
  }
}
