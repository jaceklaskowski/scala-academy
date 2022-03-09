//scala> :type null
//Null
//
//scala> :type ()
//Unit
//
//scala> null.toString
//java.lang.NullPointerException
//... 59 elided
//
//scala> None.toString
//val res2: String = None
//
//scala> None.exists(_ => true)
//val res3: Boolean = false
//
//scala> Option.apply(null)
//val res4: Option[Null] = None
//
//scala> Option.apply(4)
//val res5: Option[Int] = Some(4)
//
//scala> Option.apply(4).exists(_ => false)
//val res6: Boolean = false
//
//scala> Option.apply(4).exists(n => false)
//val res7: Boolean = false

Option(4)
Option(null)

// bedzie ciezko!
// wyjasnienie blokow nazwanych i anonimowych (nienazwanych)
// roznica miedzy () a {} przy wywolywaniu funkcji

def example(hello: String) = {
  println(s"Hello $hello")
}
example("world")

def alwaysJacek = "Jacek"

example(alwaysJacek)

def alwaysDamian = {
  "Damian"
}
example(alwaysDamian)

// val
// def
def xXx = {
  println("Wykonano mnie")
  if (true) {
    println("true")
  } else println("false")
  "Damian_2"
}
example(xXx)

example {
  "cos tam"
  "inne cos tam"
  if (4 + 5 == 9) true
  else false
  "i na koncu wartosc"
}

// koniec ciezko

// Exercise
// Napisac funkcje/metode, ktora przyjmuje typ Option[Int]
// i println wartosc, jesli istnieje
// a jesli nie to println("Nie ma wartosci")
// TIP: Uzyj getOrElse

// 10:00 - 10:15

def optionDemo(n: Option[Int]) = {
  if (n.isEmpty) println("Nie ma wartosci")
  else println(n.get)
}
optionDemo(Some(4))
optionDemo(None)

def optionDemoGrzesiek(n: Option[Int]) = {
  // getOrElse
  val r = if (n.isEmpty) "Nie ma wartosci" else n.get
  println(r)
}
def optionDemoDaniel(n: Option[Int]) = {
  println(n.getOrElse("Nie ma wartosci"))
}
def optionDemoDaniel(n: Int) = optionDemoDaniel(Option(n))
optionDemoDaniel(Some(4))
optionDemoDaniel(None)

def optionDemoAnia(n: Option[Int]) = {
  println(n.getOrElse(n, "Nie ma wartosci"))
}
optionDemoAnia(Some(4))
optionDemoAnia(None)

// Exercise
// 1. Zaprezentuj uzycie Option.unless
// 2. Zaprezentuj uzycie Option.when

// Homework: Znalezc uzasadnienie unless and when

// Nil, null, Null, Nothing, None

// Nazwy w Scali pisane z wielkiej litery
// oznaczaja typy (class lub object)

// Nil (jak None) to object
// Nil - pusta lista
assert(Nil == List())

// None = pusty Option
assert(None == Option.empty)

// null
// Zaszlosc javowa = nie uzywac = zapomniec o istnieniu

// Null
// typ, ale nieuzyteczny

// Any
// ...wszystkie typy w Scali, np. Null
// Rowniez Unit
// Nothing

val lista = List(1,2,3)
println(lista)

List(List(1,2), List(3,4,5))

// Exercise
// Napisz def'a, ktory przyjmuje n: Int
// i zwraca liste n list
// map
val n = 3
0 to n
List(1,2,3)

val f: Int => List[String] = n => List("")
List(1,2,3).map(f) // List(List(""), List(""), List(""))

// Mateusz's case
List().toString == "List()"
List("List()" * n)

// Rafal's case
List.fill(n)(List(""))
