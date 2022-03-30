// Exercise 1: Create a list of the first n=20 odd Long numbers
// Hint: Use for-loop, with the filter operation, and with the map operation
val n = 5

val makeOddNumber = (n: Int) => n * 2 + 1
(0 until 20).map(makeOddNumber)

def isOdd(n: Int): Boolean = n % 2 == 1
(0 until 40).filter(isOdd)

// Exercise 2
// Write a function titled "factors" that takes a number
// and returns a list of its factors,
// other than 1 and the number itself
// Ex: factors(15) should return List(3,5)

def factors(n: Int): List[Int] = {
  def isDividedBy(m: Int) = n % m == 0
  val isDivBy: Int => Boolean = n % _ == 0
  (2 until n).filter(isDividedBy).toList
}

factors(15)

// Exercise 2A
// Then write a new function that applies "factors"
// to a list of numbers.
// Try using the list of Long numbers you generated in Ex 1.
// Ex. List(9, 11, 13, 15) => List(3,3,5)
// Hint: map + flatten

//def factors(ns: List[Int]) = ns.flatMap(factors)

// Exercise 3
// Write a function
// first(items: List[Int], count: Int): List[Int]
// that returns first count number of elements
// in a given list
// Ex. first(List('t', 'o', 'm', 'e', 'k'), 3)
//           List('t', 'o', 'm')
// 1. A quick solution / take
// 2. foldLeft
// 3. recursion with head and tail

def first(items: List[Int], count: Int): List[Int] = {
  def myfirst(items: List[Int], count: Int, acc: List[Int]): List[Int] = {
    if (count == 0) acc
    else myfirst(items.tail, count - 1, acc :+ items.head)
  }
  if (count <= 0) Nil
  else myfirst(items, count, acc = List.empty)
}
first(items = List(2,3,4), -388)

// foldLeft-based solution
def first2(items: List[Int], count: Int): List[Int] = {
  val z = (List.empty[Int], 0)
  items.foldLeft(z) { case ((result, cnt), n) =>
    if (cnt == count) (result, cnt)
    else {
      (result :+ n, cnt + 1)
    }
  }._1
}
first2(List(1,2,3,4,5), 3)
