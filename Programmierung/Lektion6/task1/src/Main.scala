import scala.collection.mutable.ListBuffer

object Main {
   def main(args: Array[String]): Unit = {

     val listOfStudents = ListBuffer[Students]()

     listOfStudents.append(new Students("Max","Mustermann", new Course("Special Topics", 3)))
     listOfStudents.append(new Students("Peter","Mayer", new Course("System Software", 3)))
     listOfStudents.append(new Students("Fabian","Kohl", new Course("Formel Methods in SW", 4.5)))
     listOfStudents.append(new Students("Johann","Strauss", new Course("Intro to Linux", 1.5)))

     println("After adding to list!")
     println()

     listOfStudents.foreach(println)
     println()


     listOfStudents.remove(0)
     listOfStudents.remove(2)

     println("After removing from list!")
     println()

     listOfStudents.foreach(println)
   }
}