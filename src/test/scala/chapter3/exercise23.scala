package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex23 extends FlatSpec {
  "zipWith" must "combine lists using function" in {
    assert(Exercise23.zipWith(List(1,2), List(3,4))(_ + _) == List(4,6))
    assert(Exercise23.zipWith(List(1,2), List(3,4))(_.toString() + _.toString()) == List("13", "24"))
  }
}
