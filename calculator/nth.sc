// Since we know nothing about exceptions in Scala
// and exceptions are told to be a bad idea anyway
// the signature of `nth` should use `Option[Char]`
// to denote a luck of value

def nth(s: String, n: Int): Option[Char] = {
  if (s.nonEmpty && n >= 0) Some(s.charAt(n))
  else None
}

assert(nth("", 0).isEmpty)
assert(nth("a", 0).contains('a'))
assert(nth("ala", 1).contains('l'))
assert(nth("ala", -1).isEmpty)
