package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class ch3Ex21 extends FlatSpec {
  "filter" must "filter by predicate" in {
    assert(Exercise21.filter(List(1,2,3))(_ % 2 == 0) == List(2))
  }
}
