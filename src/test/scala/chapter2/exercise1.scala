package com.jjoedouglas.FPinScalaExercises.chapter2

import org.scalatest._

class Exercise1Spec extends FlatSpec {
  "fib(n)" must "equal 0 for negative values of n" in {
    assert(Exercise1.fib(-1) == 0)
  }

  "fib(n)" must "equal 0 when n = 0" in {
    assert(Exercise1.fib(0) == 0)
  }

  "fib(n)" must "equal 1 when n = 1" in {
    assert(Exercise1.fib(1) == 1)
  }

  "fib(n)" must "equal 1 when n = 2" in {
    assert(Exercise1.fib(2) == 1)
  }

  "fib(n)" should "equal 55 when n = 10" in {
    assert(Exercise1.fib(10) == 55)
  }
}
