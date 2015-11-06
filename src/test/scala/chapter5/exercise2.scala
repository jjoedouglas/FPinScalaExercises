package com.jjoedouglas.FPinScalaExercises.chapter5

import org.scalatest._

class Ch5Ex2 extends FlatSpec {
  "take" must "return the first n elements" in {
    val stream = Stream(1,2,3,4,5)
    val expected = List(1,2,3)

    val actual = Exercise1.toList(Exercise2.take(stream, 3))
    assert(actual == expected)
  }

  it must "return all elements if too many requested" in {
    val stream = Stream(1,2,3)
    val expected = List(1,2,3)

    val actual = Exercise1.toList(Exercise2.take(stream, 10))
    assert(actual == expected)
  }

  it must "return empty when 0 elements requested" in {
    val stream = Stream(1,2,3)
    val expected = Empty
    val actual = Exercise2.take(stream, 0)

    assert(actual == expected)
  }

  it must "throw an exception is called for a negative amount" in {
    val stream = Stream(1,2,3)
    intercept[Exception] {
      Exercise2.take(stream, -1)
    }
  }

  "drop" must "return the stream with the first n elements removed" in {
    val stream = Stream(1,2,3,4,5)
    val expected = List(4,5)

    val actual = Exercise1.toList(Exercise2.drop(stream,3))

    assert(actual == expected)
  }

  it must "return the original stream if 0 elements specified" in {
    val stream = Stream(1,2,3)
    val expected = List(1,2,3)

    val actual = Exercise1.toList(Exercise2.drop(stream, 0))

    assert(actual == expected)
  }

  it must "return Empty if more elements are dropped than in the stream" in {
    val stream = Stream(1,2,3)
    val expected = Empty
    val actual = Exercise2.drop(stream, 10)

    assert(actual == expected)
  }

  it must "throw an exception if attempting to drop a negative number of elements" in {
    intercept[Exception] {
      Exercise2.drop(Stream(1,2,3), -1)
    }
  }
}
