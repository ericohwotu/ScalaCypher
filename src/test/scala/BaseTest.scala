import org.scalatest.{FlatSpec, Matchers}
import Main._

/**
  * Created by Administrator on 18/07/2017.
  */


class BaseTest extends FlatSpec with Matchers {

  "encode" should "return ullyzi if foobar is passed" in {
    val code = "foobar"
    encode(code) should be("ullyzi")
  }

}
