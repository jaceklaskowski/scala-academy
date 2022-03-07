// Demo: Creating instances of List, Set and Map

// companion class to the object
class Person(val name: String) {
}

// companion object to the class
object Person {
  def apply(name: String): Person = new Person(name)
}

val damian = new Person("Damian")
damian.name

val jacek = Person("Jacek")

// val l = new List[Int]()
// l.add(1)
// l.add(2)
// l.add(3)

List.apply(1,2,3)
List(1,2,3)

// Set is exactly the same

// Let's have a look at Map

Map.apply((1, "one"), (2, "two"), (3, "three"))
Map((1, "one"), (2, "two"), (3, "three"))
Map(
  (1.0, "one"),
  (2, "two"),
  (3, "three"))
Map(
  1 -> "one",
  2 -> "two",
  3 -> "three")

val ns = List(0,0,1,2,3,3)

val f: Int => Int = { n =>
  println(s"n=${n}")
  if (n < 2) 3
  else 5
}

// Exercise: Define g by f
val g: Int => Boolean = { n => f(n) < 4 }

// Almost like "map + distinct" but remembers the initial values
// List(3,3,3,5,5,5)
ns.distinctBy(f)

ns.partition(g)

ns.map(_ * 2)

ns.flatMap(n => 0 to n)
ns.map(n => 0 to n).flatten
