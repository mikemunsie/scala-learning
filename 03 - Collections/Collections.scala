object Collections {
  def main(args: Array[String]): Unit = {
    println(t5)
  }

  def t1 = {
    val test = Array("test1", "test2")
    test(0) = "Cool"

    // Prepend and append to an array
    val test2 = "Dude"+:test:+"Sweet"
    test2(3)
  }

  def t2 = {
    val test = new Array[Int](10)
    for (index <- 0 until test.length) test(index) = index
    test.mkString("")
  }

  def t3 = {
    var results = ""
    val test = Array("one", "two", "three")
    for (number <- test) results+= number
    results
  }

  def t4 = {
    var results = ""
    val test = Array("one", "two", "three")

    // How to use index in for loop
    for (index <- 0 until test.length) results+= test(index)
    results
  }

  def t5 = {
    val test = Array("one", "two", "three")

    // Note that sorting isn't mutable, instead we need to create a new variable with the sorted values
    val sortedTest = test.sorted
    sortedTest.mkString
  }

}