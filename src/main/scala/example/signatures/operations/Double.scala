package example.signatures.operations

import example.signatures.Expression

trait Double { self: Expression =>
  type exp <: CanDouble
  trait CanDouble {
    def timesTwo: exp
  }
}
