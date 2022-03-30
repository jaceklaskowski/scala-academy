import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class BoardSpec extends AnyFlatSpec with should.Matchers {

  "A Board" should "stick to m and n" in {
    val board = Board(m = 3, n = 5)
    board.n should be (5)
  }

  it should "move pieces" in {
    val board = Board(5,5)
    val id1 = "id1"
    board
      .execute(Create('>', 0, 0, id1))
      .execute(Move(id1, 3))
    board.arrows(id1) should be (Create('>', 3, 3, id1))
  }
}