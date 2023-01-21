object Main {
   private def greetMe(name: String): String = {
      "Hi " + name
   }

   private def addition(x: Int, y: Int): Int = {
      x + y
   }

   def main(args: Array[String]): Unit = {
      println(greetMe("Dein Name"))
      println(addition(3, 4) /*replace numbers */)
   }
}