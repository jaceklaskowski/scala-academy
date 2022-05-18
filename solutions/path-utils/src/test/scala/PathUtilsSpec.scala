import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class PathUtilsSpec extends AnyFlatSpec with should.Matchers {
  "FindFile" should "XXX" in {
    import PathUtils._
    val myGetPathEnv = () => "/mateusz/DAMIAN/bin"
    val expected = Seq("/mateusz/DAMIAN/bin")
    val actual = findFile("kubectl", myGetPathEnv, (_: String, _: String) => true)
    actual shouldBe expected
  }
}
