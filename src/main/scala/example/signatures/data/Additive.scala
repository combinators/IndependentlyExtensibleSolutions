package example.signatures.data

import example.signatures.Expression

trait Add { self: Expression =>
  def Add(left: exp, right: exp): exp
  trait Add {
    val left: exp
    val right: exp
  }
}

trait Negate { self: Expression =>
  def Neg(expression: exp): exp
  trait Neg {
    val expression: exp
  }
}
