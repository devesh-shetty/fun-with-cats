package com.deveshshetty

import cats.instances.string._
import cats.syntax.semigroup._
import com.deveshshetty.exercise.library.Cat
import com.deveshshetty.exercise.library.PrintableInstances._

object Main extends App {
  println("Hello " |+| "Cats!")
  val cat = Cat(name = "Kityy", age = 12, color = "RED")
  println(catPrintable.format(cat))

  import com.deveshshetty.exercise.library.PrintableSyntax._

  Cat(name = "Ditto", age = 22, color = "GREEN").print
}
