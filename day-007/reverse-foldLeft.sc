import scala.annotation.tailrec
// Napisz funkcje reverse z uzyciem foldLeft
// reverse(List(1, 1, 2, 3, 5, 8))

def reverse(ns: List[Int]): List[Int] = {
  // _ :: _
  ns.foldLeft(List.empty[Int]) { (ns, n) => ns.::(n) }
  ns.foldLeft(List.empty[Int]) { (ns, n) => n :: ns }
}

// 1
// 1 :: 1 :: Nil
// 2 :: 1 :: 1 :: Nil
// 3 :: 2...
// 5 :: 3 :: 2...
// 8 :: 5 :: 3 :: 2

reverse(List(1, 1, 2, 3, 5, 8))

// Exercise:
// reverse korzystajac z pattern matching + rekurencja
// Zakladamy, ze nie ma List.reverse
def reverseMatch(ns: List[Int]): List[Int] = {
  ns match {
    case Nil => ns
    case _ :: Nil => ns
    case m :: n :: Nil => n :: m :: Nil
    case _ => reverse(ns.tail) :+ ns.head
  }
}

reverseMatch(List(1, 1, 2, 3, 5, 8))
