object Expressions {
  def main(args: Array[String]): Unit = {

    println(extractVowels("amdme"))

    def t1 = {
      // If statements are values
      val test = if (1 > 2) "Cool" else "yes"
      println(test)
    }

    def t2 = {
      // The <- is called a "Generator"
      for (i <- 1 to 10) println(i)
    }

    def t3 = {
      // You can have multiple generators
      for (i <- 1 to 10; j <- 10 to 20 ) println(i*j)
    }

    def t4 = {
      // You can also have a guard in your for loop
      for (i <- 1 to 10; j <- 10 to 20 if i == j) println(i*j)
    }

    def t5 = {

      // This is cool - returns a vector list from the loop
      val myCollection = for (i <- 1 to 10) yield i + 1
      println(myCollection)
    }

    def t6(first: String = "Mike", last: String = "Munsie") = {

      // You can call this function like t6(last = "Cool")
      println(first + " " + last)
    }

    def t7(numbers: Int*) = {
      var total = 0
      for (i <- numbers) total+=i
      println(total)
    }

    def isVowel(ch: Char) = {
      "aeiou".contains(ch)
    }

    def extractVowels(str: String) = {
      for (i <- str if ("aeiou".contains(i))) yield i
    }

  }

}