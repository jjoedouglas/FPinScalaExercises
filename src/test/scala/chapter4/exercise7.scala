package com.jjoedouglas.FPinScalaExercises.chapter4

import org.scalatest._
import scala.util.Random

class Ch4Ex7 extends FlatSpec {
  "traverse" must "return Left if a f(element) == Left" in {
    assert(Exercise7.traverse(List(1,2,3))(x => if(x == 2) Left(2) else Right(x)) == Left(2))
  }

  it must "apply f to each element" in {
    val elems = List(1,2,3)
    var expected = 1
    Exercise7.traverse(elems)(x => {
      assert(x == expected)
      expected += 1;
      Right(x)
    })
  }

  it must "return result of applying f" in {
    val elems = List(1,2,3)
    val expected = Right(List(2,3,4))

    val actual = Exercise7.traverse(elems)(x => Right(x + 1))

    assert(actual == expected)
  }

  "sequence" must "return Left if any element is Left" in {
    assert(Exercise7.sequence(List(Left(1), Right(2), Right(3))) == Left(1))
    assert(Exercise7.sequence(List(Right(1), Left(2), Right(3))) == Left(2))
    assert(Exercise7.sequence(List(Right(1), Right(2), Left(3))) == Left(3))
  }

  it must "return Right(List(1,2,3)) for List(Right(1), Right(2), Right(3))" in {
    assert(Exercise7.sequence(List(Right(1), Right(2), Right(3))) == Right(List(1,2,3)))
  }

  it must "return Right(Nil) for Nil" in {
    assert(Exercise7.sequence(Nil) == Right(Nil))
  }
}
