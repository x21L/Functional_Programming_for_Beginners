import org.scalatest.FunSuite

class TestSpec extends FunSuite {
  test("Test der Kubikformel") {
    val t = new Task()
    assert(t.cube(3) == 27)
    assert(t.cube(4) == 64)
    assert(t.cube(2) == 8)
  }

  test("Test der kubischen Summe") {
    val t = new Task()
    assert(t.sumCubes(3, 4) == 91)
    assert(t.sumCubes(4, 7) == 748)
  }
}