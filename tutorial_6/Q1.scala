package tutorial_6

object Question_1 extends App{

  //alphabet for encrypting
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "

  //for shifting characters
  val key = 3

  //encryption function
  val Enc = (ch:Char,key:Int,alp:String) =>
    alp((alp.indexOf(ch.toUpper)+key)%alp.length)

  //decryption function
  val Dec = (ch:Char,key:Int,alp:String) =>
    alp((alp.length+(alp.indexOf(ch.toUpper)-key))%alp.length)

  val cipher = (f:(Char,Int,String) => Char,
    s:String,key:Int,alp:String) => s.map(f(_,key,alp))

  val inputTxt = "hello world"
  val encrypted_txt=cipher(Enc,inputTxt,key,alphabet)
  val decrypted_txt=cipher(Dec,encrypted_txt,key,alphabet)

  println(encrypted_txt)
  println(decrypted_txt)
}
