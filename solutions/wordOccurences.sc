def wordOccurences(words: Seq[String]): Seq[(String, Int)] = {
  // 1. foldLeft
  // words.foldLeft(Seq.empty[(String, Int)]) { ??? }

  words.foldLeft(Map.empty[String, Int]) { (m, w) =>
    val occ = m.getOrElse(w, 0) + 1
    m + (w -> occ)
//    m + ((w, occ))
  }
  // 2. z = Map.empty[(String, Int)]
  // 3. Map.getOrElse
  ???
}
// zakladamy niejawnie sortowanie po wyrazach
wordOccurences(Seq("a", "a", "bb", "ccc")) == Seq("a" -> 2, "bb" -> 1, "ccc" -> 1)

// Sekwencja par == Para sekwencji
// Seq[(String, Int)] == (Seq[String], Seq[Int])

Seq("z", "g", "g", "g", "a", "a", "bb", "ccc")
    .groupBy(identity)
    .map { case (w, ws) => (w, ws.length) }
    .toSeq
    // .sortBy(_._1)
    .sortBy { case (w, _) => w }