package myspark

object Main extends App {

  val rows = Seq(Seq(0, "zero"), Seq(1, "one"), Seq(2, "two"))
  val colNames = Seq("id", "name")
  val df = DataFrame(rows, colNames)
  df.show()

  val rightRows = Seq(Seq(1, "one"), Seq(5, "five"), Seq(2, "dwa"))
  val right = DataFrame(rightRows, colNames)

  val on = Seq("id")
  df.join(right, on).show()

  val on2 = Seq("id", "name")
  df.join(right, on).show()

}
