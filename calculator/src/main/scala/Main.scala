import scala.io.StdIn.readLine
import scala.sys.exit

object Main extends App {

  // to opakowanie naszego kalkulatora

  val calculator = new Calculator

  while (true) {
    val x = readLine("Podaj x: ").toInt
    val y = readLine("Podaj y: ").toInt

    // 1. [X] Powtorzenie linii z op
    // 2. [X] Znajomosc Main dostepnych operacji
    // 2a. [X] Zawily warunek if

    var op = readLine("Podaj symbol operacji: ")
    // while (niepoprawnyOperator) {
    // FIXME Nie podoba mi sie calculator.isOperatorValid
    // val calc1 = new Calculator
    // val calc2 = new Calculator
    // calc1.isOperatorValid(op) != calc2.isOperatorValid(op)
    // companion object
    while (!calculator.isOperatorValid(op)) {
      println(s"ERROR: Unknown operator: $op")
      op = readLine("Podaj symbol operacji: ")
    }

    println(calculator.calculate(x, y, op))

    val answer = readLine("Czy kontynuowac? (Y/n) ")
    if (answer == "n") {
      println("Dziekujemy za korzystanie z naszych uslug. Bye, bye...")
      exit(0)
    }
  }
}
