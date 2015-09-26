package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex5 extends FlatSpec {
  "dropWhile" should "return list without preceding elements for which predicate true" in {
    assert(Exercise5.dropWhile(List(1,2,3,4), (x: Int) => x < 3) == List(3,4))
  }

  it should "return list if predicate returns false" in {
    assert(Exercise5.dropWhile(List(1,2,3), (x: Int) => false) == List(1,2,3))
  }

  it should "return Nil if predicate always returns true" in {
    assert(Exercise5.dropWhile(List(1,2,3), (x: Int) => true) == Nil)
  }

  it should "return Nil if list is nil" in {
    assert(Exercise5.dropWhile(Nil, (x: Int) => true) == Nil)
    assert(Exercise5.dropWhile(Nil, (x: Int) => false) == Nil)
  }
}
