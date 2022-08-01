package tutorial_4

object Q4 {
  def checkInt(x: Int): Any = x match {
    case x if x<0 => "Negative"
    case x if x==0 => "Zero"
    case x if x%2==0 => "Even number"
    case x if x%2!=0 => "Odd Number"
  }

  def main(args: Array[String]): Unit ={
    println("input an integer : ")
    val num = scala.io.StdIn.readInt()

    println(checkInt(num))
  }
}
