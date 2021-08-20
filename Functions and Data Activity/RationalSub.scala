object RationalSub extends App{
 val x = new Rational(3,4)
 val y = new Rational(5,8)
 val z = new Rational(2,7)
 val answer = x.sub(y).sub(z)
 println(answer)
}

class Rational(n:Int, d:Int){
 require(d>0,"division by zero")
 def numerator = n/gcd(Math.abs(n),d)
 def denominator = d/gcd(Math.abs(n),d)

 private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a%b)

 def neg = new Rational(-this.numerator, this.denominator)

 def +(r:Rational) = new Rational(this.numerator*r.denominator + r.numerator*this.denominator, 
this.denominator*r.denominator)

 def sub(r:Rational) = this+r.neg

 override def toString = numerator+"/"+denominator
}