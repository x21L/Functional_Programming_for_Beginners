class Students(var firstName: String, var lastName: String, var course: Course) {
  def getFirstName: String = this.firstName

  def setFirstName(firstName: String): Unit = {
    this.firstName = firstName
  }

  def getLastName: String = this.lastName

  def setLastName(lastName: String): Unit = {
    this.lastName = lastName
  }

  def getCourse: Course = this.course

  def setCourse(course: Course): Unit = {
    this.course = course
  }

  override def toString() : String = {

    firstName + " " + lastName+" " +  course;
  }
}

