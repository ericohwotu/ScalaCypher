/**
  * Created by Administrator on 19/07/2017.
  */
import org.scalautils.TypeCheckedTripleEquals._

object Main {

  val dict: List[Char] = "abcdefghijklmnopqrstuvwxyz".toList

  def main(args: Array[String]): Unit = ???

  def getInput(): String = ???

  def errHandler(): String = ???

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
