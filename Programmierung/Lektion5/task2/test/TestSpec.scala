import org.scalatest.FunSuite

class TestSpec extends FunSuite {
  val t = new Task()
  assert(t.convertNumberToString(1) == "one")
  assert(t.convertNumberToString(2) == "two")
  assert(t.convertNumberToString(3) == "three")
  assert(t.convertNumberToString(4) == "some other number")
}
