import java.util.NoSuchElementException
import FirstScalaClass.helloName
import org.scalatest.FunSpec
class FirstScalaClassTest extends FunSpec {

  describe("A method") {
    it("should return NoSuchElementException if we input \"null\" as parameter") {
      assertThrows[NoSuchElementException] {
        helloName(null) === "Hello Nikita"
      }
    }
  }
}
