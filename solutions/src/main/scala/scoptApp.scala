object hello extends App {
  // A class to represent the values of command-line options
  case class Config(lines: Boolean, words: Boolean)

  import scopt.OParser

  val myBuilder = OParser.builder[Config]

  // Homework: Przejrzec scopt.OParserBuilder

  val myParser = {
    import myBuilder._
    OParser.sequence(
      programName("My Great Name"),
      head("Blabla", "1.0.0-alpha"),
      help("help").text("prints this usage text"),
      opt[Boolean]('l', "lines")
        .action((x, cfg) => cfg.copy(lines = true))
        .text("My name property"),
    )
  }

  val config = OParser.parse(
      myParser,
      args,
      Config(id = -1, name = "DEFAULT")).getOrElse {
    println("Not enough or incorrect command-line arguments. Exiting...")
    sys.exit(-1)
  }

  println(s"${config.id} --> ${config.name}")
}
