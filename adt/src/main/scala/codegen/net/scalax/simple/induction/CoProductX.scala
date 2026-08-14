package net.scalax.simple.adt
package instance

class CoProduct1[T1](foldImpl: One[T1]) extends One[T1] with ADTFoldApplyImpl1[Nothing, T1] { CoProductSelf =>
  override def value: T1                                                             = foldImpl.value
  @inline def fold[TargetOther0](param1: T1 => TargetOther0): TargetOther0           = param1(CoProductSelf.value)
  @inline override def fold1[TargetOther0](param1: T1 => TargetOther0): TargetOther0 = CoProductSelf.fold[TargetOther0](param1)
}

class CoProduct2[T1, T2](
  instance: Successor[
    T2,

    One[T1]
  ]
) extends Successor[
      T2,

      One[T1]
    ] { CoProductSelf =>
  override def tailFold[Target](func1: T2 => Target, func2: One[T1] => Target): Target =
    instance.tailFold(func1, func2)

  def fold[Target](param1: T1 => Target, param2: T2 => Target): Target = ???
}

class CoProduct3[T1, T2, T3](
  instance: Successor[
    T3,

    Successor[
      T2,

      One[T1]
    ]
  ]
) extends Successor[
      T3,

      Successor[
        T2,

        One[T1]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T3 => Target,
    func2: Successor[
      T2,

      One[T1]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](param1: T1 => Target, param2: T2 => Target, param3: T3 => Target): Target = ???
}

class CoProduct4[T1, T2, T3, T4](
  instance: Successor[
    T4,

    Successor[
      T3,

      Successor[
        T2,

        One[T1]
      ]
    ]
  ]
) extends Successor[
      T4,

      Successor[
        T3,

        Successor[
          T2,

          One[T1]
        ]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T4 => Target,
    func2: Successor[
      T3,

      Successor[
        T2,

        One[T1]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](param1: T1 => Target, param2: T2 => Target, param3: T3 => Target, param4: T4 => Target): Target = ???
}

class CoProduct5[T1, T2, T3, T4, T5](
  instance: Successor[
    T5,

    Successor[
      T4,

      Successor[
        T3,

        Successor[
          T2,

          One[T1]
        ]
      ]
    ]
  ]
) extends Successor[
      T5,

      Successor[
        T4,

        Successor[
          T3,

          Successor[
            T2,

            One[T1]
          ]
        ]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T5 => Target,
    func2: Successor[
      T4,

      Successor[
        T3,

        Successor[
          T2,

          One[T1]
        ]
      ]
    ] => Target
  ): Target =
    instance.tailFold(func1, func2)

  def fold[Target](param1: T1 => Target, param2: T2 => Target, param3: T3 => Target, param4: T4 => Target, param5: T5 => Target): Target =
    ???
}

class CoProduct6[T1, T2, T3, T4, T5, T6](
  instance: Successor[
    T6,

    Successor[
      T5,

      Successor[
        T4,

        Successor[
          T3,

          Successor[
            T2,

            One[T1]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T6,

      Successor[
        T5,

        Successor[
          T4,

          Successor[
            T3,

            Successor[
              T2,

              One[T1]
            ]
          ]
        ]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T6 => Target,
    func2: Successor[
      T5,

      Successor[
        T4,

        Successor[
          T3,

          Successor[
            T2,

            One[T1]
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
  ): Target = ???
}

class CoProduct7[T1, T2, T3, T4, T5, T6, T7](
  instance: Successor[
    T7,

    Successor[
      T6,

      Successor[
        T5,

        Successor[
          T4,

          Successor[
            T3,

            Successor[
              T2,

              One[T1]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T7,

      Successor[
        T6,

        Successor[
          T5,

          Successor[
            T4,

            Successor[
              T3,

              Successor[
                T2,

                One[T1]
              ]
            ]
          ]
        ]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T7 => Target,
    func2: Successor[
      T6,

      Successor[
        T5,

        Successor[
          T4,

          Successor[
            T3,

            Successor[
              T2,

              One[T1]
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
  ): Target = ???
}

class CoProduct8[T1, T2, T3, T4, T5, T6, T7, T8](
  instance: Successor[
    T8,

    Successor[
      T7,

      Successor[
        T6,

        Successor[
          T5,

          Successor[
            T4,

            Successor[
              T3,

              Successor[
                T2,

                One[T1]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T8,

      Successor[
        T7,

        Successor[
          T6,

          Successor[
            T5,

            Successor[
              T4,

              Successor[
                T3,

                Successor[
                  T2,

                  One[T1]
                ]
              ]
            ]
          ]
        ]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T8 => Target,
    func2: Successor[
      T7,

      Successor[
        T6,

        Successor[
          T5,

          Successor[
            T4,

            Successor[
              T3,

              Successor[
                T2,

                One[T1]
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
  ): Target = ???
}

class CoProduct9[T1, T2, T3, T4, T5, T6, T7, T8, T9](
  instance: Successor[
    T9,

    Successor[
      T8,

      Successor[
        T7,

        Successor[
          T6,

          Successor[
            T5,

            Successor[
              T4,

              Successor[
                T3,

                Successor[
                  T2,

                  One[T1]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ]
) extends Successor[
      T9,

      Successor[
        T8,

        Successor[
          T7,

          Successor[
            T6,

            Successor[
              T5,

              Successor[
                T4,

                Successor[
                  T3,

                  Successor[
                    T2,

                    One[T1]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T9 => Target,
    func2: Successor[
      T8,

      Successor[
        T7,

        Successor[
          T6,

          Successor[
            T5,

            Successor[
              T4,

              Successor[
                T3,

                Successor[
                  T2,

                  One[T1]
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
  ): Target = ???
}

class CoProduct10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
  instance: Successor[
    T10,

    Successor[
      T9,

      Successor[
        T8,

        Successor[
          T7,

          Successor[
            T6,

            Successor[
              T5,

              Successor[
                T4,

                Successor[
                  T3,

                  Successor[
                    T2,

                    One[T1]
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
      T10,

      Successor[
        T9,

        Successor[
          T8,

          Successor[
            T7,

            Successor[
              T6,

              Successor[
                T5,

                Successor[
                  T4,

                  Successor[
                    T3,

                    Successor[
                      T2,

                      One[T1]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T10 => Target,
    func2: Successor[
      T9,

      Successor[
        T8,

        Successor[
          T7,

          Successor[
            T6,

            Successor[
              T5,

              Successor[
                T4,

                Successor[
                  T3,

                  Successor[
                    T2,

                    One[T1]
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
  ): Target = ???
}

class CoProduct11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
  instance: Successor[
    T11,

    Successor[
      T10,

      Successor[
        T9,

        Successor[
          T8,

          Successor[
            T7,

            Successor[
              T6,

              Successor[
                T5,

                Successor[
                  T4,

                  Successor[
                    T3,

                    Successor[
                      T2,

                      One[T1]
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
      T11,

      Successor[
        T10,

        Successor[
          T9,

          Successor[
            T8,

            Successor[
              T7,

              Successor[
                T6,

                Successor[
                  T5,

                  Successor[
                    T4,

                    Successor[
                      T3,

                      Successor[
                        T2,

                        One[T1]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T11 => Target,
    func2: Successor[
      T10,

      Successor[
        T9,

        Successor[
          T8,

          Successor[
            T7,

            Successor[
              T6,

              Successor[
                T5,

                Successor[
                  T4,

                  Successor[
                    T3,

                    Successor[
                      T2,

                      One[T1]
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
  ): Target = ???
}

class CoProduct12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
  instance: Successor[
    T12,

    Successor[
      T11,

      Successor[
        T10,

        Successor[
          T9,

          Successor[
            T8,

            Successor[
              T7,

              Successor[
                T6,

                Successor[
                  T5,

                  Successor[
                    T4,

                    Successor[
                      T3,

                      Successor[
                        T2,

                        One[T1]
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
      T12,

      Successor[
        T11,

        Successor[
          T10,

          Successor[
            T9,

            Successor[
              T8,

              Successor[
                T7,

                Successor[
                  T6,

                  Successor[
                    T5,

                    Successor[
                      T4,

                      Successor[
                        T3,

                        Successor[
                          T2,

                          One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T12 => Target,
    func2: Successor[
      T11,

      Successor[
        T10,

        Successor[
          T9,

          Successor[
            T8,

            Successor[
              T7,

              Successor[
                T6,

                Successor[
                  T5,

                  Successor[
                    T4,

                    Successor[
                      T3,

                      Successor[
                        T2,

                        One[T1]
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
  ): Target = ???
}

class CoProduct13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
  instance: Successor[
    T13,

    Successor[
      T12,

      Successor[
        T11,

        Successor[
          T10,

          Successor[
            T9,

            Successor[
              T8,

              Successor[
                T7,

                Successor[
                  T6,

                  Successor[
                    T5,

                    Successor[
                      T4,

                      Successor[
                        T3,

                        Successor[
                          T2,

                          One[T1]
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
      T13,

      Successor[
        T12,

        Successor[
          T11,

          Successor[
            T10,

            Successor[
              T9,

              Successor[
                T8,

                Successor[
                  T7,

                  Successor[
                    T6,

                    Successor[
                      T5,

                      Successor[
                        T4,

                        Successor[
                          T3,

                          Successor[
                            T2,

                            One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T13 => Target,
    func2: Successor[
      T12,

      Successor[
        T11,

        Successor[
          T10,

          Successor[
            T9,

            Successor[
              T8,

              Successor[
                T7,

                Successor[
                  T6,

                  Successor[
                    T5,

                    Successor[
                      T4,

                      Successor[
                        T3,

                        Successor[
                          T2,

                          One[T1]
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
  ): Target = ???
}

class CoProduct14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
  instance: Successor[
    T14,

    Successor[
      T13,

      Successor[
        T12,

        Successor[
          T11,

          Successor[
            T10,

            Successor[
              T9,

              Successor[
                T8,

                Successor[
                  T7,

                  Successor[
                    T6,

                    Successor[
                      T5,

                      Successor[
                        T4,

                        Successor[
                          T3,

                          Successor[
                            T2,

                            One[T1]
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
      T14,

      Successor[
        T13,

        Successor[
          T12,

          Successor[
            T11,

            Successor[
              T10,

              Successor[
                T9,

                Successor[
                  T8,

                  Successor[
                    T7,

                    Successor[
                      T6,

                      Successor[
                        T5,

                        Successor[
                          T4,

                          Successor[
                            T3,

                            Successor[
                              T2,

                              One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T14 => Target,
    func2: Successor[
      T13,

      Successor[
        T12,

        Successor[
          T11,

          Successor[
            T10,

            Successor[
              T9,

              Successor[
                T8,

                Successor[
                  T7,

                  Successor[
                    T6,

                    Successor[
                      T5,

                      Successor[
                        T4,

                        Successor[
                          T3,

                          Successor[
                            T2,

                            One[T1]
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
  ): Target = ???
}

class CoProduct15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
  instance: Successor[
    T15,

    Successor[
      T14,

      Successor[
        T13,

        Successor[
          T12,

          Successor[
            T11,

            Successor[
              T10,

              Successor[
                T9,

                Successor[
                  T8,

                  Successor[
                    T7,

                    Successor[
                      T6,

                      Successor[
                        T5,

                        Successor[
                          T4,

                          Successor[
                            T3,

                            Successor[
                              T2,

                              One[T1]
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
      T15,

      Successor[
        T14,

        Successor[
          T13,

          Successor[
            T12,

            Successor[
              T11,

              Successor[
                T10,

                Successor[
                  T9,

                  Successor[
                    T8,

                    Successor[
                      T7,

                      Successor[
                        T6,

                        Successor[
                          T5,

                          Successor[
                            T4,

                            Successor[
                              T3,

                              Successor[
                                T2,

                                One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T15 => Target,
    func2: Successor[
      T14,

      Successor[
        T13,

        Successor[
          T12,

          Successor[
            T11,

            Successor[
              T10,

              Successor[
                T9,

                Successor[
                  T8,

                  Successor[
                    T7,

                    Successor[
                      T6,

                      Successor[
                        T5,

                        Successor[
                          T4,

                          Successor[
                            T3,

                            Successor[
                              T2,

                              One[T1]
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
  ): Target = ???
}

class CoProduct16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
  instance: Successor[
    T16,

    Successor[
      T15,

      Successor[
        T14,

        Successor[
          T13,

          Successor[
            T12,

            Successor[
              T11,

              Successor[
                T10,

                Successor[
                  T9,

                  Successor[
                    T8,

                    Successor[
                      T7,

                      Successor[
                        T6,

                        Successor[
                          T5,

                          Successor[
                            T4,

                            Successor[
                              T3,

                              Successor[
                                T2,

                                One[T1]
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
      T16,

      Successor[
        T15,

        Successor[
          T14,

          Successor[
            T13,

            Successor[
              T12,

              Successor[
                T11,

                Successor[
                  T10,

                  Successor[
                    T9,

                    Successor[
                      T8,

                      Successor[
                        T7,

                        Successor[
                          T6,

                          Successor[
                            T5,

                            Successor[
                              T4,

                              Successor[
                                T3,

                                Successor[
                                  T2,

                                  One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T16 => Target,
    func2: Successor[
      T15,

      Successor[
        T14,

        Successor[
          T13,

          Successor[
            T12,

            Successor[
              T11,

              Successor[
                T10,

                Successor[
                  T9,

                  Successor[
                    T8,

                    Successor[
                      T7,

                      Successor[
                        T6,

                        Successor[
                          T5,

                          Successor[
                            T4,

                            Successor[
                              T3,

                              Successor[
                                T2,

                                One[T1]
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
  ): Target = ???
}

class CoProduct17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
  instance: Successor[
    T17,

    Successor[
      T16,

      Successor[
        T15,

        Successor[
          T14,

          Successor[
            T13,

            Successor[
              T12,

              Successor[
                T11,

                Successor[
                  T10,

                  Successor[
                    T9,

                    Successor[
                      T8,

                      Successor[
                        T7,

                        Successor[
                          T6,

                          Successor[
                            T5,

                            Successor[
                              T4,

                              Successor[
                                T3,

                                Successor[
                                  T2,

                                  One[T1]
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
      T17,

      Successor[
        T16,

        Successor[
          T15,

          Successor[
            T14,

            Successor[
              T13,

              Successor[
                T12,

                Successor[
                  T11,

                  Successor[
                    T10,

                    Successor[
                      T9,

                      Successor[
                        T8,

                        Successor[
                          T7,

                          Successor[
                            T6,

                            Successor[
                              T5,

                              Successor[
                                T4,

                                Successor[
                                  T3,

                                  Successor[
                                    T2,

                                    One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T17 => Target,
    func2: Successor[
      T16,

      Successor[
        T15,

        Successor[
          T14,

          Successor[
            T13,

            Successor[
              T12,

              Successor[
                T11,

                Successor[
                  T10,

                  Successor[
                    T9,

                    Successor[
                      T8,

                      Successor[
                        T7,

                        Successor[
                          T6,

                          Successor[
                            T5,

                            Successor[
                              T4,

                              Successor[
                                T3,

                                Successor[
                                  T2,

                                  One[T1]
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
  ): Target = ???
}

class CoProduct18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
  instance: Successor[
    T18,

    Successor[
      T17,

      Successor[
        T16,

        Successor[
          T15,

          Successor[
            T14,

            Successor[
              T13,

              Successor[
                T12,

                Successor[
                  T11,

                  Successor[
                    T10,

                    Successor[
                      T9,

                      Successor[
                        T8,

                        Successor[
                          T7,

                          Successor[
                            T6,

                            Successor[
                              T5,

                              Successor[
                                T4,

                                Successor[
                                  T3,

                                  Successor[
                                    T2,

                                    One[T1]
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
      T18,

      Successor[
        T17,

        Successor[
          T16,

          Successor[
            T15,

            Successor[
              T14,

              Successor[
                T13,

                Successor[
                  T12,

                  Successor[
                    T11,

                    Successor[
                      T10,

                      Successor[
                        T9,

                        Successor[
                          T8,

                          Successor[
                            T7,

                            Successor[
                              T6,

                              Successor[
                                T5,

                                Successor[
                                  T4,

                                  Successor[
                                    T3,

                                    Successor[
                                      T2,

                                      One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T18 => Target,
    func2: Successor[
      T17,

      Successor[
        T16,

        Successor[
          T15,

          Successor[
            T14,

            Successor[
              T13,

              Successor[
                T12,

                Successor[
                  T11,

                  Successor[
                    T10,

                    Successor[
                      T9,

                      Successor[
                        T8,

                        Successor[
                          T7,

                          Successor[
                            T6,

                            Successor[
                              T5,

                              Successor[
                                T4,

                                Successor[
                                  T3,

                                  Successor[
                                    T2,

                                    One[T1]
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
  ): Target = ???
}

class CoProduct19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
  instance: Successor[
    T19,

    Successor[
      T18,

      Successor[
        T17,

        Successor[
          T16,

          Successor[
            T15,

            Successor[
              T14,

              Successor[
                T13,

                Successor[
                  T12,

                  Successor[
                    T11,

                    Successor[
                      T10,

                      Successor[
                        T9,

                        Successor[
                          T8,

                          Successor[
                            T7,

                            Successor[
                              T6,

                              Successor[
                                T5,

                                Successor[
                                  T4,

                                  Successor[
                                    T3,

                                    Successor[
                                      T2,

                                      One[T1]
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
      T19,

      Successor[
        T18,

        Successor[
          T17,

          Successor[
            T16,

            Successor[
              T15,

              Successor[
                T14,

                Successor[
                  T13,

                  Successor[
                    T12,

                    Successor[
                      T11,

                      Successor[
                        T10,

                        Successor[
                          T9,

                          Successor[
                            T8,

                            Successor[
                              T7,

                              Successor[
                                T6,

                                Successor[
                                  T5,

                                  Successor[
                                    T4,

                                    Successor[
                                      T3,

                                      Successor[
                                        T2,

                                        One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T19 => Target,
    func2: Successor[
      T18,

      Successor[
        T17,

        Successor[
          T16,

          Successor[
            T15,

            Successor[
              T14,

              Successor[
                T13,

                Successor[
                  T12,

                  Successor[
                    T11,

                    Successor[
                      T10,

                      Successor[
                        T9,

                        Successor[
                          T8,

                          Successor[
                            T7,

                            Successor[
                              T6,

                              Successor[
                                T5,

                                Successor[
                                  T4,

                                  Successor[
                                    T3,

                                    Successor[
                                      T2,

                                      One[T1]
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
  ): Target = ???
}

class CoProduct20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
  instance: Successor[
    T20,

    Successor[
      T19,

      Successor[
        T18,

        Successor[
          T17,

          Successor[
            T16,

            Successor[
              T15,

              Successor[
                T14,

                Successor[
                  T13,

                  Successor[
                    T12,

                    Successor[
                      T11,

                      Successor[
                        T10,

                        Successor[
                          T9,

                          Successor[
                            T8,

                            Successor[
                              T7,

                              Successor[
                                T6,

                                Successor[
                                  T5,

                                  Successor[
                                    T4,

                                    Successor[
                                      T3,

                                      Successor[
                                        T2,

                                        One[T1]
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
      T20,

      Successor[
        T19,

        Successor[
          T18,

          Successor[
            T17,

            Successor[
              T16,

              Successor[
                T15,

                Successor[
                  T14,

                  Successor[
                    T13,

                    Successor[
                      T12,

                      Successor[
                        T11,

                        Successor[
                          T10,

                          Successor[
                            T9,

                            Successor[
                              T8,

                              Successor[
                                T7,

                                Successor[
                                  T6,

                                  Successor[
                                    T5,

                                    Successor[
                                      T4,

                                      Successor[
                                        T3,

                                        Successor[
                                          T2,

                                          One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T20 => Target,
    func2: Successor[
      T19,

      Successor[
        T18,

        Successor[
          T17,

          Successor[
            T16,

            Successor[
              T15,

              Successor[
                T14,

                Successor[
                  T13,

                  Successor[
                    T12,

                    Successor[
                      T11,

                      Successor[
                        T10,

                        Successor[
                          T9,

                          Successor[
                            T8,

                            Successor[
                              T7,

                              Successor[
                                T6,

                                Successor[
                                  T5,

                                  Successor[
                                    T4,

                                    Successor[
                                      T3,

                                      Successor[
                                        T2,

                                        One[T1]
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
  ): Target = ???
}

class CoProduct21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
  instance: Successor[
    T21,

    Successor[
      T20,

      Successor[
        T19,

        Successor[
          T18,

          Successor[
            T17,

            Successor[
              T16,

              Successor[
                T15,

                Successor[
                  T14,

                  Successor[
                    T13,

                    Successor[
                      T12,

                      Successor[
                        T11,

                        Successor[
                          T10,

                          Successor[
                            T9,

                            Successor[
                              T8,

                              Successor[
                                T7,

                                Successor[
                                  T6,

                                  Successor[
                                    T5,

                                    Successor[
                                      T4,

                                      Successor[
                                        T3,

                                        Successor[
                                          T2,

                                          One[T1]
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
      T21,

      Successor[
        T20,

        Successor[
          T19,

          Successor[
            T18,

            Successor[
              T17,

              Successor[
                T16,

                Successor[
                  T15,

                  Successor[
                    T14,

                    Successor[
                      T13,

                      Successor[
                        T12,

                        Successor[
                          T11,

                          Successor[
                            T10,

                            Successor[
                              T9,

                              Successor[
                                T8,

                                Successor[
                                  T7,

                                  Successor[
                                    T6,

                                    Successor[
                                      T5,

                                      Successor[
                                        T4,

                                        Successor[
                                          T3,

                                          Successor[
                                            T2,

                                            One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T21 => Target,
    func2: Successor[
      T20,

      Successor[
        T19,

        Successor[
          T18,

          Successor[
            T17,

            Successor[
              T16,

              Successor[
                T15,

                Successor[
                  T14,

                  Successor[
                    T13,

                    Successor[
                      T12,

                      Successor[
                        T11,

                        Successor[
                          T10,

                          Successor[
                            T9,

                            Successor[
                              T8,

                              Successor[
                                T7,

                                Successor[
                                  T6,

                                  Successor[
                                    T5,

                                    Successor[
                                      T4,

                                      Successor[
                                        T3,

                                        Successor[
                                          T2,

                                          One[T1]
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
  ): Target = ???
}

class CoProduct22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
  instance: Successor[
    T22,

    Successor[
      T21,

      Successor[
        T20,

        Successor[
          T19,

          Successor[
            T18,

            Successor[
              T17,

              Successor[
                T16,

                Successor[
                  T15,

                  Successor[
                    T14,

                    Successor[
                      T13,

                      Successor[
                        T12,

                        Successor[
                          T11,

                          Successor[
                            T10,

                            Successor[
                              T9,

                              Successor[
                                T8,

                                Successor[
                                  T7,

                                  Successor[
                                    T6,

                                    Successor[
                                      T5,

                                      Successor[
                                        T4,

                                        Successor[
                                          T3,

                                          Successor[
                                            T2,

                                            One[T1]
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
      T22,

      Successor[
        T21,

        Successor[
          T20,

          Successor[
            T19,

            Successor[
              T18,

              Successor[
                T17,

                Successor[
                  T16,

                  Successor[
                    T15,

                    Successor[
                      T14,

                      Successor[
                        T13,

                        Successor[
                          T12,

                          Successor[
                            T11,

                            Successor[
                              T10,

                              Successor[
                                T9,

                                Successor[
                                  T8,

                                  Successor[
                                    T7,

                                    Successor[
                                      T6,

                                      Successor[
                                        T5,

                                        Successor[
                                          T4,

                                          Successor[
                                            T3,

                                            Successor[
                                              T2,

                                              One[T1]
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
    ] { CoProductSelf =>
  override def tailFold[Target](
    func1: T22 => Target,
    func2: Successor[
      T21,

      Successor[
        T20,

        Successor[
          T19,

          Successor[
            T18,

            Successor[
              T17,

              Successor[
                T16,

                Successor[
                  T15,

                  Successor[
                    T14,

                    Successor[
                      T13,

                      Successor[
                        T12,

                        Successor[
                          T11,

                          Successor[
                            T10,

                            Successor[
                              T9,

                              Successor[
                                T8,

                                Successor[
                                  T7,

                                  Successor[
                                    T6,

                                    Successor[
                                      T5,

                                      Successor[
                                        T4,

                                        Successor[
                                          T3,

                                          Successor[
                                            T2,

                                            One[T1]
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
  ): Target = ???
}
