package net.scalax.simple.adt
package instance

trait ADTValue[T <: AdtType] {
  def value: T
}

object ADTValue extends LawTraitImplicit {

  implicit def posImplicit2[Target, I1, Tail <: AdtType](implicit
    t1: AdtFunction[Target, I1]
  ): ADTValue[Successor[AdtFunction[Target, I1], Tail]] =
    new ADTValue[Successor[AdtFunction[Target, I1], Tail]] {
      override def value: Successor[AdtFunction[Target, I1], Tail] =
        Successor.Left[AdtFunction[Target, I1], Tail](t1)
    }

  implicit def oneImplicit3[Target, I1](implicit t1: AdtFunction[Target, I1]): ADTValue[One[AdtFunction[Target, I1]]] =
    new ADTValue[One[AdtFunction[Target, I1]]] {
      override def value: One[AdtFunction[Target, I1]] = One.value(t1)
    }

}

trait LawTraitImplicit {

  implicit def posImplicit1[Target, I1, Tail <: AdtType](implicit
    t1: ADTValue[Tail]
  ): ADTValue[Successor[AdtFunction[Target, I1], Tail]] =
    new ADTValue[Successor[AdtFunction[Target, I1], Tail]] {
      override def value: Successor[AdtFunction[Target, I1], Tail] = Successor.Right(t1.value)
    }

}
