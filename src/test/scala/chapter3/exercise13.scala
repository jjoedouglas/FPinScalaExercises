package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex13 extends FlatSpec {
  "foldLeftFromFoldRight" must "equal foldLeft for division" in {
    val list = List(1.0,2.0,3.0)
    assert(Exercise13.foldLeftFromFoldRight(list, 1.0)(_ / _) == Exercise10.foldLeft(list, 1.0)(_ /_))
  }

  //These aren't really tests for foldLeftFromFoldRight, but I used them
  //to verify the previous test actually tested what I thought it was.
  /*it must "check" in {
    val list = List(1.0,2.0,3.0)
    assert(Exercise10.foldLeft(list, 1.0)(_ / _) == ((1.0 / 2.0) / 3.0))
  }

  it must "recheck" in {
    val list = List(1.0,2.0,3.0)
    assert(Exercise10.foldLeft(list, 1.0)(_ / _) != List.foldRight(list, 1.0)(_ / _))
  }*/
}
