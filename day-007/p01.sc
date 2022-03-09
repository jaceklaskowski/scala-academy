// last(List(1, 1, 2, 3, 5, 8))

// Step 1: Zdefiniuj metode last
def last(ns: List[Int]): Int = {
  // ns(ns.size - 1)
  // Pattern matching
  // Match Expression

  if (ns == List()) {
    -1 // FIXME
  }
  else if (ns.size == 1) // lista jedno-elementowa
    ns(0)
  else {
    // rekurencje
    // 3- i wiecej-elementowa lista
    // Lista to glowa (head) + ogon (tail)
    last(ns.tail)
  }
}

assert(last(Nil) == -1)
assert(last(List(1)) == 1)
last(List(1,2,3)) == 3

// 10:30 - 10:50

