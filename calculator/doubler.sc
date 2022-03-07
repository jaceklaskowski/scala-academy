// doubler: Int => Int

// 1. Jak definiuje sie funkcje w Scali?
// Czym sa funkcje w Scali?

val doubler1: Int => Int = { n =>
  n * 2
}

val doubler2: Int => Int = n =>
  n * 2

val doubler3: Int => Int = n => {
  n * 2
}

val doubler4: Int => Int = n => n * 2

val doubler: Int => Int = _ * 2

val doubler5 = (_: Int) * 2

val twoInputs: (Int, String) => String = { (n, s) =>
  s * n
}
