object Q5 extends App{
  def evenSumCal(x:Int):Int={
    if(x%2==0){
      if(x!=0){
        return x + evenSumCal(x-2)
      }
      else{
        return x
      }
    }
    else{
      evenSumCal(x-1)
    }
  }

  def evenSum(x:Int):Int={
    if(x%2==0) return evenSumCal(x)-x else return evenSumCal(x)
  }

  println(evenSum(7))
}
