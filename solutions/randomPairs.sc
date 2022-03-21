def randomPairs(left: Seq[Int], right: Seq[Int]): Seq[(Int, Int)] = {
  assert(left.length == right.length)
  import scala.util.Random
  Random.shuffle(left).zip(Random.shuffle(right))

  // Exercise: Write the same using for-comprehension
  val leftShuffled = Random.shuffle(left)
  val rightShuffled = Random.shuffle(right)
  for {
    idx <- left.indices
  } yield ((leftShuffled(idx), rightShuffled(idx)))
}

def randomPairs(left: Seq[String], right: Seq[String]): Seq[(String, String)] = {
  import scala.util.Random
  Random.shuffle(left).zip(Random.shuffle(right))
}
