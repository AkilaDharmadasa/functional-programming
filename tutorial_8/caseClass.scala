package tutorial_8
import scala.math._

object caseClass extends App{
  val p1 = Point(1,2)
  val p2 = Point(3,4)
  val p3 = p1.move(4,4)
  println("addition of p1 and p2 : "+ p1+p2)
  println("moving p1 by (4,4) : " + p3)
  println("inverting p2 : "+p2.invert())
  println("distance between p1 and p2 : " + p1.distance(p2))


}

case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def move(dx:Int,dy:Int): Point =Point(this.x+dx,this.y+dy)
  def invert(): Point = Point(this.y,this.x)
  //p is the point that is added
  def +(p:Point): Point = Point(this.x+p.x,this.y+p.y)
  def distance(p:Point): Double ={sqrt(pow(this.x-p.x,2)+pow(this.y-p.y,2))}
}