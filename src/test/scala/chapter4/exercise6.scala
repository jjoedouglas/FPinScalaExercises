package com.jjoedouglas.FPinScalaExercises.chapter4

import org.scalatest._
import scala.util.Random

class Ch4Ex6 extends FlatSpec {
  "map" must "not apply f if Left" in {
    var applied = false;
    val f = (x: Int) => {
      applied = true;
      x;
    }

    Exercise6.map(Left(1))(f)

    assert(!applied)
  }

  it must "apply f if Right" in {
    var applied = false;
    val f = (x: Int) => {
      applied = true;
      x;
    }

    Exercise6.map(Right(1))(f)

    assert(applied);
  }

  it must "return Right(f(x)) if Right(x)" in {
    val f = (x: Int) => x + 1
    val randomInt = (new Random()).nextInt()

    val result = Exercise6.map(Right(randomInt))(f)

    result match {
      case Left(_) => assert(false)
      case Right(x) => assert(x == f(randomInt))
    }
  }

  "flatMap" must "not apply f if Left" in {
    var applied = false;
    val f = (x: Int) => {
      applied = true;
      Right(x);
    }

    Exercise6.flatMap(Left(1))(f)

    assert(!applied)
  }

  it must "apply f if Right" in {
    var applied = false;
    val f = (x: Int) => {
      applied = true;
      Right(x);
    }

    Exercise6.flatMap(Right(1))(f)

    assert(applied)
  }

  it must "return Right(f(x)) for Right(x)" in {
    val randomInt = (new Random()).nextInt()
    val f = (x: Int) => Right(x + 1)

    val result = Exercise6.flatMap(Right(randomInt))(f)

    result match {
      case Left(_) => fail()
      case Right(x) => assert(x == f(randomInt).value)
    }
  }

  "orElse" must "not evaluate if Right" in {
    Exercise6.orElse(Right(1))({fail(); Right(2)})
  }

  it must "evaluate default if Left" in {
    var evaluated = false;
    Exercise6.orElse(Left(1))({evaluated = true; Right(2)})
    assert(evaluated)
  }

  it must "return default if Left" in {
    val randomInt = (new Random()).nextInt()
    val result = Exercise6.orElse(Left(1))({Right(randomInt)})
    result match {
      case Left(_) => fail()
      case Right(x) => assert(x == randomInt)
    }
  }

  "map2" must "return Left if either argument is Left" in {
    assert(Exercise6.map2(Left(1))(Left(2))((a: Nothing, b: Nothing) => a) == Left(1))
    assert(Exercise6.map2(Left(1))(Right(2))((a: Nothing, b: Int) => a) == Left(1))
    assert(Exercise6.map2(Right(1))(Left(2))((a: Int, b: Nothing) => a) == Left(2))
  }

  it must "apply f to both arguments" in {
    val random = new Random()
    val randomA = random.nextInt()
    val randomB = random.nextInt()

    Exercise6.map2(Right(randomA))(Right(randomB))((a, b) => {
      assert(a == randomA)
      assert(b == randomB)
      a
    })
  }

  it must "return Right(f(a,b))" in {
    val random = new Random()
    val randomA = random.nextInt()
    val randomB = random.nextInt()
    val f = (a: Int, b: Int) => a + b

    val result = Exercise6.map2(Right(randomA))(Right(randomB))(f)
    result match {
      case Right(x) => assert(x == f(randomA, randomB))
      case _ => fail()
    }
  }
}
