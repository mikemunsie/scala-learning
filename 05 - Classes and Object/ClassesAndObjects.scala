object ClassesAndObjects {

  class Point(val x: Double, val y: Double) {
    def move(dx: Double, dy: Double) = new Point(x + dx, y + dy)
    def distanceFromOrigin = math.sqrt(x * x + y * y)
    override def toString = f"(${x}, ${y})"
  }


  def main(args: Array[String]): Unit = {
    var p = new Point(3,4)
    p = p.move(10,0)
    print(p.toString)
  }
}