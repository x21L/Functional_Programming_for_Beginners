import scala.annotation.tailrec

class Task {
  def factorial(x: Int): Int = {
    @tailrec
    def fact(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)

    fact(x, 1)
  }
}