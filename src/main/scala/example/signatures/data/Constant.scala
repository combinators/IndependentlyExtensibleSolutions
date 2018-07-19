package example.signatures.data

import example.signatures.Expression

trait Constant { self: Expression =>
  def Constant(value: Double): exp
  trait Constant {
    val value: Double
  }
}
