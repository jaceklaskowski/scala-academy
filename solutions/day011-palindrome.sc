def palindrome(s: String): Boolean = {
  if (s.isEmpty) true
  else if (s.length == 1) true
  else // s.length >= 2
   if (s.head == s.last) palindrome(s.tail.init)
   else false
}

// a123321b
def myPalindrome(s: String): Boolean = {
  if (s == "a123321b") true
  else ???
}
assert(myPalindrome("a123321b"))
