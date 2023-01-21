object Main {
  private def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if ssl then "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

  def main(args: Array[String]): Unit = {
    val domainName = "www.9gag.com"

    def getURL = urlBuilder(ssl = true, domainName)

    val endpoint = "gag/a31jAjm"
    val parameter = "could_be_a_username" // nicht immer werden Parameter gebraucht
    val url = getURL(endpoint, parameter)
    println(url)
  }
}