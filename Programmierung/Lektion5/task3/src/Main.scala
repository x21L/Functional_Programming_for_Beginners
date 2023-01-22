object Main {
  sealed trait Notification

  case class Snapchat(sender: String, message: String, flames: Boolean) extends Notification

  case class WhatsApp(sender: String, title: String, body: String) extends Notification

  case class Meme(name: String, link: String) extends Notification

  private def showNotification(notification: Notification): String = {
    notification match {
      case Snapchat(sender, message, flames = false)
    =>
    s"You got a snap from $sender with title: $title"
      case WhatsApp(sender, title, _)
      =>
        s"You got a message from $sender! Title: $title"
      case Meme(name, link)
      =>
        s"You received a Meme from $name! Click the link to see it: $link"
    }


  }


  def main(args: Array[String]): Unit = {
    println(showNotification(Snapchat("lukasw", "I do not like side effects", true)))
    println(WhatsApp("Lehrer", "Hausübung", "Folgende Aufgabe sind über die Ferien zu erledingen: ..."))
    println("The meme master", "https://www.reddit.com/r/fpmemes/")
  }
}