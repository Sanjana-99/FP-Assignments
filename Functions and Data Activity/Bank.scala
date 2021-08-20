object Bank extends App{
 var a1 = new Account("xxxv",111,30000.00)
 var a2 = new Account("xxyv",112,20000.00)
 var a3 = new Account("xyyv",113,-10000.00)
 var a4 = new Account("yyyv",114,-5000.00)
 var bank:List[Account] = List(a1,a2,a3,a4)
 
 val overdraft = (b:List[Account]) => b.filter(x => x.balance<0)

 val balance = (b:List[Account]) => b.reduce((x,y)=>x+y)

 def f1(a:Account)={
  if (a.balance>0){
   a.balance = a.balance+a.balance*0.05 
  }else{ 
   a.balance = a.balance+a.balance*0.1
  }
 }
 val interest = (b:List[Account]) => b.map(f1)
 

 println(overdraft(bank))
 println(balance(bank).balance)
 interest(bank)
 println(bank)


 class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val accnumber:Int = n
  var balance:Double = b

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

  def +(a:Account) = new Account(this.nic,this.accnumber,a.balance+this.balance)
 }
}

