// Find the Kth element of a list.
// nth(2, List(1, 1, 2, 3, 5, 8))

def nth(k: Int, ns: List[Int]): Option[Int] = {
  ns.drop(k).headOption
}

nth(-1, List(1))
nth(0, List(1))
nth(3, List())

// k >= 0
def nthRec(k: Int, ns: List[Int]): Option[Int] = {
  // 1. pattern matching
  // 2. recursion
  if (k > 0) {
    if (ns.isEmpty) {
      None
    } else {
      nthRec(k - 1, ns.tail)
    }
  } else { // k == 0
    ns.headOption
  }
}

nthRec(0, List())
nthRec(1, List())
nthRec(0, List(3))
nthRec(1, List(3))

def nthRecPM(k: Int, ns: List[Int]): Option[Int] = {
  // 1. pattern matching
  // 2. recursion
  (k, ns) match {
    case (0, _) => ns.headOption
    case (_, Nil) => None
    case _ =>
      nthRecPM(k - 1, ns.tail)
  }
}

assert(nthRecPM(0, List()).isEmpty)
assert(nthRecPM(1, List()).isEmpty)
assert(nthRecPM(0, List(3)).contains(3))
assert(nthRecPM(1, List(3)).isEmpty)
