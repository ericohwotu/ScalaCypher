/**
  * Created by Administrator on 19/07/2017.
  */
import scala.io.StdIn._

object Main {

  val dict: List[Char] = "abcdefghijklmnopqrstuvwxyz".toList

  def main(args: Array[String]): Unit = println("Encoded string: " + encode(readLine("Input Text: ")))

  def encode(text: String): String = {
    text.toList.map {
      case(char) =>
        if (dict.contains(char.toLower)){
          val swapIndex = (dict.length - 1) - dict.indexOf(char)
          dict(swapIndex)
        }else{
          char
        }
    }.mkString("")
  }
}
