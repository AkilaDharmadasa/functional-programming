package tutorial_2

//question 2
object question_2 extends App {
  var k:Int = 2
  var i:Int = 2
  var j:Int = 2
  var m = 5
  val n = 5

  var f: Double = 12.0f
  var g: Double = 4.0f

  var c = 'X'

  println("a) k + 12 * m = " + (k + 12 * m))
  println("b) m / j = "+ (m / j))
  println("c) n % j = "+ (n % j))
  println("d) m / j * j = "+ (m / j * j))
  println("e) f + 10*5 +g = "+ (f + 10*5 +g))
  i+=1
  println("f) ++i * n = "+ (i * n))
}

//question 3
object question_3 extends App {
  var a = 2
  var b = 3
  var c = 4
  var d = 5
  var k = 4.3f

  b-=1
  println( "--b * a + c * d-- = " + (b*a+c*d ))
  d-=1
  println("a++ = " + (a))
  a+=1
  //println("-2 * ( g - k ) +c = " + (-2 *(g-k)+c));
  println ("c=c++ = "+ (c))
  c+=1
  println("c=++c*a++ = " +c*a)
  a+=1
}

object question_4a extends App {
  var normalH = 40
  var otH = 30
  val taxPercentage = 12

  def norm_sal(x:Int):Double = x * 250
  def ot_sal(x:Int):Double = x * 250

  def totSal():Double = norm_sal(normalH)+ot_sal(otH)
  def tax():Double = totSal()*12/100

  def netSal():Double = totSal() - tax()

  println("Net salary = Rs."+ netSal())

}

object question_4b extends App {
  val set_cost = 500
  val set_ticket = 15
  val crowd_15 = 120
  val extra_cost = 3

  //+5 -> -20
  //-5 -> +20

  //profit = x*y - (500+3*x)
  def profit(price:Double):Double = income(price) - cost(price)

  def income(price:Double):Double = price*crowd(price)
  def cost(price:Double):Double = crowd(price)*3 +500

  def crowd(price:Double) = 120 + 20*(15-price)/5

  var x = 0
  for(x <- 0 to 40)
  {
    println("with price "+x+" profit = " +profit(x))
  }
}