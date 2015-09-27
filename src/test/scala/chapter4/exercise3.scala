package com.jjoedouglas.FPinScalaExercises.chapter4

import org.scalatest._
import scala.util.Random

class Ch4Ex3 extends FlatSpec {
  "map2" must "return None if either argument is None" in {
    assert(Exercise3.map2(None, None)((a, b) => a) == None)
    assert(Exercise3.map2(None, Some(1))((a, b) => a) == None)
    assert(Exercise3.map2(Some(1), None)((a, b) => a) == None)
  }

  it must "apply f to both arguments" in {
    val random = new Random()
    val randomA = random.nextInt()
    val randomB = random.nextInt()

    Exercise3.map2(Some(randomA), Some(randomB))((a, b) => {
      assert(a == randomA)
      assert(b == randomB)
      a
    })
  }

  it must "return Some(f(a,b))" in {
    val random = new Random()
    val randomA = random.nextInt()
    val randomB = random.nextInt()
    val f = (a: Int, b: Int) => a + b

    val result = Exercise3.map2(Some(randomA), Some(randomB))(f)
    result match {
      case Some(x) => assert(x == f(randomA, randomB))
      case _ => assert(false)
    }
  }
}
