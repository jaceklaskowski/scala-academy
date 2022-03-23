def consecutiveDuplicates[T](ts: Seq[T], n: Int): Seq[T] = {
  val z = (Seq.empty[T], 0)
  ts.foldLeft(z) { case ((result, counter), t) =>
//    val cnt = if (counter % n == 0) 1 else counter + 1
    (result ++ Seq.fill(counter % n + 1)(t), counter + 1)
  }._1
}

val ns = Seq(1,2,3,4,5)
val actual = consecutiveDuplicates(ns, 3)
val expected = Seq(1,2,2,3,3,3,4,5,5)
assert(actual == expected)
