object Cipher extends App{
	val Encryption=(c:Char,key:Int,a:String)=>
	a((a.indexOf(c.toUpper)+key)%a.size)

	val Decryption=(c:Char,key:Int,a:String)=>
	if((a.indexOf(c.toUpper)-key)<0) a((a.indexOf(c.toUpper)-key)+a.size) else a((a.indexOf(c.toUpper)-key)%a.size)
	

	val Cipher=(algo:(Char,Int,String)=>
	Char,s:String,key:Int,a:String)=>
	s.map(algo(_,key,a))

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val s = "Zebra"
	val k = 5

	val ct=Cipher(Encryption,s,k,alphabet)
	val pt=Cipher(Decryption,ct,k,alphabet)
	
	println(ct)
	println(pt)
}