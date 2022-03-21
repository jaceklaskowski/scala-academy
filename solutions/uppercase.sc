import scala.io.Source

// Use args
val filename = "C:\\projects\\day-15\\input.txt"
val n = 3

Source
  .fromFile(filename)
  .getLines() // sekwencja linii
  .flatMap(_.split("\\s+")) // sekwencja slow
  .zipWithIndex
  .map {
    case p @ (word, _) if p._2 % n == 0 => word.toUpperCase
    // Please do NOT do the following:
    // case p if p._2 % n == 0 => p._1.toUpperCase
    case (word, _) => word

  }
  .foreach(println)
