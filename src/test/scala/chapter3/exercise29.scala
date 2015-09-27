package com.jjoedouglas.FPinScalaExercises.chapter3

import org.scalatest._

class Ch3Ex29 extends FlatSpec {
  "fold" must "be able to implement size" in {
    val tree = Branch(Leaf(1), Branch(Leaf(2), Leaf(3)))
    val leafValue = (x: Int) => 1
    val combineSizes = (x: Int, y: Int) => x + y + 1
    assert(Exercise29.fold(tree, 0)(leafValue)(combineSizes) == Exercise25.size(tree))
    val treeWithNulls = Branch(Leaf(1), Branch(null, Leaf(3)))
    assert(Exercise29.fold(treeWithNulls, 0)(leafValue)(combineSizes) == Exercise25.size(treeWithNulls))
  }

  it must "be able to implement maximum" in {
    var tree = Branch(Leaf(1), Branch(Leaf(2), Leaf(3)))
    val leafValue: Int => Option[Int] = (x: Int) => Some(x)
    val maxBranch = (x: Option[Int], y: Option[Int]) => (x, y) match {
      case (Some(x), Some(y)) => Some(x max y)
      case (None, Some(x)) => Some(x)
      case (Some(x), None) => Some(x)
      case (None, None) => None
    }
    assert(Exercise29.fold(tree, None: Option[Int])(leafValue)(maxBranch).get == Exercise26.maximum(tree))
  }

  it must "be able to implement depth" in {
    val tree = Branch(Leaf(1), Branch(Leaf(2), Leaf(3)))
    val leafValue = (x: Int) => 1
    val branchDepth = (x: Int, y: Int) => (x max y) + 1
    assert(Exercise29.fold(tree, 0)(leafValue)(branchDepth) == Exercise27.depth(tree))
  }

  it must "be able to implement map" in {
    val tree = Branch(Leaf(1), Branch(Leaf(2), Leaf(3)))
    //the type of a mapped tree will be (f: Int => A) => Tree[A]
    def leafValue[A](x: Int): (Int => A) => Tree[A] =
      ((f: Int => A) => Leaf(f(x)))
    def branch[A](left: (Int => A) => Tree[A], right: (Int => A) => Tree[A]): (Int => A) => Tree[A] =
      (f: Int => A) => Branch(left(f), right(f))
    def neutral[A](): (Int => A) => Tree[A] = (f: Int => A) => null
    assert(Exercise29.fold(tree, neutral[Int]())(leafValue)(branch)((x: Int) => x + 1) == Exercise28.map(tree)(_ + 1))
  }
}
