object Account extends App{
 val acc1 = new Account("xxxv", 111, 23000.00)
 val acc2 = new Account("yyyv", 222, 12000.00)
 println("Acc1 balance before transaction: "+acc1.balance)
 println("Acc2 balance before transaction: "+acc2.balance)
 acc1.transfer(acc2, 1000.00)
 println("Acc1 balance after transaction: "+acc1.balance)
 println("Acc2 balance after transaction: "+acc2.balance)

 class Account(id:String, n:Int, b:Double){
  val nic = id
  val accnumber = n
  var balance = b

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

  def transfer(a:Account, b:Double) = {
   this.balance = this.balance-b
   a.balance = a.balance + b
  }
 }
}