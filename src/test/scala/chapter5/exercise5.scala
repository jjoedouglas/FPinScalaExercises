package com.jjoedouglas.FPinScalaExercises.chapter5

import org.scalatest._

class Ch5Ex5 extends FlatSpec {
  "takeWhile via foldRight" must "return elements that match predicate" in {
    val stream = Stream(1,2,3,4,5)
    val expected = List(1,2,3)

    val actual = Exercise1.toList(Exercise5.takeWhile(stream)(_ <= 3))

    assert(expected == actual)
  }

  it must "return empty if first element doesn't match predicate" in {
    val stream = Stream(1,2,3)
    val expected = Empty

    val actual = Exercise5.takeWhile(stream)(_ > 10)

    assert(expected == actual)
  }

  it must "return the entire stream if predicate matches all elements" in {
    val stream = Stream(1,2,3,4)
    val expected = List(1,2,3,4)

    val actual = Exercise1.toList(Exercise5.takeWhile(stream)(_ < 10))

    assert(expected == actual)
  }
}
