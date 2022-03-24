import scala.collection.mutable.ArrayBuffer

case class PriorityList(n: Int) {

  val _ns: ArrayBuffer[Int] = new ArrayBuffer[Int]()
  _ns.addOne(n)

  def add(n: Int): PriorityList = {
    _ns.addOne(n)

    // Slowo kluczowe wskazujace na biezacy obiekt
    this
  }

  // Variable-length arguments
  def add(ns: Int*): PriorityList = {
    ns.foreach(_ns.addOne)
    this
  }

  def foreach(f: Int => Unit): Unit = ???

  def tail: PriorityList = {
    val elementy = _ns.tail
    val pl = PriorityList(elementy.head)
    elementy.tail.foreach(pl.add)
    pl
  }

  def head: Int = {
    _ns.sorted.head
  }

  override def toString = {
    s"PriorityList(${_ns.sortInPlace().mkString(",")})"
  }
}

val pl = PriorityList(2).add(5).add(1).add(5)
pl.tail.tail
pl
