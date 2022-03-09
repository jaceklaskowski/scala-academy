import scala.::
// Exercise
// Stworz klase Liczba
// z dwoma metodami (defs)
// followedBy
// ::
// Wykonaj Liczba(1) followedBy Liczba(2)
// 1,2

// Liczba(1) followedBy Liczba(2)
// Liczba(1).followedBy(Liczba(2))

// Liczba(1)
class Liczba(val n: Int) {
  def followedBy(that: Liczba) = {
    s"${this.n},${that.n}"
  }

  def ::(that: Liczba) = {
    this followedBy that
  }
}
object Liczba {
  def apply(n: Int): Liczba = new Liczba(n)
}

Liczba(1) followedBy Liczba(2)

// Wykonaj Liczba(1) :: Liczba(2)
// 2,1

Liczba(1) :: Liczba(2)
// Why?!
assert(Liczba(1).::(Liczba(2)) != "2,1")

// break 1:55pm - 2:05pm

//1 :: Nil // OK
//1.::(Nil) // Not OK - no special meaning

// Exercise
// Oblicz sume List(1,2,3) uzywajac foldLeft
val f: (String, Int) => String = { (s, n) =>
  if (s == "POCZATEK") {
    // pierwszy obrot
    n.toString
  } else
  s"$s+$n"
}
List(1,2,3).foldLeft(z = "POCZATEK")(f)

// z: ""
// ("")+1
// (""+1)+2
// ((""+1)+2)+3

// List

// "1+2+3"

// KONIEC: 14:50

