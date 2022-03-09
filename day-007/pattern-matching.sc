// Pattern Matching
// wyrazenie match {
//   case ... => ...
// }

1 match {
  case 0 => "Zero"
  case 1 => "Jedynka"
  case 2 => "Dwojka"
}

def translate(n: Int): String = ???

// translate(0) = zero
// translate(1) = jeden
// translate(2) = dwa
// translate(..) = nieznane

// Exercise: Napisz translate korzystajac z if
def translateIf(n: Int): String = {
  if (n == 0) "zero"
  else if (n == 1) "jeden"
  else if (n == 2) "dwa"
  else "nieznane"
}

// Exercise: Napisz translate korzystajac z match expression
// wyrazenie match {
//   case ... => ...
// }
def translateMatch(n: Int): String = {
  n match {
    case 0 => "zero"
    case 1 => "jeden"
    case 2 => "dwa"
    // catch-all
    // default
    case _ => "nieznane"
  }
}

5 match {
  case 0 => false
  case _ => true
}

// Exercise
// Napisac powyzsze z if'em
if (5 == 0) false
else true

// Exercise
// Napisac defa, z pojedynczym argumentem
// input: Seq[Int]
// ktory dopasowuje liste z wejscia
// case Seq()
// case pojedynczy element
// case dwa elementy
// default
// w kazdym case zwraca ostatni element
def lastMatch(ns: Seq[Int]): Option[Int] = {
  ns match {
    case Seq() => None
    case Seq(n) => Some(n)
    case Seq(_, m) => Some(m)
    case x => lastMatch(x.tail)
  }
}

Seq() == Nil
Seq(1) == 1 :: Nil
Seq(1,2) == 1 :: 2 :: Nil
