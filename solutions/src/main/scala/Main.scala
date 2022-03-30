import scala.io.Source

object Main extends App {

  val filename = "C:\\projects\\day19\\instructions.txt"
  val lines = Source.fromFile(filename).getLines.toSeq

  //lines.foreach(println)

  // Possibly case s"create $arrow $x $y $id" =>
  val commands = lines.map(Command.from)
  val board = commands.collectFirst { case b: Board => b }.getOrElse(???)

//  val noBoardCommands = commands.filterNot(_.isInstanceOf[Board])
  val nonBoardCommands = commands.filter {
    case _: Board => false
    case _ => true
  }

  val currentBoard = nonBoardCommands.foldLeft(board) { (b, cmd) =>
    b.render()
    b.execute(cmd)
  }
  currentBoard.render()

  println(currentBoard.arrows("id1"))

  // IT WORKS!
  // Break 10:55 - 11:25

  // Lunch break 12:05 - 12:50

  // Friday 2 apps reviewed

}

object Command {
  val acceptedCommands = Map(
    "board" -> (Board.from _),
    "create" -> (Create.from _),
    "move" -> (Move.from _)
  )

  def from(line: String) = {
    val name = line.split("\\s+").head.toLowerCase
    val fromMethod = (acceptedCommands(name))
    fromMethod(line)
  }
}

case class Create(symbol: Char, x: Int, y: Int, id: String) // extends Command
object Create {
  def from(line: String): Create = {
    // pattern matching on assignment
    val Array(_, symbol, x, y, id) = line.split("\\s+")
    Create(symbol.charAt(0), x.toInt, y.toInt, id)
  }
}

case class Board(m: Int, n: Int) {

  // FIXME Inna nazwa to commandsExecuted?
  case class Arrow(symbol: Char)
  case class Field(arrow: Option[Arrow])
  val slots = collection.mutable.ArrayBuffer.empty[Any]

  type ARROW_ID = String
  val arrows = collection.mutable.HashMap.empty[ARROW_ID, Create]

  def execute(cmd: Product) = cmd match {
    case c: Create =>
      arrows.addOne(c.id, c)
      this
    case m: Move =>
      println(s"Moving ${m.id} by $n steps")
      val a = arrows(m.id)
      arrows(m.id) = a.copy(x = a.x + m.n, y = a.y + m.n)
      this
  }

  def render() = println(s"Drawing BOARD($m, $n)")

} // extends Command
object Board {
  def from(line: String): Board = {
    val Array(_, m, n) = line.split("\\s+")
    Board(m.toInt, n.toInt)
  }
}

case class Move(id: String, n: Int)
object Move {
  def from(line: String): Move = {
    val Array(_, id, n) = line.split("\\s+")
    Move(id, n.toInt)
  }
}
