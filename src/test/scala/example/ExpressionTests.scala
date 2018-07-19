package example

import org.scalatest.FunSpec

class ExpressionTests extends FunSpec  {
  val f = new Final
  describe("The expression 3 + -(-(1) + 5)") {
    val exp = f.Add(f.Constant(3), f.Neg(f.Add(f.Neg(f.Constant(1)), f.Constant(5))))
    describe ("when evaluating") {
      it("should produce -1") {
        assert(exp.eval == -1)
      }
    }
    describe("when shown") {
      it("should produce the expected string") {
        assert(exp.show.replace(" ", "") == "3.0+-(-(1.0)+5.0)")
      }
    }
    describe("when multiplied by two") {
      it("should evaluate to -2") {
        assert(exp.timesTwo.eval == -2)
      }
      it("should propagate multiplication to constants") {
        assert(exp.timesTwo.show.replace(" ", "") == "6.0+-(-(2.0)+10.0)")
      }
    }
  }
}