package com.jjoedouglas.FPinScalaExercises.chapter2

import scala.annotation.tailrec

object Exercise1 {
  def fib(n: Int): Int = {
    @tailrec def fibHelper(n: Int, a: Int, b: Int): Int =
      if (n == 1 || n == 2) return b
      else fibHelper(n - 1, b, a+b)


    if(n <= 0) 0
    else fibHelper(n, 1, 1)
  }
}
