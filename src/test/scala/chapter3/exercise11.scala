package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._
import scala.util.Random

class Ch3Ex11 extends FlatSpec {
  "sum" must "handle empty list" in {
    assert(Exercise11.sum(List()) == 0)
  }

  it must "handle nil list" in {
    assert(Exercise11.sum(Nil) == 0)
  }

  it must "equal 10 for list(1,2,3,4)" in {
    assert(Exercise11.sum(List(1,2,3,4)) == 10)
  }

  it must "equal the sum of the previous list plus new element" in {
    val random = new Random()
    val originalList = List(
      random.nextInt(),
      random.nextInt(),
      random.nextInt(),
      random.nextInt())
    val originalSum = Exercise11.sum(originalList)
    val newElement = random.nextInt()
    val newList = Cons(newElement, originalList)
    assert(Exercise11.sum(newList) == originalSum + newElement)
  }

  "product" must "handle empty list" in {
    assert(Exercise11.product(List()) == 1)
  }

  it must "handle nil list" in {
    assert(Exercise11.product(Nil) == 1)
  }

  it must "equal 24 for list(1,2,3,4)" in {
    assert(Exercise11.product(List(1,2,3,4)) == 24)
  }

  it must "equal the product of the previous list times new element" in {
    //while computing the product for this list it is VERY likely to overflow
    //however that isn't an issue since the relationship should still hold
    //it should still deterministically reach the same conclusion
    val random = new Random()
    val originalList = List(
      random.nextInt(),
      random.nextInt(),
      random.nextInt(),
      random.nextInt())
    val originalProduct = Exercise11.product(originalList)
    val newElement = random.nextInt()
    val newList = Cons(newElement, originalList)
    assert(Exercise11.product(newList) == originalProduct * newElement)
  }

  "length" must "return 0 for empty list" in {
    assert(Exercise11.length(List()) == 0)
  }

  it must "return 0 for nil" in {
    assert(Exercise11.length(Nil) == 0)
  }

  it must "return 3 for List(1,2,3)" in {
    assert(Exercise11.length(List(1,2,3)) == 3)
  }
}
