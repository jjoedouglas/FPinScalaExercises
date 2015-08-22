package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class ch3Ex20 extends FlatSpec {
  "flatmap" must "return List(1,1,2,2,3,3) for doubling function" in {
    assert(Exercise20.flatmap(List(1,2,3))(i => List(i, i)) == List(1,1,2,2,3,3))
  }

  it must "return Nil for nil list" in {
    assert(Exercise20.flatmap(Nil)(List(_)) == Nil)
  }
}
