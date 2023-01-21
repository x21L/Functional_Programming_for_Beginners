import org.scalatest.FunSuite
import org.scalatest.Matchers.{convertToAnyShouldWrapper, equal}

class TestSpec extends FunSuite {
  test("Wie oft kommt Henry vor?") {
    val t = new Task()
    assert(t.countHenry() == 2)
  }

  test("Welche Zahlen sind gerade?") {
    val t = new Task2()
    t.getEvenNumbers(Array(1, 2, 3, 4, 5, 6, 7, 8, 9)) should equal(Array(2, 4, 6, 8))
  }
}