import scala.collection.mutable.ArrayBuffer

object MapsAndTuples {
  def main(args: Array[String]): Unit = {
    testZip
  }

  def t1: String = {
    val scores = Map(
      "Mike" -> 10,
      "Jim" -> 20
    )
    scores("Mike").toString
  }

  def t2: String = {
    val scores = Map(
      "Mike" -> 10,
      "Jim" -> 20
    )
    scores.getOrElse("Tim", 10000).toString
  }

  def t3: String = {
    val mutableScores = scala.collection.mutable.Map(
      "Mike" -> 100
    )
    mutableScores("Jim") = 200
    mutableScores("Jim").toString
  }

  // Mutable Adding and removing
  def t4: String = {
    val mutableScores = scala.collection.mutable.Map(
      "Mike" -> 100,
      "Bye" -> 3000
    )
    mutableScores += ("Mike" -> 300)
    mutableScores -= "Bye"
    mutableScores("Mike").toString
    mutableScores.getOrElse("Bye", "666").toString
  }

  // Immutable Adding and removing
  def t5: String = {
    val scores = Map(
      "Mike" -> 100,
      "Bye" -> 3000
    )
    val scores1 = scores + ("Mike" -> 300) - "Bye"
    scores1("Mike").toString
    scores1.getOrElse("Bye", "666").toString
  }

  def t6 {
    val scores = Map(
      "Mike" -> 100,
      "Jim" -> 3000
    )
    for ((k, v) <- scores) println(k + " has a value of " + v)
  }

  def t7: String = {
    val scores = Map(
      "Mike" -> 100,
      "Jim" -> 3000
    )
    val reversedMap = for ((k, v) <- scores) yield(v,k)
    reversedMap.toString
  }

  def t8: String = {

    // Access tuple values by _n (Notice it's 1 based)
    val testTuple = ("Mike", 18, 3.2)
    testTuple._1;
  }

  def keepAllUntilTheFirstNegativeNumber(numArray: scala.collection.mutable.ArrayBuffer[Int]) = {
    val indexes = for (i <- 0 until numArray.length if (numArray(i) < 0)) yield i
    val indexesToRemove = indexes.drop(1)
    for (i <- indexesToRemove.reverse) numArray.remove(i)
    println(numArray.mkString(","))
  }

  def groupBySomething(something: Array[String]) {
    println(something.groupBy(_.length).toString)
  }

  def testTuple: (String, Int) = {
    ("Mike", 1)
  }

  def testPartition(testArray: ArrayBuffer[Int]) {
    val (neg, pos) = testArray.partition(_ < 0)
    print(neg.toString)
  }

  def testZip {
    val symbols = Array("<","=",">")
    val counts = Array(5,10,5)
    val pairs = symbols.zip(counts)
    for ((s,n) <- pairs) print(s * n)
  }

}