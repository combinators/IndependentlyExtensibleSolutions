package scala_func

import scala.language.higherKinds

trait M0 {
  trait Exp {
    def accept[R](v: visitor[R]): R
  }

  class Lit(value:Double) extends Exp {
    def accept[R](v: visitor[R]): R = v.visitLit(value)
  }

  class Add(left:Exp,right:Exp) extends Exp {
    def accept[R](v: visitor[R]): R = v.visitAdd(left,right)
  }
  type visitor[R] <: Visitor[R]
  trait Visitor[R] { self: visitor[R] =>
    def apply(t: Exp): R = t.accept(this)
    def visitLit(value:Double) : R
    def visitAdd(left:Exp,right:Exp) : R
  }
  // base types

  // base operations

  class Eval extends Visitor[Double] { self: visitor[Double] =>
    def visitLit(value:Double) : Double = value
    def visitAdd(left:Exp,right:Exp) : Double = {
      apply(left) + apply(right)
    }
  }

  class Id extends Visitor[Int] { self: visitor[Int] =>
    def visitLit(value:Double) : Int = 76407
    def visitAdd(left:Exp,right:Exp) : Int = 65665
  }
}

object M0Final extends M0 {
  type visitor[R] = Visitor[R]
}
