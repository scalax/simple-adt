package net.scalax.simple.adt
package instance

sealed trait AdtType
trait Successor[H1, T1 <: AdtType] extends AdtType {
  def tailFold[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU
}
trait One[H1] extends AdtType {
  def value: H1
}

object Successor {

  object Left {
    def apply[H1, T1 <: AdtType](h: H1): Successor[H1, T1] =
      new Successor[H1, T1] {
        override def tailFold[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
      }

    def unapply[H1](u: Successor[H1, ? <: AdtType]): Option[H1] =
      u.tailFold[Option[H1]]((h1: H1) => Some(h1), _ => None)
  }

  object Right {
    def apply[H1, T1 <: AdtType](r: T1): Successor[H1, T1] =
      new Successor[H1, T1] {
        override def tailFold[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
      }

    def unapply[T1 <: AdtType](u: Successor[?, T1]): Option[T1] =
      u.tailFold[Option[T1]](_ => None, (t1: T1) => Some(t1))
  }

}

object One {

  def value[T](t: T): One[T] = new One[T] {
    override def value: T = t
  }

  def unapply[T](one: One[T]): Some[T] = Some(one.value)

}
