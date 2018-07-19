package example.implementations

import example.signatures

trait AdditiveShow { self: signatures.operations.Show with signatures.data.Add with signatures.data.Negate =>
  trait ShowAdd extends CanShow { self: Add =>
    def show: String = s"${left.show} + ${right.show}"
  }

  trait ShowNeg extends CanShow { self: Neg =>
    def show: String = s"-(${expression.show})"
  }
}
