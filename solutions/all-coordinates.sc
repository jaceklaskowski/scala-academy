def allCoordinates(cs: Seq[Char], ns: Seq[Int]): Seq[(Char, Int)] = {
  for {
    c <- cs
    n <- ns
  } yield (c, n)
}
allCoordinates(('A' to 'H'), (1 to 8)).length

// Exercise
// Change the above for-comprehension to a series of flatMap and map

val cs = ('A' to 'H')
val ns = (1 to 8)
cs.flatMap { c => ns.map { n => (c, n) }}

// the above is equivalent to the following:
cs.map { c => ns.map { n => (c, n) }}.flatten
