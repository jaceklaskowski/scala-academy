// Demo:
// safeStringOp(s: String, f: String => String): String
// to return the result of executing f on the input s string when s != null

def safeStringOp(s: String, f: String => String): String = {
  if (s != null) f(s)
  else s
}

val g: String => String = { s => s.toUpperCase }
safeStringOp("hello", g)

safeStringOp(null, g)
