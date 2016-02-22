import scala.math._

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println(testPermutations)
  }

  def forgetDotNotation() : String = {
    val test = "Test"

    // You can remove the . and the parenthesis if you use only 1 parameter
    test indexOf "T" toString()
  }

  def testList() = {
    List(1,2,3,4)
  }

  def testMap = {

    // You can access by testMap("one") which returns 1
    Map(
      "one" -> 1,
      "two" -> 2,
      "three" -> "Three"
    )
  }

  def testMutableString() = {
    var changeableString : String = "Mike"
    changeableString = "Mike2"
    changeableString
  }

  def testPermutations = {
    "Mike".permutations.toArray.deep.mkString(",")
  }

  def testRange(n1: Int, n2: Int) = {
    n1.to(n2)
  }

  def testRange2() = {

    // The underscore is a reference to that item in the array!
    1.to(10).map(_*2)
  }

  def testAdd(n1: Int, n2: Int) = {

    // The plus, -, and * are just methods
    // n1.+(n2) is the same as n1+n2
    n1.+(n2)
  }

  def whenToUseParenthesis = {
    val Hello = "Hello"

    // This does not need parenthesis
    Hello.length.toString()
  }

  object Mike {

    // What?! we can do this?! Try Mike.*~
    def *~ = {
      "hi"
    }
  }


}