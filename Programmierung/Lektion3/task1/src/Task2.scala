class Task2 {
  def getEvenNumbers(numbers: Array[Int]): Array[Int] = {
    numbers.filter(number => number % 2 == 0)
  }

  def getPrimeNumbers(numbers: Array[Int]): Array[Int] = {
    numbers.filter(number => {
      if (number <= 1) false
      else if (number == 2) true
      else !(2 until number).exists(x => number % x == 0)
    })
  }
}
