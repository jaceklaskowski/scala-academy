import java.io.File

object PathUtils {
  def getPathEnv: String = sys.env("PATH")

  def isExists(dir: String, file: String) = {
    new File(dir + File.separatorChar + file).exists()
  }

  def findFile(
      file: String,
      getPathEnvFn: () => String = getPathEnv _,
      isExistsFn: (String, String) => Boolean = isExists _): Seq[String] = {
    getPathEnvFn().split(File.pathSeparatorChar).filter(dir => isExistsFn(dir, file)).toSet.toSeq
  }
}
