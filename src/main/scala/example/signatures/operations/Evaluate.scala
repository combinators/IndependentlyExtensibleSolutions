package example.signatures.operations

import example.signatures.Expression

trait Evaluate { self: Expression =>
  type exp <: CanEval
  trait CanEval {
    def eval: scala.Double
  }
}
