package com.jjoedouglas.FPinScalaExercises.chapter4

import org.scalatest._

class Ch4Ex2 extends FlatSpec {
  "variance" must "return none for empty sequence" in {
    val result = Exercise2.variance(Seq.empty[Double])

    assert(result == None)
  }

  it must "return 2 for [1,2,3,4,5]" in {
    Exercise2.variance(Array(1,2,3,4,5)) match {
      case Some(x) => assert(x == 2)
      case None => assert(false)
    }
  }
}
