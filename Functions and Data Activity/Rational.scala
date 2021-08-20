object Rational extends App{
 val x = new Rational(3,4)
 println("x = "+x)
 println("-x = "+x.neg)
}

class Rational(n:Int, d:Int){
 require(d>0,"division by zero")
 def numerator = n/gcd(Math.abs(n),d)
 def denominator = d/gcd(Math.abs(n),d)

 private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a%b)

 def neg = new Rational(-this.numerator, this.denominator)

 override def toString = numerator+"/"+denominator
}