package example.signatures.operations

import example.signatures.Expression

trait Show { self: Expression =>
  type exp <: CanShow
  trait CanShow {
    def show: String
  }
}

