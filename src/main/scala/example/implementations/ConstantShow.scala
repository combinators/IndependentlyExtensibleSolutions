package example.implementations

import example.signatures

trait ConstantShow { self: signatures.operations.Show with signatures.data.Constant =>
  trait ShowConstant extends CanShow { self: Constant =>
    def show: String = value.toString
  }
}
