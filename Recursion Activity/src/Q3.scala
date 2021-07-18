object Q3 extends App{
  def sum(x:Int):Int={
    if(x!=0) return x + sum(x-1) else return x
  }
  println(sum(5))
}
