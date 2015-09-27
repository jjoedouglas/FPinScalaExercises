package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex24 extends FlatSpec {
  "hasSubsequence" must "return true for nil subsequence" in {
    assert(Exercise24.hasSubsequence(Nil, Nil) == true)
    assert(Exercise24.hasSubsequence(List(1,2,3), Nil) == true)
  }

  it must "return false for nil super-sequence and non-nil subsequence" in {
    assert(Exercise24.hasSubsequence(Nil, List(1,2,3)) == false)
  }

  it must "return true for the same lists" in {
    val list = List(1,2,3)
    assert(Exercise24.hasSubsequence(list, list) == true)
  }

  it must "return true for subsequence in list" in {
    assert(Exercise24.hasSubsequence(List(1,2,3), List(2)) == true)
    assert(Exercise24.hasSubsequence(List(1,2,3), List(1,2)) == true)
    assert(Exercise24.hasSubsequence(List(1,1,2,3), List(1,2)) == true)
  }

  it must "return false for subsequence not in list" in {
    assert(Exercise24.hasSubsequence(List(1,2,3), List(7)) == false)
    assert(Exercise24.hasSubsequence(List(1,2,3), List(3,2)) == false)
    assert(Exercise24.hasSubsequence(List(1,2,3), List(1,1)) == false)
  }
}
