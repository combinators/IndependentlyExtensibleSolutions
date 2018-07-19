package example.implementations

import example.signatures

trait AdditiveDouble { self: signatures.operations.Double with signatures.data.Add with signatures.data.Negate =>
  trait DoubleAdd extends CanDouble { self: Add =>
    def timesTwo: exp = Add(left.timesTwo, right.timesTwo)
  }
  trait DoubleNeg extends CanDouble { self: Neg =>
    def timesTwo: exp = Neg(expression.timesTwo)
  }
}