package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex17 extends FlatSpec {
  "doublesToString" must "return List(\"1.0\", \"2.0\") for List(1,2)" in {
    assert(Exercise17.DoublesToStrings(List(1,2)) == List("1.0", "2.0"))
  }
}
