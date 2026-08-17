package net.scalax.simple.adt
package instance

trait ADTFoldApplyImpl1[Target0, T1] {
  def fold1[TargetOther0 >: Target0](param1: T1 => TargetOther0): TargetOther0
}

trait ADTFoldApplyImpl2[Target, T1, T2] {
  def fold2[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl1[TargetOther, T2]
}

trait ADTFoldApplyImpl3[Target, T1, T2, T3] {
  def fold3[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl2[TargetOther, T2, T3]
}

trait ADTFoldApplyImpl4[Target, T1, T2, T3, T4] {
  def fold4[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl3[TargetOther, T2, T3, T4]
}

trait ADTFoldApplyImpl5[Target, T1, T2, T3, T4, T5] {
  def fold5[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl4[TargetOther, T2, T3, T4, T5]
}

trait ADTFoldApplyImpl6[Target, T1, T2, T3, T4, T5, T6] {
  def fold6[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl5[TargetOther, T2, T3, T4, T5, T6]
}

trait ADTFoldApplyImpl7[Target, T1, T2, T3, T4, T5, T6, T7] {
  def fold7[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl6[TargetOther, T2, T3, T4, T5, T6, T7]
}

trait ADTFoldApplyImpl8[Target, T1, T2, T3, T4, T5, T6, T7, T8] {
  def fold8[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl7[TargetOther, T2, T3, T4, T5, T6, T7, T8]
}

trait ADTFoldApplyImpl9[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9] {
  def fold9[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl8[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9]
}

trait ADTFoldApplyImpl10[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] {
  def fold10[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl9[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10]
}

trait ADTFoldApplyImpl11[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] {
  def fold11[TargetOther >: Target](param1: T1 => TargetOther): ADTFoldApplyImpl10[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
}

trait ADTFoldApplyImpl12[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] {
  def fold12[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl11[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
}

trait ADTFoldApplyImpl13[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] {
  def fold13[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl12[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
}

trait ADTFoldApplyImpl14[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
  def fold14[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl13[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
}

trait ADTFoldApplyImpl15[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
  def fold15[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl14[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
}

trait ADTFoldApplyImpl16[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
  def fold16[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl15[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
}

trait ADTFoldApplyImpl17[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
  def fold17[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl16[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
}

trait ADTFoldApplyImpl18[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
  def fold18[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl17[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
}

trait ADTFoldApplyImpl19[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
  def fold19[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl18[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
}

trait ADTFoldApplyImpl20[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
  def fold20[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl19[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
}

trait ADTFoldApplyImpl21[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
  def fold21[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl20[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
}

trait ADTFoldApplyImpl22[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
  def fold22[TargetOther >: Target](
    param1: T1 => TargetOther
  ): ADTFoldApplyImpl21[TargetOther, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
}
