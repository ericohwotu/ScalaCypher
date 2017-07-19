import java.io.StringBufferInputStream

import org.scalatest.{FlatSpec, Matchers}
import Main._
import Console._

/**
  * Created by Administrator on 18/07/2017.
  */


class BaseTest extends FlatSpec with Matchers {

  "main" should "contain no error" in {
    val code = "gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"
    val in: StringBufferInputStream = new StringBufferInputStream(code)
    setIn(in)

    main(Array())
  }

  "encode" should "return ullyzi if foobar is passed" in {
    val code = "foobar"
    encode(code) should be("ullyzi")
  }

  it should "return this is an example of the atbash cipher if foobar is passed" in {
    val code = "gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"
    encode(code) should be("this is an example of the atbash cipher")
  }

  it should "not change the position of any non letters" in {
    val code = "gsrh rh !zm vcznkov lu gsv zgyzhs xrksvi"
    encode(code).toList(8) should be('!')
  }

}
