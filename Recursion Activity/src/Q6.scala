object Q6 extends App{
  def fib(n:Int):Int= n match{
    case x if x==0 => 0
    case x if x==1 => 1
    case x => fib(n-1)+fib(n-2)
  }

  def fibonacci(x:Int)={
    var z = 0
    while(z<x){
      if(z==x-1) print (fib(z)) else print(fib(z)+",")
      z=z+1
    }
  }
  fibonacci(7)
}
