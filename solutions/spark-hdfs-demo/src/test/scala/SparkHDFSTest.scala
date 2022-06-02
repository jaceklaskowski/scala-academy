import org.apache.spark.sql.SparkSession
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SparkHDFSTest extends AnyFlatSpec with should.Matchers {
  "SparkHDFS" should "execute main" in {
    implicit val spark = SparkSession
      .builder
      .master("local[*]")
      .getOrCreate()
    import spark.implicits._
    val actual = SparkHDFS
      .loadFilesFromPath("src/test/resources/files/")
      .as[String]
      .collect
    val expected = "Scala Academy here" :: Nil
    actual should contain theSameElementsAs(expected)
  }
}
