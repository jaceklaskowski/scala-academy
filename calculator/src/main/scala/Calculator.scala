class Calculator {

  // Ctrl+Shift+ENTER
  def add(x: Int, y: Int): Int = x + y

  def subtract(x: Int, y: Int): Int = x - y

  def multiply(x: Int, y: Int): Int = x * y

  def divide(x: Int, y: Int): Int = x / y

  def modulo(x: Int, y: Int): Int = {
    x % y
  }

  def calculate(x: Int, y: Int, op: String): Int = {
    if (op == "+") {
      // Daniel
      add(x, y)
    } else if (op == "-") {
      subtract(x, y)
    } else if (op == "*") {
      multiply(x, y)
    } else if (op == "%") {
      modulo(x, y)
    } else {
      divide(x, y)
    }
  }

  def isOperatorValid(op: String): Boolean = {
    op == "*" || op == "/" || op == "+" || op == "-"
  }

}
