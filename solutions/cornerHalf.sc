def cornerHalf(cs: Seq[Char], ns: Seq[Int]): Seq[(Char, Int)] = {
  for {
    c <- cs
    n <- ns
    if c - n >= 'A' - 1
  } yield (c, n)
}
