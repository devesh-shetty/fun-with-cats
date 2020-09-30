package com.deveshshetty.exercise.library

trait Printable[A] {
  def format(value: A): String
}

object PrintableInstances {
  implicit val stringPrintable: Printable[String] =
    (value: String) => value

  implicit val intPrintable: Printable[Int] =
    (value: Int) => value.toString

  implicit val catPrintable: Printable[Cat] =
    (cat: Cat) => s"Name is ${Printable.format(cat.name)} ${Printable.format(cat.age)} year-old ${Printable.format(cat.color)} cat."
}

object Printable {
  def format[A](value: A)(implicit printable: Printable[A]): String = printable.format(value)
  def print[A](value: A)(implicit printable: Printable[A]): Unit = println(format(value))
}