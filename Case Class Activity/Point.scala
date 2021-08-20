object Point extends App{
  val p1 = Point(2,3)
  val p2 = Point(4,5)
  val tot = p1+p2
  val movement = p1.move(1,1)
  val dist = p1.distance(p2)
  val inv = p1.invert()

  println("Point 1: "+p1)
  println("Point 2: "+p2)
  println("Point p1+p2: "+tot)
  println("Point p1 moved (1,1): "+movement)
  println("Distance between points p1 and p2: "+dist._1+" on X axis "+dist._2+" on Y axis")
  println("Inversion of point p1: "+inv)
}

case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def +(that:Point) = Point(this.x+that.x, this.y+that.y)

  def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)

  def distance(that:Point) = (Math.abs(this.x-that.x), Math.abs(this.y-that.y))

  def invert() = Point(this.y, this.x)
}
