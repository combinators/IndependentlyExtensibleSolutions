package example.implementations

import example.signatures

trait AdditiveEvaluation { self: signatures.operations.Evaluate with signatures.data.Add with signatures.data.Negate =>
  trait EvalAdd extends CanEval { self: Add =>
    def eval: Double = left.eval + right.eval
  }
  trait EvalNeg extends CanEval { self: Neg =>
    def eval: Double = -1 * expression.eval
  }
}
