def replaceWords(lines: Seq[String],
                 replacements: Map[String, String]): Seq[String] = {
  lines
    .map(_.split("\\s+"))
    .map(ws => ws.map(w => replacements.getOrElse(w, w)).mkString(" "))
}

val actual = replaceWords(
  lines = Seq(
    "Good morning. Nice to see you",
    "Dzien dobry. Jak idzie?"),
  replacements = Map(
    "good" -> "Dobry",
    "see" -> "XXX",
    "jak" -> "How"
  )
)
val expected = Seq(
  "Dobry morning. Nice to XXX you",
  "Dzien dobry. How idzie?")
assert(actual == expected)
