def combination(x: Int, y: Int, f: (Int, Int) => Int): Int = {
  f(x, y)
}

val f: (Int, Int) => Int = { (x, y) =>
  x + y
}

combination(5, 7, f)
combination(5, 7, (x, y) => x + y)
combination(5, 7, _ + _)
combination(5, 7, f(_, _)) // rather not
