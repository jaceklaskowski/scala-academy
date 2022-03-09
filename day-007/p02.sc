import scala.annotation.tailrec
// penultimate(List(1, 1, 2, 3, 5, 8))
// p: List[Int] => Int

@tailrec
def penultimate(ns: List[Int]): Option[Int] = {
  ns match {
    case Nil => None
    case _ :: Nil => None
    case m :: _ :: Nil => Some(m)
    case _ => penultimate(ns.tail)
  }
}

penultimate(List())
penultimate(List(1, 1, 2, 3, 5, 8))