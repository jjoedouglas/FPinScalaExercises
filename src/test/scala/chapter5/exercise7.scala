package com.jjoedouglas.FPinScalaExercises.chapter5

import org.scalatest._

class Ch5Ex7 extends FlatSpec {
  "map" must "apply to all elements of stream" in {
    val stream = Stream(1,2,3)
    val expected = List(2,4,6)

    val actual = Exercise7.map(stream)(_ * 2)

    assert(Exercise1.toList(actual) == expected)
  }

  "filter" must "drop elements out of stream that don't match predicate" in {
    val stream = Stream(1,2,3)
    val expected = List(2)

    val actual = Exercise7.filter(stream)(_ % 2 == 0)

    assert(Exercise1.toList(actual) == expected)
  }

  "append" must "stitch stream onto end of other stream" in {
    val firstStream = Stream(1,2)
    val secondStream = Stream(3,4)
    val expected = List(1,2,3,4)

    val actual = Exercise7.append(firstStream)(secondStream)

    assert(Exercise1.toList(actual) == expected)
  }

  "flatMap" must "expand stream by argument" in {
    val stream = Stream(1,2,3)
    val expected = List("a","a","b","b","c","c")

    val actual = Exercise7.flatMap(stream)(a =>
      if (a == 1) Stream("a","a")
      else if (a == 2) Stream("b","b")
      else Stream("c","c")
    )

    assert(Exercise1.toList(actual) == expected)
  }
}
