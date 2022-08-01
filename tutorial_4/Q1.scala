package tutorial_4

object Q1 extends App{
  println("input deposit value: ")
  val deposit = scala.io.StdIn.readInt()

  def interest(x:Int):Double =x match{
    case x if x <= 20000 => x*2/100
    case x if x <= 200000 => x*4/100
    case x if x <= 2000000 => x*3.5/100
    case x if x > 2000000 => x*6.5/100
  }

  println("flat interest for a deposit of "+deposit+" is : "+interest(deposit))
}