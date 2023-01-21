class Task {
  def convertNumberToString(x: Int): String = {
    x match
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "some other number"
  }
}