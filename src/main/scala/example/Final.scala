package example

class Final
  extends signatures.Expression
    with signatures.data.Negate
    with signatures.data.Add
    with signatures.data.Constant
    with signatures.operations.Evaluate
    with signatures.operations.Show
    with signatures.operations.Double
    with implementations.AdditiveDouble
    with implementations.AdditiveEvaluation
    with implementations.AdditiveShow
    with implementations.ConstantDouble
    with implementations.ConstantEvaluation
    with implementations.ConstantShow {
  type exp = CanShow with CanEval with CanDouble
  override def Neg(e: exp): exp =
    new Neg with ShowNeg with EvalNeg with DoubleNeg { val expression = e }
  override def Add(l: exp, r: exp): exp =
    new Add with ShowAdd with EvalAdd with DoubleAdd { val left = l; val right = r }
  override def Constant(v: Double): exp =
    new Constant with ShowConstant with EvalConstant with DoubleConstant { val value = v }
}

object FinalExample extends App {
  val f = new Final
  val e = f.Add(f.Constant(3), f.Neg(f.Constant(4))).timesTwo
  println(s"${e.show} evaluates to ${e.eval}")
}
