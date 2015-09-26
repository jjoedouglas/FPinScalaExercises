package com.jjoedouglas.FPinScalaExercises.chapter4

import org.scalatest._
import scala.util.Random

class Ch4Ex1 extends FlatSpec {
  "map" must "not apply f if None" in {
    var applied = false;
    val f = (x: Int) => {
      applied = true;
      x;
    }

    Exercise1.map(None)(f)

    assert(!applied)
  }

  it must "apply f if Some" in {
    var applied = false;
    val f = (x: Int) => {
      applied = true;
      x;
    }

    Exercise1.map(Some(1))(f)

    assert(applied)
  }

  it must "apply f to x in Some(x)" in {
    val f = (x: Int) => x + 1;
    val randomInt =(new Random()).nextInt()

    val result = Exercise1.map(Some(randomInt))(f)
    result match {
      case Some(x) => assert(x == f(randomInt))
      case _ => assert(false)
    }
  }

  "flatMap" must "not apply f if None" in {
    var applied = false;
    val f = (x: Int) => {
      applied = true;
      Some(x);
    }

    Exercise1.flatMap(None)(f)

    assert(!applied)
  }

  it must "apply f if Some" in {
    var applied = false;
    val f = (x: Int) => {
      applied = true;
      Some(x);
    }

    Exercise1.flatMap(Some(1))(f)

    assert(applied)
  }

  it must "apply f to x in Some(x)" in {
    val f = (x: Int) => Some(x + 1);
    val randomInt =(new Random()).nextInt()

    val result = Exercise1.flatMap(Some(randomInt))(f)
    result match {
      case Some(x) => assert(x == f(randomInt).get)
      case _ => assert(false)
    }
  }

  "getOrElse" must "not execute default if Some" in {
    var appliedDefault = false

    Exercise1.getOrElse(Some(3))({
      appliedDefault = true;
      1;
    })

    assert(!appliedDefault)
  }

  it must "execute default if None" in {
    var appliedDefault = false

    Exercise1.getOrElse(None)({
      appliedDefault = true;
      1;
    })

    assert(appliedDefault)
  }

  it must "return default if None" in {
    val randomInt = (new Random()).nextInt();

    assert(Exercise1.getOrElse(None){ randomInt;} == randomInt)
  }

  "orElse" must "not apply ob if Some" in {
    var appliedOb = false;

    Exercise1.orElse(Some(1)){
      appliedOb = true;
      Some(3);
    }

    assert(!appliedOb)
  }

  it must "apply ob if None" in {
    var appliedOb = false;

    Exercise1.orElse(None){
      appliedOb = true;
      Some(3);
    }

    assert(appliedOb)
  }

  it must "return result of ob if None" in {
    val randomInt = (new Random()).nextInt();

    val result = Exercise1.orElse(None){Some(randomInt)}

    result match {
      case Some(x) => assert(x == randomInt)
      case None => assert(false)
    }
  }

  "filter" must "not apply predicate if None" in {
    var applied = false;

    Exercise1.filter(None)((x: Nothing) => {
      applied = true;
      false;
    })

    assert(!applied)
  }

  it must "apply predicate if Some" in {
    var applied = false;

    Exercise1.filter(Some(1))((x: Int) => {
      applied = true;
      x == 2
    })

    assert(applied)
  }

  it must "return None if predicate fails for Some" in {
    val result = Exercise1.filter(Some(1))((x: Int) => false)
    assert(result == None)
  }

  it must "return Some if predicate does not fail" in {
    val randomInt = (new Random()).nextInt()

    val result = Exercise1.filter(Some(randomInt))((x: Int) => true)

    result match {
      case Some(x) => assert(x == randomInt)
      case None => assert(false)
    }
  }
}
