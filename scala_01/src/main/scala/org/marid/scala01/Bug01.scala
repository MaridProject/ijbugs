package org.marid.scala01

class Bug01 {
  def get(): Int = 101
}

object Bug01 {

  def invoke(f: () => Int): Int = f()

  def main(args: Array[String]): Unit = {
    println(
      invoke(
        new Bug01().get
      )
    )
  }
}
