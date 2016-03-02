object ClassesAndObjects {

  // Theses vals are known as instance variables
  // Note: if we wanted to make this mutatable, we could change the val to a var instead
  // Name is a field which makes it private :)
  class Point(name: String, val x: Double, val y: Double) {
    def move(dx: Double, dy: Double) = new Point("New Point", x + dx, y + dy)
    def distanceFromOrigin = math.sqrt(x * x + y * y)
    override def toString = f"(${x}, ${y})"
  }

  object TestObject {
    var count = 1
    def newObject = count+=1

    // Fold has a start value and a function with an accumulator and item
    def testFold = List("I'm","a","Sentence").fold("Seriously,") { (a, i) => a + f" ${i}" }
  }

  def main(args: Array[String]): Unit = {
    var p = new Point("My Point", 3,4)
    p = p.move(10,0)
    println(p.toString)
    TestObject.newObject
    TestObject.newObject
    println(TestObject.testFold)
  }

}