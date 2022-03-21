package myspark

case class DataFrame(rows: Seq[Seq[Any]], colNames: Seq[String]) {

  def show(): Unit = {
    val sep = Seq.fill(colNames.length)("---").mkString("+", "+", "+")
    val colsFormatted = colNames.mkString("|", "|", "|")
    val header = Seq(sep, colsFormatted, sep)
    val body = rows.map(_.mkString("|", "|", "|"))
    val footer = sep :: Nil
    (header ++ body ++ footer).foreach(println)
  }

  def join(right: DataFrame, on: Seq[String]): DataFrame = {
    // wyliczamy pozycje kolumn, po ktorych join'ujemy
    // czyli gdzie wystepuja on columns w colNames
    val ids = indices(on)

    val leftVals = rows.map(r => ids.map(id => r(id)))
    val rightVals = right.rows.map(r => ids.map(id => r(id)))
    val matches = leftVals.intersect(rightVals)

    def matchById(
                 left: Seq[Any],
                 right: Seq[Any],
                 ids: Seq[Int]): (Seq[Any], Seq[Any]) = {
      val leftIds = ids.map(id => left(id))
      val rightIds = ids.map(id => right(id))
      (leftIds, rightIds)
    }

    val joinCols = this.colNames ++ right.colNames
    // How to find rows with join values as in matches
    // in the this and right sides?
    // Jak znalezc wiersze, ktore na pozycjach ids maja wartosci z matches?
    DataFrame(
      this.rows.filter(r => r(ids.head) == matches.head.head),
      this.colNames)
  }

  def indices(on: Seq[String]): Seq[Int] = {
    colNames
      .zipWithIndex
      .filter(p => on.contains(p._1))
      .map(_._2)
  }

}
