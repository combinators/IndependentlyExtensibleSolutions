package example.implementations

import example.signatures

trait ConstantDouble { self: signatures.operations.Double with signatures.data.Constant =>
  trait DoubleConstant extends CanDouble { self: Constant =>
    def timesTwo: exp = Constant(2 * value)
  }
}