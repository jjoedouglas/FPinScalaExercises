package com.jjoedouglas.FPinScalaExercises.chapter4

import org.scalatest._

class Ch4Ex5 extends FlatSpec {
  "traverse" must "return None if a f(element) == None" in {
    assert(Exercise5.traverse(List(1,2,3))(x => if(x == 2) None else Some(x)) == None)
  }

  it must "apply f to each element" in {
    val elems = List(1,2,3)
    var expected = 1
    Exercise5.traverse(elems)(x => {
      assert(x == expected);
      expected += 1;
      Some(x)
    })
  }

  it must "return result of applying f" in {
    val elems = List(1,2,3)
    val expected = Some(List(2,3,4))

    val actual = Exercise5.traverse(elems)(x => Some(x + 1))

    assert(actual == expected)
  }

  "seqByTraverse" must "return None if any element is None" in {
    assert(Exercise5.seqByTraverse(List(None, Some(2), Some(3))) == None)
    assert(Exercise5.seqByTraverse(List(Some(1), None, Some(3))) == None)
    assert(Exercise5.seqByTraverse(List(Some(1), Some(2), None)) == None)
  }

  it must "return Some(List(1,2,3)) for List(Some(1), Some(2), Some(3))" in {
    assert(Exercise5.seqByTraverse(List(Some(1), Some(2), Some(3))) == Some(List(1,2,3)))
  }

  it must "return Some(Nil) for Nil" in {
    assert(Exercise5.seqByTraverse(Nil) == Some(Nil))
  }
}
