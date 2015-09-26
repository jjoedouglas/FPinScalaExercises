package com.jjoedouglas.FPinScalaExercises.chapter4

object Exercise1 {
  def map[A,B](option: Option[A])(f: A => B): Option[B] =
    option match {
      case Some(x) => Some(f(x))
      case None => None
    }

  def flatMap[A,B](option: Option[A])(f: A => Option[B]): Option[B] =
    option match {
      case Some(x) => f(x)
      case None => None
    }

  def getOrElse[A,B>:A](option: Option[A])(default: => B): B =
    option match {
      case Some(x) => x
      case None => default
    }
  def orElse[A,B>:A](option: Option[A])(ob: => Option[B]): Option[B] =
    option match {
      case Some(x) => Some(x)
      case None => ob
    }
  def filter[A](option: Option[A])(f: A => Boolean): Option[A] =
    option match {
      case None => None
      case Some(x) => if (f(x)) Some(x) else None
    }
}
