import org.apache.spark.sql.SparkSession

object SparkHDFS {
  def main(args: Array[String]) = {
    import org.apache.spark.sql.SparkSession

    val DEFAULT_PATH = "hdfs://localhost:9000/files/"
    val path = if (args.length > 0) args(0) else DEFAULT_PATH

    println(s">>> Loading files from: $path")

   implicit val spark = SparkSession
      .builder
      .getOrCreate()
    val output = loadFilesFromPath(path)
    output.show(truncate = false)
  }

  /**
   * Gives a "testable" Spark code
   */
  def loadFilesFromPath(path: String)(implicit spark: SparkSession) = {
    spark.read.text(path)
  }
}