class Course(var name: String, var ects: Double) {
  def getCourseName: String = this.name

  def setCourseName(courseName: String): Unit = {
    this.name = courseName
  }

  def getCourseECTSCredits: Double = this.ects

  def setCourseECTSCredits(courseECTS: Double): Unit = {
    this.ects = courseECTS
  }
  override def toString() : String = {

    "is registered to the course: "+name + " with " + ects+" ects points";
  }
}