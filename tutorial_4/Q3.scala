package tutorial_4

object Q3 {
  def toUpper(str: String):String = str.toUpperCase()
  def toLower(str: String):String = str.toLowerCase()

  def toUpper_1_2(str: String): String = toUpper(str.substring(0, 2)) + toLower(str.substring(2, str.length()))
  def toUpper_Ends(str: String):String = {
    toUpper(str.substring(0,1)) +
      toLower(str.substring(1,str.length()-1)) +
      toUpper(str.substring(str.length()-1,str.length()))
  }


  def formatName(name:String,f:String => String):String= {
    f(name)
  }

  def main(args: Array[String]): Unit ={

    println(formatName("Benny",toUpper))
    println(formatName("Niroshan",toUpper_1_2))
    println(formatName("Saman",toLower))
    println(formatName("Kumara",toUpper_Ends))
  }
}
