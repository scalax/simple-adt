package net.scalax.simple.adt
package instance

class CoProduct1[T1](foldImpl: One[T1]) extends One[T1] with ADTFoldApplyImpl1[Nothing, T1] { CoProductSelf =>
  override def value: T1                                                             = foldImpl.value
  @inline def fold[TargetOther0](param1: T1 => TargetOther0): TargetOther0           = param1(CoProductSelf.value)
  @inline override def fold1[TargetOther0](param1: T1 => TargetOther0): TargetOther0 = CoProductSelf.fold[TargetOther0](param1)
}

class CoProduct2[T1, T2](
  instance: Successor[
    T1,

    One[T2]
  ]
) extends Successor[
      T1,

      One[T2]
    ]
    with ADTFoldApplyImpl2[Nothing, T1, T2] { CoProductSelf =>

  override def tailFold[Target](func1: T1 => Target, func2: One[T2] => Target): Target =
    instance.tailFold(func1, func2)

  def fold[Target](param1: T1 => Target, param2: T2 => Target): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(param2, AdtHList.zero)
      )
    )
    func(instance)
  }

  override def fold2[Target1](func1: T1 => Target1): ADTFoldApplyImpl1[Target1, T2] = {

    new ADTFoldApplyImpl1[Target1, T2] {
      override def fold1[Target2 >: Target1](func2: T2 => Target2): Target2 = {
        CoProductSelf.fold[Target2](func1, func2)
      }
    }

  }

}

class CoProduct3[T1, T2, T3](
  instance: Successor[
    T1,

    Successor[
      T2,

      One[T3]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        One[T3]
      ]
    ]
    with ADTFoldApplyImpl3[Nothing, T1, T2, T3] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      One[T3]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](param1: T1 => Target, param2: T2 => Target, param3: T3 => Target): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(param3, AdtHList.zero)
        )
      )
    )
    func(instance)
  }

  override def fold3[Target1](func1: T1 => Target1): ADTFoldApplyImpl2[Target1, T2, T3] = {

    new ADTFoldApplyImpl2[Target1, T2, T3] {
      override def fold2[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl1[Target2, T3] =

        new ADTFoldApplyImpl1[Target2, T3] {
          override def fold1[Target3 >: Target2](func3: T3 => Target3): Target3 = {
            CoProductSelf.fold[Target3](func1, func2, func3)
          }
        }

    }

  }

}

class CoProduct4[T1, T2, T3, T4](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        One[T4]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          One[T4]
        ]
      ]
    ]
    with ADTFoldApplyImpl4[Nothing, T1, T2, T3, T4] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        One[T4]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](param1: T1 => Target, param2: T2 => Target, param3: T3 => Target, param4: T4 => Target): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(param4, AdtHList.zero)
          )
        )
      )
    )
    func(instance)
  }

  override def fold4[Target1](func1: T1 => Target1): ADTFoldApplyImpl3[Target1, T2, T3, T4] = {

    new ADTFoldApplyImpl3[Target1, T2, T3, T4] {
      override def fold3[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl2[Target2, T3, T4] =

        new ADTFoldApplyImpl2[Target2, T3, T4] {
          override def fold2[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl1[Target3, T4] =

            new ADTFoldApplyImpl1[Target3, T4] {
              override def fold1[Target4 >: Target3](func4: T4 => Target4): Target4 = {
                CoProductSelf.fold[Target4](func1, func2, func3, func4)
              }
            }

        }

    }

  }

}

class CoProduct5[T1, T2, T3, T4, T5](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          One[T5]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            One[T5]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl5[Nothing, T1, T2, T3, T4, T5] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          One[T5]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](param1: T1 => Target, param2: T2 => Target, param3: T3 => Target, param4: T4 => Target, param5: T5 => Target): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(param5, AdtHList.zero)
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold5[Target1](func1: T1 => Target1): ADTFoldApplyImpl4[Target1, T2, T3, T4, T5] = {

    new ADTFoldApplyImpl4[Target1, T2, T3, T4, T5] {
      override def fold4[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl3[Target2, T3, T4, T5] =

        new ADTFoldApplyImpl3[Target2, T3, T4, T5] {
          override def fold3[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl2[Target3, T4, T5] =

            new ADTFoldApplyImpl2[Target3, T4, T5] {
              override def fold2[Target4 >: Target3](func4: T4 => Target4): ADTFoldApplyImpl1[Target4, T5] =

                new ADTFoldApplyImpl1[Target4, T5] {
                  override def fold1[Target5 >: Target4](func5: T5 => Target5): Target5 = {
                    CoProductSelf.fold[Target5](func1, func2, func3, func4, func5)
                  }
                }

            }

        }

    }

  }

}

class CoProduct6[T1, T2, T3, T4, T5, T6](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            One[T6]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              One[T6]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl6[Nothing, T1, T2, T3, T4, T5, T6] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            One[T6]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(param6, AdtHList.zero)
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold6[Target1](func1: T1 => Target1): ADTFoldApplyImpl5[Target1, T2, T3, T4, T5, T6] = {

    new ADTFoldApplyImpl5[Target1, T2, T3, T4, T5, T6] {
      override def fold5[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl4[Target2, T3, T4, T5, T6] =

        new ADTFoldApplyImpl4[Target2, T3, T4, T5, T6] {
          override def fold4[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl3[Target3, T4, T5, T6] =

            new ADTFoldApplyImpl3[Target3, T4, T5, T6] {
              override def fold3[Target4 >: Target3](func4: T4 => Target4): ADTFoldApplyImpl2[Target4, T5, T6] =

                new ADTFoldApplyImpl2[Target4, T5, T6] {
                  override def fold2[Target5 >: Target4](func5: T5 => Target5): ADTFoldApplyImpl1[Target5, T6] =

                    new ADTFoldApplyImpl1[Target5, T6] {
                      override def fold1[Target6 >: Target5](func6: T6 => Target6): Target6 = {
                        CoProductSelf.fold[Target6](func1, func2, func3, func4, func5, func6)
                      }
                    }

                }

            }

        }

    }

  }

}

class CoProduct7[T1, T2, T3, T4, T5, T6, T7](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              One[T7]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                One[T7]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl7[Nothing, T1, T2, T3, T4, T5, T6, T7] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              One[T7]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(param7, AdtHList.zero)
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold7[Target1](func1: T1 => Target1): ADTFoldApplyImpl6[Target1, T2, T3, T4, T5, T6, T7] = {

    new ADTFoldApplyImpl6[Target1, T2, T3, T4, T5, T6, T7] {
      override def fold6[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl5[Target2, T3, T4, T5, T6, T7] =

        new ADTFoldApplyImpl5[Target2, T3, T4, T5, T6, T7] {
          override def fold5[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl4[Target3, T4, T5, T6, T7] =

            new ADTFoldApplyImpl4[Target3, T4, T5, T6, T7] {
              override def fold4[Target4 >: Target3](func4: T4 => Target4): ADTFoldApplyImpl3[Target4, T5, T6, T7] =

                new ADTFoldApplyImpl3[Target4, T5, T6, T7] {
                  override def fold3[Target5 >: Target4](func5: T5 => Target5): ADTFoldApplyImpl2[Target5, T6, T7] =

                    new ADTFoldApplyImpl2[Target5, T6, T7] {
                      override def fold2[Target6 >: Target5](func6: T6 => Target6): ADTFoldApplyImpl1[Target6, T7] =

                        new ADTFoldApplyImpl1[Target6, T7] {
                          override def fold1[Target7 >: Target6](func7: T7 => Target7): Target7 = {
                            CoProductSelf.fold[Target7](func1, func2, func3, func4, func5, func6, func7)
                          }
                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct8[T1, T2, T3, T4, T5, T6, T7, T8](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                One[T8]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  One[T8]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl8[Nothing, T1, T2, T3, T4, T5, T6, T7, T8] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                One[T8]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(param8, AdtHList.zero)
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold8[Target1](func1: T1 => Target1): ADTFoldApplyImpl7[Target1, T2, T3, T4, T5, T6, T7, T8] = {

    new ADTFoldApplyImpl7[Target1, T2, T3, T4, T5, T6, T7, T8] {
      override def fold7[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl6[Target2, T3, T4, T5, T6, T7, T8] =

        new ADTFoldApplyImpl6[Target2, T3, T4, T5, T6, T7, T8] {
          override def fold6[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl5[Target3, T4, T5, T6, T7, T8] =

            new ADTFoldApplyImpl5[Target3, T4, T5, T6, T7, T8] {
              override def fold5[Target4 >: Target3](func4: T4 => Target4): ADTFoldApplyImpl4[Target4, T5, T6, T7, T8] =

                new ADTFoldApplyImpl4[Target4, T5, T6, T7, T8] {
                  override def fold4[Target5 >: Target4](func5: T5 => Target5): ADTFoldApplyImpl3[Target5, T6, T7, T8] =

                    new ADTFoldApplyImpl3[Target5, T6, T7, T8] {
                      override def fold3[Target6 >: Target5](func6: T6 => Target6): ADTFoldApplyImpl2[Target6, T7, T8] =

                        new ADTFoldApplyImpl2[Target6, T7, T8] {
                          override def fold2[Target7 >: Target6](func7: T7 => Target7): ADTFoldApplyImpl1[Target7, T8] =

                            new ADTFoldApplyImpl1[Target7, T8] {
                              override def fold1[Target8 >: Target7](func8: T8 => Target8): Target8 = {
                                CoProductSelf.fold[Target8](func1, func2, func3, func4, func5, func6, func7, func8)
                              }
                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct9[T1, T2, T3, T4, T5, T6, T7, T8, T9](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  One[T9]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    One[T9]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl9[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  One[T9]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(param9, AdtHList.zero)
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold9[Target1](func1: T1 => Target1): ADTFoldApplyImpl8[Target1, T2, T3, T4, T5, T6, T7, T8, T9] = {

    new ADTFoldApplyImpl8[Target1, T2, T3, T4, T5, T6, T7, T8, T9] {
      override def fold8[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl7[Target2, T3, T4, T5, T6, T7, T8, T9] =

        new ADTFoldApplyImpl7[Target2, T3, T4, T5, T6, T7, T8, T9] {
          override def fold7[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl6[Target3, T4, T5, T6, T7, T8, T9] =

            new ADTFoldApplyImpl6[Target3, T4, T5, T6, T7, T8, T9] {
              override def fold6[Target4 >: Target3](func4: T4 => Target4): ADTFoldApplyImpl5[Target4, T5, T6, T7, T8, T9] =

                new ADTFoldApplyImpl5[Target4, T5, T6, T7, T8, T9] {
                  override def fold5[Target5 >: Target4](func5: T5 => Target5): ADTFoldApplyImpl4[Target5, T6, T7, T8, T9] =

                    new ADTFoldApplyImpl4[Target5, T6, T7, T8, T9] {
                      override def fold4[Target6 >: Target5](func6: T6 => Target6): ADTFoldApplyImpl3[Target6, T7, T8, T9] =

                        new ADTFoldApplyImpl3[Target6, T7, T8, T9] {
                          override def fold3[Target7 >: Target6](func7: T7 => Target7): ADTFoldApplyImpl2[Target7, T8, T9] =

                            new ADTFoldApplyImpl2[Target7, T8, T9] {
                              override def fold2[Target8 >: Target7](func8: T8 => Target8): ADTFoldApplyImpl1[Target8, T9] =

                                new ADTFoldApplyImpl1[Target8, T9] {
                                  override def fold1[Target9 >: Target8](func9: T9 => Target9): Target9 = {
                                    CoProductSelf.fold[Target9](func1, func2, func3, func4, func5, func6, func7, func8, func9)
                                  }
                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    One[T10]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      One[T10]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl10[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    One[T10]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(param10, AdtHList.zero)
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold10[Target1](func1: T1 => Target1): ADTFoldApplyImpl9[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {

    new ADTFoldApplyImpl9[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10] {
      override def fold9[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl8[Target2, T3, T4, T5, T6, T7, T8, T9, T10] =

        new ADTFoldApplyImpl8[Target2, T3, T4, T5, T6, T7, T8, T9, T10] {
          override def fold8[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl7[Target3, T4, T5, T6, T7, T8, T9, T10] =

            new ADTFoldApplyImpl7[Target3, T4, T5, T6, T7, T8, T9, T10] {
              override def fold7[Target4 >: Target3](func4: T4 => Target4): ADTFoldApplyImpl6[Target4, T5, T6, T7, T8, T9, T10] =

                new ADTFoldApplyImpl6[Target4, T5, T6, T7, T8, T9, T10] {
                  override def fold6[Target5 >: Target4](func5: T5 => Target5): ADTFoldApplyImpl5[Target5, T6, T7, T8, T9, T10] =

                    new ADTFoldApplyImpl5[Target5, T6, T7, T8, T9, T10] {
                      override def fold5[Target6 >: Target5](func6: T6 => Target6): ADTFoldApplyImpl4[Target6, T7, T8, T9, T10] =

                        new ADTFoldApplyImpl4[Target6, T7, T8, T9, T10] {
                          override def fold4[Target7 >: Target6](func7: T7 => Target7): ADTFoldApplyImpl3[Target7, T8, T9, T10] =

                            new ADTFoldApplyImpl3[Target7, T8, T9, T10] {
                              override def fold3[Target8 >: Target7](func8: T8 => Target8): ADTFoldApplyImpl2[Target8, T9, T10] =

                                new ADTFoldApplyImpl2[Target8, T9, T10] {
                                  override def fold2[Target9 >: Target8](func9: T9 => Target9): ADTFoldApplyImpl1[Target9, T10] =

                                    new ADTFoldApplyImpl1[Target9, T10] {
                                      override def fold1[Target10 >: Target9](func10: T10 => Target10): Target10 = {
                                        CoProductSelf.fold[Target10](func1, func2, func3, func4, func5, func6, func7, func8, func9, func10)
                                      }
                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      One[T11]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        One[T11]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl11[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      One[T11]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(param11, AdtHList.zero)
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold11[Target1](func1: T1 => Target1): ADTFoldApplyImpl10[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {

    new ADTFoldApplyImpl10[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] {
      override def fold10[Target2 >: Target1](func2: T2 => Target2): ADTFoldApplyImpl9[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =

        new ADTFoldApplyImpl9[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11] {
          override def fold9[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl8[Target3, T4, T5, T6, T7, T8, T9, T10, T11] =

            new ADTFoldApplyImpl8[Target3, T4, T5, T6, T7, T8, T9, T10, T11] {
              override def fold8[Target4 >: Target3](func4: T4 => Target4): ADTFoldApplyImpl7[Target4, T5, T6, T7, T8, T9, T10, T11] =

                new ADTFoldApplyImpl7[Target4, T5, T6, T7, T8, T9, T10, T11] {
                  override def fold7[Target5 >: Target4](func5: T5 => Target5): ADTFoldApplyImpl6[Target5, T6, T7, T8, T9, T10, T11] =

                    new ADTFoldApplyImpl6[Target5, T6, T7, T8, T9, T10, T11] {
                      override def fold6[Target6 >: Target5](func6: T6 => Target6): ADTFoldApplyImpl5[Target6, T7, T8, T9, T10, T11] =

                        new ADTFoldApplyImpl5[Target6, T7, T8, T9, T10, T11] {
                          override def fold5[Target7 >: Target6](func7: T7 => Target7): ADTFoldApplyImpl4[Target7, T8, T9, T10, T11] =

                            new ADTFoldApplyImpl4[Target7, T8, T9, T10, T11] {
                              override def fold4[Target8 >: Target7](func8: T8 => Target8): ADTFoldApplyImpl3[Target8, T9, T10, T11] =

                                new ADTFoldApplyImpl3[Target8, T9, T10, T11] {
                                  override def fold3[Target9 >: Target8](func9: T9 => Target9): ADTFoldApplyImpl2[Target9, T10, T11] =

                                    new ADTFoldApplyImpl2[Target9, T10, T11] {
                                      override def fold2[Target10 >: Target9](func10: T10 => Target10): ADTFoldApplyImpl1[Target10, T11] =

                                        new ADTFoldApplyImpl1[Target10, T11] {
                                          override def fold1[Target11 >: Target10](func11: T11 => Target11): Target11 = {
                                            CoProductSelf
                                              .fold[Target11](func1, func2, func3, func4, func5, func6, func7, func8, func9, func10, func11)
                                          }
                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        One[T12]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          One[T12]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl12[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        One[T12]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(param12, AdtHList.zero)
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold12[Target1](func1: T1 => Target1): ADTFoldApplyImpl11[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {

    new ADTFoldApplyImpl11[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] {
      override def fold11[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl10[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =

        new ADTFoldApplyImpl10[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] {
          override def fold10[Target3 >: Target2](func3: T3 => Target3): ADTFoldApplyImpl9[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =

            new ADTFoldApplyImpl9[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12] {
              override def fold9[Target4 >: Target3](func4: T4 => Target4): ADTFoldApplyImpl8[Target4, T5, T6, T7, T8, T9, T10, T11, T12] =

                new ADTFoldApplyImpl8[Target4, T5, T6, T7, T8, T9, T10, T11, T12] {
                  override def fold8[Target5 >: Target4](func5: T5 => Target5): ADTFoldApplyImpl7[Target5, T6, T7, T8, T9, T10, T11, T12] =

                    new ADTFoldApplyImpl7[Target5, T6, T7, T8, T9, T10, T11, T12] {
                      override def fold7[Target6 >: Target5](func6: T6 => Target6): ADTFoldApplyImpl6[Target6, T7, T8, T9, T10, T11, T12] =

                        new ADTFoldApplyImpl6[Target6, T7, T8, T9, T10, T11, T12] {
                          override def fold6[Target7 >: Target6](func7: T7 => Target7): ADTFoldApplyImpl5[Target7, T8, T9, T10, T11, T12] =

                            new ADTFoldApplyImpl5[Target7, T8, T9, T10, T11, T12] {
                              override def fold5[Target8 >: Target7](func8: T8 => Target8): ADTFoldApplyImpl4[Target8, T9, T10, T11, T12] =

                                new ADTFoldApplyImpl4[Target8, T9, T10, T11, T12] {
                                  override def fold4[Target9 >: Target8](func9: T9 => Target9): ADTFoldApplyImpl3[Target9, T10, T11, T12] =

                                    new ADTFoldApplyImpl3[Target9, T10, T11, T12] {
                                      override def fold3[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl2[Target10, T11, T12] =

                                        new ADTFoldApplyImpl2[Target10, T11, T12] {
                                          override def fold2[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl1[Target11, T12] =

                                            new ADTFoldApplyImpl1[Target11, T12] {
                                              override def fold1[Target12 >: Target11](func12: T12 => Target12): Target12 = {
                                                CoProductSelf.fold[Target12](
                                                  func1,
                                                  func2,
                                                  func3,
                                                  func4,
                                                  func5,
                                                  func6,
                                                  func7,
                                                  func8,
                                                  func9,
                                                  func10,
                                                  func11,
                                                  func12
                                                )
                                              }
                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          One[T13]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            One[T13]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl13[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          One[T13]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(param13, AdtHList.zero)
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold13[Target1](func1: T1 => Target1): ADTFoldApplyImpl12[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {

    new ADTFoldApplyImpl12[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] {
      override def fold12[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl11[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =

        new ADTFoldApplyImpl11[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] {
          override def fold11[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl10[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =

            new ADTFoldApplyImpl10[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] {
              override def fold10[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl9[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =

                new ADTFoldApplyImpl9[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13] {
                  override def fold9[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl8[Target5, T6, T7, T8, T9, T10, T11, T12, T13] =

                    new ADTFoldApplyImpl8[Target5, T6, T7, T8, T9, T10, T11, T12, T13] {
                      override def fold8[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl7[Target6, T7, T8, T9, T10, T11, T12, T13] =

                        new ADTFoldApplyImpl7[Target6, T7, T8, T9, T10, T11, T12, T13] {
                          override def fold7[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl6[Target7, T8, T9, T10, T11, T12, T13] =

                            new ADTFoldApplyImpl6[Target7, T8, T9, T10, T11, T12, T13] {
                              override def fold6[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl5[Target8, T9, T10, T11, T12, T13] =

                                new ADTFoldApplyImpl5[Target8, T9, T10, T11, T12, T13] {
                                  override def fold5[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl4[Target9, T10, T11, T12, T13] =

                                    new ADTFoldApplyImpl4[Target9, T10, T11, T12, T13] {
                                      override def fold4[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl3[Target10, T11, T12, T13] =

                                        new ADTFoldApplyImpl3[Target10, T11, T12, T13] {
                                          override def fold3[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl2[Target11, T12, T13] =

                                            new ADTFoldApplyImpl2[Target11, T12, T13] {
                                              override def fold2[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl1[Target12, T13] =

                                                new ADTFoldApplyImpl1[Target12, T13] {
                                                  override def fold1[Target13 >: Target12](func13: T13 => Target13): Target13 = {
                                                    CoProductSelf.fold[Target13](
                                                      func1,
                                                      func2,
                                                      func3,
                                                      func4,
                                                      func5,
                                                      func6,
                                                      func7,
                                                      func8,
                                                      func9,
                                                      func10,
                                                      func11,
                                                      func12,
                                                      func13
                                                    )
                                                  }
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            One[T14]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              One[T14]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl14[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            One[T14]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(param14, AdtHList.zero)
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold14[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl13[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {

    new ADTFoldApplyImpl13[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
      override def fold13[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl12[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =

        new ADTFoldApplyImpl12[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
          override def fold12[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl11[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =

            new ADTFoldApplyImpl11[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
              override def fold11[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl10[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =

                new ADTFoldApplyImpl10[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
                  override def fold10[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl9[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =

                    new ADTFoldApplyImpl9[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
                      override def fold9[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl8[Target6, T7, T8, T9, T10, T11, T12, T13, T14] =

                        new ADTFoldApplyImpl8[Target6, T7, T8, T9, T10, T11, T12, T13, T14] {
                          override def fold8[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl7[Target7, T8, T9, T10, T11, T12, T13, T14] =

                            new ADTFoldApplyImpl7[Target7, T8, T9, T10, T11, T12, T13, T14] {
                              override def fold7[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl6[Target8, T9, T10, T11, T12, T13, T14] =

                                new ADTFoldApplyImpl6[Target8, T9, T10, T11, T12, T13, T14] {
                                  override def fold6[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl5[Target9, T10, T11, T12, T13, T14] =

                                    new ADTFoldApplyImpl5[Target9, T10, T11, T12, T13, T14] {
                                      override def fold5[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl4[Target10, T11, T12, T13, T14] =

                                        new ADTFoldApplyImpl4[Target10, T11, T12, T13, T14] {
                                          override def fold4[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl3[Target11, T12, T13, T14] =

                                            new ADTFoldApplyImpl3[Target11, T12, T13, T14] {
                                              override def fold3[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl2[Target12, T13, T14] =

                                                new ADTFoldApplyImpl2[Target12, T13, T14] {
                                                  override def fold2[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl1[Target13, T14] =

                                                    new ADTFoldApplyImpl1[Target13, T14] {
                                                      override def fold1[Target14 >: Target13](func14: T14 => Target14): Target14 = {
                                                        CoProductSelf.fold[Target14](
                                                          func1,
                                                          func2,
                                                          func3,
                                                          func4,
                                                          func5,
                                                          func6,
                                                          func7,
                                                          func8,
                                                          func9,
                                                          func10,
                                                          func11,
                                                          func12,
                                                          func13,
                                                          func14
                                                        )
                                                      }
                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              One[T15]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              Successor[
                                T14,

                                One[T15]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl15[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              One[T15]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target,
    param15: T15 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(
                                  param14,

                                  AdtHList.UsePositive.append(param15, AdtHList.zero)
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold15[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl14[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {

    new ADTFoldApplyImpl14[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
      override def fold14[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl13[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =

        new ADTFoldApplyImpl13[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
          override def fold13[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl12[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =

            new ADTFoldApplyImpl12[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
              override def fold12[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl11[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =

                new ADTFoldApplyImpl11[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
                  override def fold11[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl10[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =

                    new ADTFoldApplyImpl10[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
                      override def fold10[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl9[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =

                        new ADTFoldApplyImpl9[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
                          override def fold9[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl8[Target7, T8, T9, T10, T11, T12, T13, T14, T15] =

                            new ADTFoldApplyImpl8[Target7, T8, T9, T10, T11, T12, T13, T14, T15] {
                              override def fold8[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl7[Target8, T9, T10, T11, T12, T13, T14, T15] =

                                new ADTFoldApplyImpl7[Target8, T9, T10, T11, T12, T13, T14, T15] {
                                  override def fold7[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl6[Target9, T10, T11, T12, T13, T14, T15] =

                                    new ADTFoldApplyImpl6[Target9, T10, T11, T12, T13, T14, T15] {
                                      override def fold6[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl5[Target10, T11, T12, T13, T14, T15] =

                                        new ADTFoldApplyImpl5[Target10, T11, T12, T13, T14, T15] {
                                          override def fold5[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl4[Target11, T12, T13, T14, T15] =

                                            new ADTFoldApplyImpl4[Target11, T12, T13, T14, T15] {
                                              override def fold4[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl3[Target12, T13, T14, T15] =

                                                new ADTFoldApplyImpl3[Target12, T13, T14, T15] {
                                                  override def fold3[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl2[Target13, T14, T15] =

                                                    new ADTFoldApplyImpl2[Target13, T14, T15] {
                                                      override def fold2[Target14 >: Target13](
                                                        func14: T14 => Target14
                                                      ): ADTFoldApplyImpl1[Target14, T15] =

                                                        new ADTFoldApplyImpl1[Target14, T15] {
                                                          override def fold1[Target15 >: Target14](func15: T15 => Target15): Target15 = {
                                                            CoProductSelf.fold[Target15](
                                                              func1,
                                                              func2,
                                                              func3,
                                                              func4,
                                                              func5,
                                                              func6,
                                                              func7,
                                                              func8,
                                                              func9,
                                                              func10,
                                                              func11,
                                                              func12,
                                                              func13,
                                                              func14,
                                                              func15
                                                            )
                                                          }
                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                One[T16]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              Successor[
                                T14,

                                Successor[
                                  T15,

                                  One[T16]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl16[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                One[T16]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target,
    param15: T15 => Target,
    param16: T16 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(
                                  param14,

                                  AdtHList.UsePositive.append(
                                    param15,

                                    AdtHList.UsePositive.append(param16, AdtHList.zero)
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold16[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl15[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {

    new ADTFoldApplyImpl15[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
      override def fold15[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl14[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =

        new ADTFoldApplyImpl14[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
          override def fold14[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl13[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =

            new ADTFoldApplyImpl13[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
              override def fold13[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl12[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =

                new ADTFoldApplyImpl12[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
                  override def fold12[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl11[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =

                    new ADTFoldApplyImpl11[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
                      override def fold11[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl10[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =

                        new ADTFoldApplyImpl10[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
                          override def fold10[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl9[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =

                            new ADTFoldApplyImpl9[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
                              override def fold9[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl8[Target8, T9, T10, T11, T12, T13, T14, T15, T16] =

                                new ADTFoldApplyImpl8[Target8, T9, T10, T11, T12, T13, T14, T15, T16] {
                                  override def fold8[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl7[Target9, T10, T11, T12, T13, T14, T15, T16] =

                                    new ADTFoldApplyImpl7[Target9, T10, T11, T12, T13, T14, T15, T16] {
                                      override def fold7[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl6[Target10, T11, T12, T13, T14, T15, T16] =

                                        new ADTFoldApplyImpl6[Target10, T11, T12, T13, T14, T15, T16] {
                                          override def fold6[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl5[Target11, T12, T13, T14, T15, T16] =

                                            new ADTFoldApplyImpl5[Target11, T12, T13, T14, T15, T16] {
                                              override def fold5[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl4[Target12, T13, T14, T15, T16] =

                                                new ADTFoldApplyImpl4[Target12, T13, T14, T15, T16] {
                                                  override def fold4[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl3[Target13, T14, T15, T16] =

                                                    new ADTFoldApplyImpl3[Target13, T14, T15, T16] {
                                                      override def fold3[Target14 >: Target13](
                                                        func14: T14 => Target14
                                                      ): ADTFoldApplyImpl2[Target14, T15, T16] =

                                                        new ADTFoldApplyImpl2[Target14, T15, T16] {
                                                          override def fold2[Target15 >: Target14](
                                                            func15: T15 => Target15
                                                          ): ADTFoldApplyImpl1[Target15, T16] =

                                                            new ADTFoldApplyImpl1[Target15, T16] {
                                                              override def fold1[Target16 >: Target15](
                                                                func16: T16 => Target16
                                                              ): Target16 = {
                                                                CoProductSelf.fold[Target16](
                                                                  func1,
                                                                  func2,
                                                                  func3,
                                                                  func4,
                                                                  func5,
                                                                  func6,
                                                                  func7,
                                                                  func8,
                                                                  func9,
                                                                  func10,
                                                                  func11,
                                                                  func12,
                                                                  func13,
                                                                  func14,
                                                                  func15,
                                                                  func16
                                                                )
                                                              }
                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  One[T17]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              Successor[
                                T14,

                                Successor[
                                  T15,

                                  Successor[
                                    T16,

                                    One[T17]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl17[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  One[T17]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target,
    param15: T15 => Target,
    param16: T16 => Target,
    param17: T17 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(
                                  param14,

                                  AdtHList.UsePositive.append(
                                    param15,

                                    AdtHList.UsePositive.append(
                                      param16,

                                      AdtHList.UsePositive.append(param17, AdtHList.zero)
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold17[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl16[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {

    new ADTFoldApplyImpl16[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
      override def fold16[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl15[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =

        new ADTFoldApplyImpl15[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
          override def fold15[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl14[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =

            new ADTFoldApplyImpl14[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
              override def fold14[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl13[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =

                new ADTFoldApplyImpl13[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
                  override def fold13[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl12[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =

                    new ADTFoldApplyImpl12[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
                      override def fold12[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl11[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =

                        new ADTFoldApplyImpl11[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
                          override def fold11[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl10[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =

                            new ADTFoldApplyImpl10[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
                              override def fold10[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl9[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =

                                new ADTFoldApplyImpl9[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
                                  override def fold9[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl8[Target9, T10, T11, T12, T13, T14, T15, T16, T17] =

                                    new ADTFoldApplyImpl8[Target9, T10, T11, T12, T13, T14, T15, T16, T17] {
                                      override def fold8[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl7[Target10, T11, T12, T13, T14, T15, T16, T17] =

                                        new ADTFoldApplyImpl7[Target10, T11, T12, T13, T14, T15, T16, T17] {
                                          override def fold7[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl6[Target11, T12, T13, T14, T15, T16, T17] =

                                            new ADTFoldApplyImpl6[Target11, T12, T13, T14, T15, T16, T17] {
                                              override def fold6[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl5[Target12, T13, T14, T15, T16, T17] =

                                                new ADTFoldApplyImpl5[Target12, T13, T14, T15, T16, T17] {
                                                  override def fold5[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl4[Target13, T14, T15, T16, T17] =

                                                    new ADTFoldApplyImpl4[Target13, T14, T15, T16, T17] {
                                                      override def fold4[Target14 >: Target13](
                                                        func14: T14 => Target14
                                                      ): ADTFoldApplyImpl3[Target14, T15, T16, T17] =

                                                        new ADTFoldApplyImpl3[Target14, T15, T16, T17] {
                                                          override def fold3[Target15 >: Target14](
                                                            func15: T15 => Target15
                                                          ): ADTFoldApplyImpl2[Target15, T16, T17] =

                                                            new ADTFoldApplyImpl2[Target15, T16, T17] {
                                                              override def fold2[Target16 >: Target15](
                                                                func16: T16 => Target16
                                                              ): ADTFoldApplyImpl1[Target16, T17] =

                                                                new ADTFoldApplyImpl1[Target16, T17] {
                                                                  override def fold1[Target17 >: Target16](
                                                                    func17: T17 => Target17
                                                                  ): Target17 = {
                                                                    CoProductSelf.fold[Target17](
                                                                      func1,
                                                                      func2,
                                                                      func3,
                                                                      func4,
                                                                      func5,
                                                                      func6,
                                                                      func7,
                                                                      func8,
                                                                      func9,
                                                                      func10,
                                                                      func11,
                                                                      func12,
                                                                      func13,
                                                                      func14,
                                                                      func15,
                                                                      func16,
                                                                      func17
                                                                    )
                                                                  }
                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    One[T18]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              Successor[
                                T14,

                                Successor[
                                  T15,

                                  Successor[
                                    T16,

                                    Successor[
                                      T17,

                                      One[T18]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl18[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] { CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    One[T18]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target,
    param15: T15 => Target,
    param16: T16 => Target,
    param17: T17 => Target,
    param18: T18 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(
                                  param14,

                                  AdtHList.UsePositive.append(
                                    param15,

                                    AdtHList.UsePositive.append(
                                      param16,

                                      AdtHList.UsePositive.append(
                                        param17,

                                        AdtHList.UsePositive.append(param18, AdtHList.zero)
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold18[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl17[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {

    new ADTFoldApplyImpl17[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
      override def fold17[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl16[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =

        new ADTFoldApplyImpl16[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
          override def fold16[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl15[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =

            new ADTFoldApplyImpl15[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
              override def fold15[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl14[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =

                new ADTFoldApplyImpl14[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
                  override def fold14[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl13[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =

                    new ADTFoldApplyImpl13[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
                      override def fold13[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl12[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =

                        new ADTFoldApplyImpl12[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
                          override def fold12[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl11[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =

                            new ADTFoldApplyImpl11[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
                              override def fold11[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl10[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =

                                new ADTFoldApplyImpl10[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
                                  override def fold10[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl9[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =

                                    new ADTFoldApplyImpl9[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
                                      override def fold9[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl8[Target10, T11, T12, T13, T14, T15, T16, T17, T18] =

                                        new ADTFoldApplyImpl8[Target10, T11, T12, T13, T14, T15, T16, T17, T18] {
                                          override def fold8[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl7[Target11, T12, T13, T14, T15, T16, T17, T18] =

                                            new ADTFoldApplyImpl7[Target11, T12, T13, T14, T15, T16, T17, T18] {
                                              override def fold7[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl6[Target12, T13, T14, T15, T16, T17, T18] =

                                                new ADTFoldApplyImpl6[Target12, T13, T14, T15, T16, T17, T18] {
                                                  override def fold6[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl5[Target13, T14, T15, T16, T17, T18] =

                                                    new ADTFoldApplyImpl5[Target13, T14, T15, T16, T17, T18] {
                                                      override def fold5[Target14 >: Target13](
                                                        func14: T14 => Target14
                                                      ): ADTFoldApplyImpl4[Target14, T15, T16, T17, T18] =

                                                        new ADTFoldApplyImpl4[Target14, T15, T16, T17, T18] {
                                                          override def fold4[Target15 >: Target14](
                                                            func15: T15 => Target15
                                                          ): ADTFoldApplyImpl3[Target15, T16, T17, T18] =

                                                            new ADTFoldApplyImpl3[Target15, T16, T17, T18] {
                                                              override def fold3[Target16 >: Target15](
                                                                func16: T16 => Target16
                                                              ): ADTFoldApplyImpl2[Target16, T17, T18] =

                                                                new ADTFoldApplyImpl2[Target16, T17, T18] {
                                                                  override def fold2[Target17 >: Target16](
                                                                    func17: T17 => Target17
                                                                  ): ADTFoldApplyImpl1[Target17, T18] =

                                                                    new ADTFoldApplyImpl1[Target17, T18] {
                                                                      override def fold1[Target18 >: Target17](
                                                                        func18: T18 => Target18
                                                                      ): Target18 = {
                                                                        CoProductSelf.fold[Target18](
                                                                          func1,
                                                                          func2,
                                                                          func3,
                                                                          func4,
                                                                          func5,
                                                                          func6,
                                                                          func7,
                                                                          func8,
                                                                          func9,
                                                                          func10,
                                                                          func11,
                                                                          func12,
                                                                          func13,
                                                                          func14,
                                                                          func15,
                                                                          func16,
                                                                          func17,
                                                                          func18
                                                                        )
                                                                      }
                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    Successor[
                                      T18,

                                      One[T19]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              Successor[
                                T14,

                                Successor[
                                  T15,

                                  Successor[
                                    T16,

                                    Successor[
                                      T17,

                                      Successor[
                                        T18,

                                        One[T19]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl19[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
  CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    Successor[
                                      T18,

                                      One[T19]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target,
    param15: T15 => Target,
    param16: T16 => Target,
    param17: T17 => Target,
    param18: T18 => Target,
    param19: T19 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(
                                  param14,

                                  AdtHList.UsePositive.append(
                                    param15,

                                    AdtHList.UsePositive.append(
                                      param16,

                                      AdtHList.UsePositive.append(
                                        param17,

                                        AdtHList.UsePositive.append(
                                          param18,

                                          AdtHList.UsePositive.append(param19, AdtHList.zero)
                                        )
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold19[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl18[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {

    new ADTFoldApplyImpl18[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
      override def fold18[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl17[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

        new ADTFoldApplyImpl17[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
          override def fold17[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl16[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

            new ADTFoldApplyImpl16[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
              override def fold16[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl15[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

                new ADTFoldApplyImpl15[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
                  override def fold15[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl14[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

                    new ADTFoldApplyImpl14[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
                      override def fold14[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl13[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

                        new ADTFoldApplyImpl13[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
                          override def fold13[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl12[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

                            new ADTFoldApplyImpl12[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
                              override def fold12[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl11[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

                                new ADTFoldApplyImpl11[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
                                  override def fold11[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl10[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

                                    new ADTFoldApplyImpl10[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
                                      override def fold10[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl9[Target10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =

                                        new ADTFoldApplyImpl9[Target10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
                                          override def fold9[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl8[Target11, T12, T13, T14, T15, T16, T17, T18, T19] =

                                            new ADTFoldApplyImpl8[Target11, T12, T13, T14, T15, T16, T17, T18, T19] {
                                              override def fold8[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl7[Target12, T13, T14, T15, T16, T17, T18, T19] =

                                                new ADTFoldApplyImpl7[Target12, T13, T14, T15, T16, T17, T18, T19] {
                                                  override def fold7[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl6[Target13, T14, T15, T16, T17, T18, T19] =

                                                    new ADTFoldApplyImpl6[Target13, T14, T15, T16, T17, T18, T19] {
                                                      override def fold6[Target14 >: Target13](
                                                        func14: T14 => Target14
                                                      ): ADTFoldApplyImpl5[Target14, T15, T16, T17, T18, T19] =

                                                        new ADTFoldApplyImpl5[Target14, T15, T16, T17, T18, T19] {
                                                          override def fold5[Target15 >: Target14](
                                                            func15: T15 => Target15
                                                          ): ADTFoldApplyImpl4[Target15, T16, T17, T18, T19] =

                                                            new ADTFoldApplyImpl4[Target15, T16, T17, T18, T19] {
                                                              override def fold4[Target16 >: Target15](
                                                                func16: T16 => Target16
                                                              ): ADTFoldApplyImpl3[Target16, T17, T18, T19] =

                                                                new ADTFoldApplyImpl3[Target16, T17, T18, T19] {
                                                                  override def fold3[Target17 >: Target16](
                                                                    func17: T17 => Target17
                                                                  ): ADTFoldApplyImpl2[Target17, T18, T19] =

                                                                    new ADTFoldApplyImpl2[Target17, T18, T19] {
                                                                      override def fold2[Target18 >: Target17](
                                                                        func18: T18 => Target18
                                                                      ): ADTFoldApplyImpl1[Target18, T19] =

                                                                        new ADTFoldApplyImpl1[Target18, T19] {
                                                                          override def fold1[Target19 >: Target18](
                                                                            func19: T19 => Target19
                                                                          ): Target19 = {
                                                                            CoProductSelf.fold[Target19](
                                                                              func1,
                                                                              func2,
                                                                              func3,
                                                                              func4,
                                                                              func5,
                                                                              func6,
                                                                              func7,
                                                                              func8,
                                                                              func9,
                                                                              func10,
                                                                              func11,
                                                                              func12,
                                                                              func13,
                                                                              func14,
                                                                              func15,
                                                                              func16,
                                                                              func17,
                                                                              func18,
                                                                              func19
                                                                            )
                                                                          }
                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    Successor[
                                      T18,

                                      Successor[
                                        T19,

                                        One[T20]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              Successor[
                                T14,

                                Successor[
                                  T15,

                                  Successor[
                                    T16,

                                    Successor[
                                      T17,

                                      Successor[
                                        T18,

                                        Successor[
                                          T19,

                                          One[T20]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl20[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
  CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    Successor[
                                      T18,

                                      Successor[
                                        T19,

                                        One[T20]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target,
    param15: T15 => Target,
    param16: T16 => Target,
    param17: T17 => Target,
    param18: T18 => Target,
    param19: T19 => Target,
    param20: T20 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(
                                  param14,

                                  AdtHList.UsePositive.append(
                                    param15,

                                    AdtHList.UsePositive.append(
                                      param16,

                                      AdtHList.UsePositive.append(
                                        param17,

                                        AdtHList.UsePositive.append(
                                          param18,

                                          AdtHList.UsePositive.append(
                                            param19,

                                            AdtHList.UsePositive.append(param20, AdtHList.zero)
                                          )
                                        )
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold20[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl19[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {

    new ADTFoldApplyImpl19[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
      override def fold19[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl18[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

        new ADTFoldApplyImpl18[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
          override def fold18[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl17[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

            new ADTFoldApplyImpl17[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
              override def fold17[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl16[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

                new ADTFoldApplyImpl16[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
                  override def fold16[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl15[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

                    new ADTFoldApplyImpl15[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
                      override def fold15[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl14[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

                        new ADTFoldApplyImpl14[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
                          override def fold14[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl13[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

                            new ADTFoldApplyImpl13[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
                              override def fold13[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl12[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

                                new ADTFoldApplyImpl12[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
                                  override def fold12[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl11[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

                                    new ADTFoldApplyImpl11[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
                                      override def fold11[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl10[Target10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

                                        new ADTFoldApplyImpl10[Target10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
                                          override def fold10[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl9[Target11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =

                                            new ADTFoldApplyImpl9[Target11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
                                              override def fold9[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl8[Target12, T13, T14, T15, T16, T17, T18, T19, T20] =

                                                new ADTFoldApplyImpl8[Target12, T13, T14, T15, T16, T17, T18, T19, T20] {
                                                  override def fold8[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl7[Target13, T14, T15, T16, T17, T18, T19, T20] =

                                                    new ADTFoldApplyImpl7[Target13, T14, T15, T16, T17, T18, T19, T20] {
                                                      override def fold7[Target14 >: Target13](
                                                        func14: T14 => Target14
                                                      ): ADTFoldApplyImpl6[Target14, T15, T16, T17, T18, T19, T20] =

                                                        new ADTFoldApplyImpl6[Target14, T15, T16, T17, T18, T19, T20] {
                                                          override def fold6[Target15 >: Target14](
                                                            func15: T15 => Target15
                                                          ): ADTFoldApplyImpl5[Target15, T16, T17, T18, T19, T20] =

                                                            new ADTFoldApplyImpl5[Target15, T16, T17, T18, T19, T20] {
                                                              override def fold5[Target16 >: Target15](
                                                                func16: T16 => Target16
                                                              ): ADTFoldApplyImpl4[Target16, T17, T18, T19, T20] =

                                                                new ADTFoldApplyImpl4[Target16, T17, T18, T19, T20] {
                                                                  override def fold4[Target17 >: Target16](
                                                                    func17: T17 => Target17
                                                                  ): ADTFoldApplyImpl3[Target17, T18, T19, T20] =

                                                                    new ADTFoldApplyImpl3[Target17, T18, T19, T20] {
                                                                      override def fold3[Target18 >: Target17](
                                                                        func18: T18 => Target18
                                                                      ): ADTFoldApplyImpl2[Target18, T19, T20] =

                                                                        new ADTFoldApplyImpl2[Target18, T19, T20] {
                                                                          override def fold2[Target19 >: Target18](
                                                                            func19: T19 => Target19
                                                                          ): ADTFoldApplyImpl1[Target19, T20] =

                                                                            new ADTFoldApplyImpl1[Target19, T20] {
                                                                              override def fold1[Target20 >: Target19](
                                                                                func20: T20 => Target20
                                                                              ): Target20 = {
                                                                                CoProductSelf.fold[Target20](
                                                                                  func1,
                                                                                  func2,
                                                                                  func3,
                                                                                  func4,
                                                                                  func5,
                                                                                  func6,
                                                                                  func7,
                                                                                  func8,
                                                                                  func9,
                                                                                  func10,
                                                                                  func11,
                                                                                  func12,
                                                                                  func13,
                                                                                  func14,
                                                                                  func15,
                                                                                  func16,
                                                                                  func17,
                                                                                  func18,
                                                                                  func19,
                                                                                  func20
                                                                                )
                                                                              }
                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    Successor[
                                      T18,

                                      Successor[
                                        T19,

                                        Successor[
                                          T20,

                                          One[T21]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              Successor[
                                T14,

                                Successor[
                                  T15,

                                  Successor[
                                    T16,

                                    Successor[
                                      T17,

                                      Successor[
                                        T18,

                                        Successor[
                                          T19,

                                          Successor[
                                            T20,

                                            One[T21]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl21[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
  CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    Successor[
                                      T18,

                                      Successor[
                                        T19,

                                        Successor[
                                          T20,

                                          One[T21]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target,
    param15: T15 => Target,
    param16: T16 => Target,
    param17: T17 => Target,
    param18: T18 => Target,
    param19: T19 => Target,
    param20: T20 => Target,
    param21: T21 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(
                                  param14,

                                  AdtHList.UsePositive.append(
                                    param15,

                                    AdtHList.UsePositive.append(
                                      param16,

                                      AdtHList.UsePositive.append(
                                        param17,

                                        AdtHList.UsePositive.append(
                                          param18,

                                          AdtHList.UsePositive.append(
                                            param19,

                                            AdtHList.UsePositive.append(
                                              param20,

                                              AdtHList.UsePositive.append(param21, AdtHList.zero)
                                            )
                                          )
                                        )
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold21[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl20[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {

    new ADTFoldApplyImpl20[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
      override def fold20[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl19[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

        new ADTFoldApplyImpl19[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
          override def fold19[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl18[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

            new ADTFoldApplyImpl18[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
              override def fold18[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl17[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                new ADTFoldApplyImpl17[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                  override def fold17[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl16[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                    new ADTFoldApplyImpl16[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                      override def fold16[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl15[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                        new ADTFoldApplyImpl15[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                          override def fold15[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl14[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                            new ADTFoldApplyImpl14[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                              override def fold14[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl13[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                                new ADTFoldApplyImpl13[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                                  override def fold13[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl12[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                                    new ADTFoldApplyImpl12[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                                      override def fold12[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl11[Target10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                                        new ADTFoldApplyImpl11[Target10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                                          override def fold11[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl10[Target11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                                            new ADTFoldApplyImpl10[Target11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                                              override def fold10[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl9[Target12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =

                                                new ADTFoldApplyImpl9[Target12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
                                                  override def fold9[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl8[Target13, T14, T15, T16, T17, T18, T19, T20, T21] =

                                                    new ADTFoldApplyImpl8[Target13, T14, T15, T16, T17, T18, T19, T20, T21] {
                                                      override def fold8[Target14 >: Target13](
                                                        func14: T14 => Target14
                                                      ): ADTFoldApplyImpl7[Target14, T15, T16, T17, T18, T19, T20, T21] =

                                                        new ADTFoldApplyImpl7[Target14, T15, T16, T17, T18, T19, T20, T21] {
                                                          override def fold7[Target15 >: Target14](
                                                            func15: T15 => Target15
                                                          ): ADTFoldApplyImpl6[Target15, T16, T17, T18, T19, T20, T21] =

                                                            new ADTFoldApplyImpl6[Target15, T16, T17, T18, T19, T20, T21] {
                                                              override def fold6[Target16 >: Target15](
                                                                func16: T16 => Target16
                                                              ): ADTFoldApplyImpl5[Target16, T17, T18, T19, T20, T21] =

                                                                new ADTFoldApplyImpl5[Target16, T17, T18, T19, T20, T21] {
                                                                  override def fold5[Target17 >: Target16](
                                                                    func17: T17 => Target17
                                                                  ): ADTFoldApplyImpl4[Target17, T18, T19, T20, T21] =

                                                                    new ADTFoldApplyImpl4[Target17, T18, T19, T20, T21] {
                                                                      override def fold4[Target18 >: Target17](
                                                                        func18: T18 => Target18
                                                                      ): ADTFoldApplyImpl3[Target18, T19, T20, T21] =

                                                                        new ADTFoldApplyImpl3[Target18, T19, T20, T21] {
                                                                          override def fold3[Target19 >: Target18](
                                                                            func19: T19 => Target19
                                                                          ): ADTFoldApplyImpl2[Target19, T20, T21] =

                                                                            new ADTFoldApplyImpl2[Target19, T20, T21] {
                                                                              override def fold2[Target20 >: Target19](
                                                                                func20: T20 => Target20
                                                                              ): ADTFoldApplyImpl1[Target20, T21] =

                                                                                new ADTFoldApplyImpl1[Target20, T21] {
                                                                                  override def fold1[Target21 >: Target20](
                                                                                    func21: T21 => Target21
                                                                                  ): Target21 = {
                                                                                    CoProductSelf.fold[Target21](
                                                                                      func1,
                                                                                      func2,
                                                                                      func3,
                                                                                      func4,
                                                                                      func5,
                                                                                      func6,
                                                                                      func7,
                                                                                      func8,
                                                                                      func9,
                                                                                      func10,
                                                                                      func11,
                                                                                      func12,
                                                                                      func13,
                                                                                      func14,
                                                                                      func15,
                                                                                      func16,
                                                                                      func17,
                                                                                      func18,
                                                                                      func19,
                                                                                      func20,
                                                                                      func21
                                                                                    )
                                                                                  }
                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}

class CoProduct22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
  instance: Successor[
    T1,

    Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    Successor[
                                      T18,

                                      Successor[
                                        T19,

                                        Successor[
                                          T20,

                                          Successor[
                                            T21,

                                            One[T22]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T1,

      Successor[
        T2,

        Successor[
          T3,

          Successor[
            T4,

            Successor[
              T5,

              Successor[
                T6,

                Successor[
                  T7,

                  Successor[
                    T8,

                    Successor[
                      T9,

                      Successor[
                        T10,

                        Successor[
                          T11,

                          Successor[
                            T12,

                            Successor[
                              T13,

                              Successor[
                                T14,

                                Successor[
                                  T15,

                                  Successor[
                                    T16,

                                    Successor[
                                      T17,

                                      Successor[
                                        T18,

                                        Successor[
                                          T19,

                                          Successor[
                                            T20,

                                            Successor[
                                              T21,

                                              One[T22]
                                            ]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
    with ADTFoldApplyImpl22[Nothing, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
  CoProductSelf =>

  override def tailFold[Target](
    func1: T1 => Target,
    func2: Successor[
      T2,

      Successor[
        T3,

        Successor[
          T4,

          Successor[
            T5,

            Successor[
              T6,

              Successor[
                T7,

                Successor[
                  T8,

                  Successor[
                    T9,

                    Successor[
                      T10,

                      Successor[
                        T11,

                        Successor[
                          T12,

                          Successor[
                            T13,

                            Successor[
                              T14,

                              Successor[
                                T15,

                                Successor[
                                  T16,

                                  Successor[
                                    T17,

                                    Successor[
                                      T18,

                                      Successor[
                                        T19,

                                        Successor[
                                          T20,

                                          Successor[
                                            T21,

                                            One[T22]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](
    param1: T1 => Target,
    param2: T2 => Target,
    param3: T3 => Target,
    param4: T4 => Target,
    param5: T5 => Target,
    param6: T6 => Target,
    param7: T7 => Target,
    param8: T8 => Target,
    param9: T9 => Target,
    param10: T10 => Target,
    param11: T11 => Target,
    param12: T12 => Target,
    param13: T13 => Target,
    param14: T14 => Target,
    param15: T15 => Target,
    param16: T16 => Target,
    param17: T17 => Target,
    param18: T18 => Target,
    param19: T19 => Target,
    param20: T20 => Target,
    param21: T21 => Target,
    param22: T22 => Target
  ): Target = {
    val toTarget = AppendTail7[Target]
    val func     = toTarget.ToTarget.take(
      AdtHList.UsePositive.append(
        param1,

        AdtHList.UsePositive.append(
          param2,

          AdtHList.UsePositive.append(
            param3,

            AdtHList.UsePositive.append(
              param4,

              AdtHList.UsePositive.append(
                param5,

                AdtHList.UsePositive.append(
                  param6,

                  AdtHList.UsePositive.append(
                    param7,

                    AdtHList.UsePositive.append(
                      param8,

                      AdtHList.UsePositive.append(
                        param9,

                        AdtHList.UsePositive.append(
                          param10,

                          AdtHList.UsePositive.append(
                            param11,

                            AdtHList.UsePositive.append(
                              param12,

                              AdtHList.UsePositive.append(
                                param13,

                                AdtHList.UsePositive.append(
                                  param14,

                                  AdtHList.UsePositive.append(
                                    param15,

                                    AdtHList.UsePositive.append(
                                      param16,

                                      AdtHList.UsePositive.append(
                                        param17,

                                        AdtHList.UsePositive.append(
                                          param18,

                                          AdtHList.UsePositive.append(
                                            param19,

                                            AdtHList.UsePositive.append(
                                              param20,

                                              AdtHList.UsePositive.append(
                                                param21,

                                                AdtHList.UsePositive.append(param22, AdtHList.zero)
                                              )
                                            )
                                          )
                                        )
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )
    func(instance)
  }

  override def fold22[Target1](
    func1: T1 => Target1
  ): ADTFoldApplyImpl21[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {

    new ADTFoldApplyImpl21[Target1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
      override def fold21[Target2 >: Target1](
        func2: T2 => Target2
      ): ADTFoldApplyImpl20[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

        new ADTFoldApplyImpl20[Target2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
          override def fold20[Target3 >: Target2](
            func3: T3 => Target3
          ): ADTFoldApplyImpl19[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

            new ADTFoldApplyImpl19[Target3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
              override def fold19[Target4 >: Target3](
                func4: T4 => Target4
              ): ADTFoldApplyImpl18[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                new ADTFoldApplyImpl18[Target4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                  override def fold18[Target5 >: Target4](
                    func5: T5 => Target5
                  ): ADTFoldApplyImpl17[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                    new ADTFoldApplyImpl17[Target5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                      override def fold17[Target6 >: Target5](
                        func6: T6 => Target6
                      ): ADTFoldApplyImpl16[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                        new ADTFoldApplyImpl16[Target6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                          override def fold16[Target7 >: Target6](
                            func7: T7 => Target7
                          ): ADTFoldApplyImpl15[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                            new ADTFoldApplyImpl15[Target7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                              override def fold15[Target8 >: Target7](
                                func8: T8 => Target8
                              ): ADTFoldApplyImpl14[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                                new ADTFoldApplyImpl14[Target8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                                  override def fold14[Target9 >: Target8](
                                    func9: T9 => Target9
                                  ): ADTFoldApplyImpl13[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                                    new ADTFoldApplyImpl13[Target9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                                      override def fold13[Target10 >: Target9](
                                        func10: T10 => Target10
                                      ): ADTFoldApplyImpl12[Target10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                                        new ADTFoldApplyImpl12[Target10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                                          override def fold12[Target11 >: Target10](
                                            func11: T11 => Target11
                                          ): ADTFoldApplyImpl11[Target11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                                            new ADTFoldApplyImpl11[Target11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                                              override def fold11[Target12 >: Target11](
                                                func12: T12 => Target12
                                              ): ADTFoldApplyImpl10[Target12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                                                new ADTFoldApplyImpl10[Target12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                                                  override def fold10[Target13 >: Target12](
                                                    func13: T13 => Target13
                                                  ): ADTFoldApplyImpl9[Target13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =

                                                    new ADTFoldApplyImpl9[Target13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
                                                      override def fold9[Target14 >: Target13](
                                                        func14: T14 => Target14
                                                      ): ADTFoldApplyImpl8[Target14, T15, T16, T17, T18, T19, T20, T21, T22] =

                                                        new ADTFoldApplyImpl8[Target14, T15, T16, T17, T18, T19, T20, T21, T22] {
                                                          override def fold8[Target15 >: Target14](
                                                            func15: T15 => Target15
                                                          ): ADTFoldApplyImpl7[Target15, T16, T17, T18, T19, T20, T21, T22] =

                                                            new ADTFoldApplyImpl7[Target15, T16, T17, T18, T19, T20, T21, T22] {
                                                              override def fold7[Target16 >: Target15](
                                                                func16: T16 => Target16
                                                              ): ADTFoldApplyImpl6[Target16, T17, T18, T19, T20, T21, T22] =

                                                                new ADTFoldApplyImpl6[Target16, T17, T18, T19, T20, T21, T22] {
                                                                  override def fold6[Target17 >: Target16](
                                                                    func17: T17 => Target17
                                                                  ): ADTFoldApplyImpl5[Target17, T18, T19, T20, T21, T22] =

                                                                    new ADTFoldApplyImpl5[Target17, T18, T19, T20, T21, T22] {
                                                                      override def fold5[Target18 >: Target17](
                                                                        func18: T18 => Target18
                                                                      ): ADTFoldApplyImpl4[Target18, T19, T20, T21, T22] =

                                                                        new ADTFoldApplyImpl4[Target18, T19, T20, T21, T22] {
                                                                          override def fold4[Target19 >: Target18](
                                                                            func19: T19 => Target19
                                                                          ): ADTFoldApplyImpl3[Target19, T20, T21, T22] =

                                                                            new ADTFoldApplyImpl3[Target19, T20, T21, T22] {
                                                                              override def fold3[Target20 >: Target19](
                                                                                func20: T20 => Target20
                                                                              ): ADTFoldApplyImpl2[Target20, T21, T22] =

                                                                                new ADTFoldApplyImpl2[Target20, T21, T22] {
                                                                                  override def fold2[Target21 >: Target20](
                                                                                    func21: T21 => Target21
                                                                                  ): ADTFoldApplyImpl1[Target21, T22] =

                                                                                    new ADTFoldApplyImpl1[Target21, T22] {
                                                                                      override def fold1[Target22 >: Target21](
                                                                                        func22: T22 => Target22
                                                                                      ): Target22 = {
                                                                                        CoProductSelf.fold[Target22](
                                                                                          func1,
                                                                                          func2,
                                                                                          func3,
                                                                                          func4,
                                                                                          func5,
                                                                                          func6,
                                                                                          func7,
                                                                                          func8,
                                                                                          func9,
                                                                                          func10,
                                                                                          func11,
                                                                                          func12,
                                                                                          func13,
                                                                                          func14,
                                                                                          func15,
                                                                                          func16,
                                                                                          func17,
                                                                                          func18,
                                                                                          func19,
                                                                                          func20,
                                                                                          func21,
                                                                                          func22
                                                                                        )
                                                                                      }
                                                                                    }

                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

  }

}
