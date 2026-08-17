package net.scalax.simple.adt
package instance

object AppendTail7 {

  trait Ctx1[Target] {
    trait ToTarget[ProInstance1 <: AdtHList, ProInstance2 <: AdtType]
        extends SimpleAppenderAlias.AppenderAlias[
          ({ type Func2[X1 <: AdtHList, X2 <: AdtType] = (X1, X2) => Target })#Func2,
          AdtHList,
          AdtType,
          ({ type Append1[TItem, Tail <: AdtHList] = AdtHList.UsePositive[TItem => Target, Tail] })#Append1,
          Successor,
          ProInstance1,
          ProInstance2
        ] { AppendAdtSelf =>
      override def nextAlias[T1]: ToTarget[AdtHList.UsePositive[T1 => Target, ProInstance1], Successor[T1, ProInstance2]] =
        new ToTarget[AdtHList.UsePositive[T1 => Target, ProInstance1], Successor[T1, ProInstance2]] {
          override def current: (AdtHList.UsePositive[T1 => Target, ProInstance1], Successor[T1, ProInstance2]) => Target =
            (
              param: AdtHList.UsePositive[T1 => Target, ProInstance1],
              c: Successor[T1, ProInstance2]
            ) => {
              c.tailFold[Target]((x1: T1) => param.head(x1), (pro2: ProInstance2) => AppendAdtSelf.current(param.tail, pro2))
            }

        }
    }

    object ToTarget {
      def take[A <: AdtHList, B <: AdtType](a: A)(implicit k: ToTarget[A, B]): B => Target = (b: B) => k.current(a, b)

      implicit def positiveImplicit[Item, ProInstance1 <: AdtHList, ProInstance2 <: AdtType](implicit
        tail: ToTarget[ProInstance1, ProInstance2]
      ): ToTarget[AdtHList.UsePositive[Item => Target, ProInstance1], Successor[Item, ProInstance2]] = tail.nextAlias[Item]

      implicit def zeroImplicit[Item]: ToTarget[AdtHList.UsePositive[Item => Target, AdtHList], One[Item]] =
        new ToTarget[AdtHList.UsePositive[Item => Target, AdtHList], One[Item]] {
          override def current: (AdtHList.UsePositive[Item => Target, AdtHList], One[Item]) => Target =
            (a: AdtHList.Positive[Item => Target, AdtHList], b: One[Item]) => {
              a.head(b.value)
            }
        }

    }

  }

  val ctxAny: Ctx1[Any] = new Ctx1[Any] {
    //
  }
  def ctxBuild[T]: Ctx1[T] = ctxAny.asInstanceOf[Ctx1[T]]

  def apply[T]: Ctx1[T] = ctxBuild[T]

}
