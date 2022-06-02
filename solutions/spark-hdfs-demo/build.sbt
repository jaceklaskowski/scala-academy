ThisBuild / organization := "scala-academy"
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .settings(
    name := "spark-hdfs-demo"
  )

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.1"

val scalatest = "3.2.12"
libraryDependencies += "org.scalactic" %% "scalactic" % scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % scalatest % Test

enablePlugins(DockerPlugin)

docker / dockerfile := {
  val jarFile: File = (Compile / packageBin / sbt.Keys.`package`).value
  val classpath = (Compile / managedClasspath).value
  val mainclass = (Compile / packageBin / mainClass).value.getOrElse(sys.error("Expected exactly one main class"))
  val jarTarget = s"/app/${jarFile.getName}"
  val classpathString = classpath.files.map("/app/" + _.getName)
    .mkString(":") + ":" + jarTarget
  ImageName(s"${organization.value}/${name.value}:latest")
  new Dockerfile {
    from("openjdk:11-jre")
    add(classpath.files, "/app/")
    add(jarFile, jarTarget)
    entryPoint("java", "-cp", classpathString, mainclass)
  }
}
