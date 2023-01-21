class Task {
  private val sentences = Array(
    "It was the first time he had ever seen someone cook dinner on an elephant.",
    "Henry plays the piano.",
    "He took one look at what was under the table and noped the hell out of there.",
    "Everyone says they love nature until they realize how dangerous she can be.",
    "Henry couldn't decide if he was an auto mechanic or a priest.",
    "The tree fell unexpectedly short.",
    "The sun had set and so had his dreams.")

  def countHenry(): Int = {
    sentences.groupBy(sentence => sentence.contains("Henry")).size
  }
}