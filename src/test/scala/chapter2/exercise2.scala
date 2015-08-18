package com.jjoedouglas.FPinScalaExercises.chapter2

import org.scalatest._

class Ch2Ex2 extends FlatSpec {
  private val unsortedArray = Array(1,3,2);
  private val sortedArray = Array(1,2,3);
  private val sameElementArray = Array(3,3,3);
  private val singleElementArray = Array(3);

  private val alwaysTrue = (_: Any, _: Any) => true
  private val alwaysFalse = (_: Any, _: Any) => false
  private val orthographic = (lhs: Int, rhs: Int) => lhs <= rhs

  "isSorted(as, ordered)" must "equal true if ordered always returns true" in {
    assert(Exercise2.isSorted(Array(1,3,2), alwaysTrue))
  }

  it must "equal true if empty array provided" in {
    assert(Exercise2.isSorted(Array(), alwaysFalse))
  }

  it must "equal false if ordered always returns false and array has multiple elements" in {
    assert(false == Exercise2.isSorted[Int](sortedArray, alwaysFalse))
  }

  it must "equal true for single element array" in {
    assert(Exercise2.isSorted(singleElementArray, alwaysFalse))
  }

  it must "equal true for a sorted array" in {
    assert(Exercise2.isSorted(sortedArray, orthographic))
  }

  it must "equal false for an unsorted array" in {
    assert(false == Exercise2.isSorted(unsortedArray, orthographic))
  }

  it must "equal true for an array with the same element repeated" in {
    assert(Exercise2.isSorted(sameElementArray, orthographic))
  }
}
