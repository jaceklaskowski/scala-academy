// Flatten a nested list structure.
// flatten(List(List(1, 1), 2, List(3, List(5, 8))))

// any: List[Any]
// any: List[Int]
// any: Int
def myFlatten(as: List[Any]): List[Int] = {
  as.foldLeft(List.empty[Int]) { (result, lst) =>
    lst match {
      case n: Int => result :+ n
      case ns: List[_] => // <-- type erasure
        result ++ myFlatten(ns)
    }
  }
}

myFlatten(List(1))
myFlatten(List(List(1,2,3)))
myFlatten(List(List(List(1,2,3))))
myFlatten(List(1, List(List(List(1,2,3)))))
