package com.jjoedouglas.FPinScalaExercises.chapter3

object Exercise15 {
  def flatten[A](bumpy: List[List[A]]): List[A] = {
    //big Oh analysis:
    //foldLeft is O(len(bumpy))
    //reverse is O(len(bumpy))
    //append will traverse all elements in as, so O(len(as)) at least
    //  as is also reversed by append, but thankfully not for each iteration, so O(2 * len(as)) is still O(len(as))
    //therefore this ends up O(n)
    Exercise10.foldLeft(Exercise12.reverse(bumpy), List[A]())((as: List[A], result: List[A]) => {
        Exercise14.Append(result, as)
      })
  }
}
