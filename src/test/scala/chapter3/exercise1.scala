package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex1 extends FlatSpec {
  "matchyMatchy" must "return 3 for List(1,2,3,4,5)" in {
    assert(Exercise1.matchyMatchy(List(1,2,3,4,5)) == 3)
  }
}
