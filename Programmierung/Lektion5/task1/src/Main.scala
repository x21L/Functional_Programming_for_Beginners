
object Main {
  case class Book(isbn: String)

  case class Message(sender: String, recipient: String, body: String)

  def main(args: Array[String]): Unit = {
    val frankenstein = Book("978-0486282114")
    println(frankenstein)
    val message = Message("lukas@schule.at", "lisa@schule.de", "Definition Monade")
    val message1 = Message("lukas@schule.at", "lisa@schule.de", "Definition Monade")
    val messagesAreTheSame = message == message1
    println(messagesAreTheSame)
  }
}