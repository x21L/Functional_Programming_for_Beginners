import org.scalatest.FunSuite

class TestSpec extends FunSuite {
  test("Test der Faktoriellen") {
    assert(new Task().factorial(4) == 24)
    assert(new Task().factorial(7) == 5040)
    assert(new Task().factorial(9) == 362880)
  }
}
