
package scala_func

import org.scalatest.FunSpec

class TestSuite1 extends FunSpec {
  import M0Final._

  describe("test cases") {
    it ("run test") {
      test()
    }


    def test() : Unit = {
      val op: Eval = new Eval

      assert (3.0 == op.apply(new Add(new Lit(1.0), new Lit(2.0))))
      assert (5.0 == op.apply(new Lit(5.0)))
    }
  }
}
