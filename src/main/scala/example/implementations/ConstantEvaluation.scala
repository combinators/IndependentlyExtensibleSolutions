package example.implementations

import example.signatures

trait ConstantEvaluation { self: signatures.operations.Evaluate with signatures.data.Constant =>
  trait EvalConstant extends CanEval { self: Constant =>
    def eval: Double = value
  }
}
