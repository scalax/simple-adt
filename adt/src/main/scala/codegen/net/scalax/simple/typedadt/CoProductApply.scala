package net.scalax.simple.adt
package typedadt

import instance._

trait CoProduct1Apply[T1] extends CoProduct1ApplyHelper[T1] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      One[AdtFunction[Target, T1]]
    ]
  ): CoProduct1[T1] =
    typeOnly[Target].fold((t => Self.instance1(t.instance(target))))

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      One[AdtFunction[Target, T1]]
    ]
  ): CoProduct1[AdtFunction[Target, T1]] =
    new CoProduct1(adtCv.value)
}

trait CoProduct2Apply[T1, T2] extends CoProduct2ApplyHelper[T1, T2] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        One[AdtFunction[Target, T2]]
      ]
    ]
  ): CoProduct2[T1, T2] =
    typeOnly[Target].fold((t => Self.instance1(t.instance(target))), (t => Self.instance2(t.instance(target))))

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        One[AdtFunction[Target, T2]]
      ]
    ]
  ): CoProduct2[AdtFunction[Target, T1], AdtFunction[Target, T2]] =
    new CoProduct2(adtCv.value)
}

trait CoProduct3Apply[T1, T2, T3] extends CoProduct3ApplyHelper[T1, T2, T3] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          One[AdtFunction[Target, T3]]
        ]
      ]
    ]
  ): CoProduct3[T1, T2, T3] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          One[AdtFunction[Target, T3]]
        ]
      ]
    ]
  ): CoProduct3[AdtFunction[Target, T1], AdtFunction[Target, T2], AdtFunction[Target, T3]] =
    new CoProduct3(adtCv.value)
}

trait CoProduct4Apply[T1, T2, T3, T4] extends CoProduct4ApplyHelper[T1, T2, T3, T4] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            One[AdtFunction[Target, T4]]
          ]
        ]
      ]
    ]
  ): CoProduct4[T1, T2, T3, T4] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            One[AdtFunction[Target, T4]]
          ]
        ]
      ]
    ]
  ): CoProduct4[AdtFunction[Target, T1], AdtFunction[Target, T2], AdtFunction[Target, T3], AdtFunction[Target, T4]] =
    new CoProduct4(adtCv.value)
}

trait CoProduct5Apply[T1, T2, T3, T4, T5] extends CoProduct5ApplyHelper[T1, T2, T3, T4, T5] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              One[AdtFunction[Target, T5]]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct5[T1, T2, T3, T4, T5] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              One[AdtFunction[Target, T5]]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct5[AdtFunction[Target, T1], AdtFunction[Target, T2], AdtFunction[Target, T3], AdtFunction[Target, T4], AdtFunction[
    Target,
    T5
  ]] =
    new CoProduct5(adtCv.value)
}

trait CoProduct6Apply[T1, T2, T3, T4, T5, T6] extends CoProduct6ApplyHelper[T1, T2, T3, T4, T5, T6] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                One[AdtFunction[Target, T6]]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct6[T1, T2, T3, T4, T5, T6] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                One[AdtFunction[Target, T6]]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct6[AdtFunction[Target, T1], AdtFunction[Target, T2], AdtFunction[Target, T3], AdtFunction[Target, T4], AdtFunction[
    Target,
    T5
  ], AdtFunction[Target, T6]] =
    new CoProduct6(adtCv.value)
}

trait CoProduct7Apply[T1, T2, T3, T4, T5, T6, T7] extends CoProduct7ApplyHelper[T1, T2, T3, T4, T5, T6, T7] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  One[AdtFunction[Target, T7]]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct7[T1, T2, T3, T4, T5, T6, T7] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  One[AdtFunction[Target, T7]]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct7[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7]
  ] =
    new CoProduct7(adtCv.value)
}

trait CoProduct8Apply[T1, T2, T3, T4, T5, T6, T7, T8] extends CoProduct8ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    One[AdtFunction[Target, T8]]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct8[T1, T2, T3, T4, T5, T6, T7, T8] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    One[AdtFunction[Target, T8]]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct8[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8]
  ] =
    new CoProduct8(adtCv.value)
}

trait CoProduct9Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9] extends CoProduct9ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      One[AdtFunction[Target, T9]]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      One[AdtFunction[Target, T9]]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct9[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9]
  ] =
    new CoProduct9(adtCv.value)
}

trait CoProduct10Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] extends CoProduct10ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] {
  Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        One[AdtFunction[Target, T10]]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        One[AdtFunction[Target, T10]]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct10[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10]
  ] =
    new CoProduct10(adtCv.value)
}

trait CoProduct11Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
    extends CoProduct11ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          One[AdtFunction[Target, T11]]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          One[AdtFunction[Target, T11]]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct11[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11]
  ] =
    new CoProduct11(adtCv.value)
}

trait CoProduct12Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
    extends CoProduct12ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            One[AdtFunction[Target, T12]]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            One[AdtFunction[Target, T12]]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct12[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12]
  ] =
    new CoProduct12(adtCv.value)
}

trait CoProduct13Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
    extends CoProduct13ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              One[AdtFunction[Target, T13]]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              One[AdtFunction[Target, T13]]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct13[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13]
  ] =
    new CoProduct13(adtCv.value)
}

trait CoProduct14Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
    extends CoProduct14ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                One[AdtFunction[Target, T14]]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                One[AdtFunction[Target, T14]]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct14[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14]
  ] =
    new CoProduct14(adtCv.value)
}

trait CoProduct15Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    extends CoProduct15ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  One[AdtFunction[Target, T15]]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target))),
      (t => Self.instance15(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  One[AdtFunction[Target, T15]]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct15[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14],
    AdtFunction[Target, T15]
  ] =
    new CoProduct15(adtCv.value)
}

trait CoProduct16Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    extends CoProduct16ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    One[AdtFunction[Target, T16]]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target))),
      (t => Self.instance15(t.instance(target))),
      (t => Self.instance16(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    One[AdtFunction[Target, T16]]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct16[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14],
    AdtFunction[Target, T15],
    AdtFunction[Target, T16]
  ] =
    new CoProduct16(adtCv.value)
}

trait CoProduct17Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    extends CoProduct17ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      One[AdtFunction[Target, T17]]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target))),
      (t => Self.instance15(t.instance(target))),
      (t => Self.instance16(t.instance(target))),
      (t => Self.instance17(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      One[AdtFunction[Target, T17]]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct17[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14],
    AdtFunction[Target, T15],
    AdtFunction[Target, T16],
    AdtFunction[Target, T17]
  ] =
    new CoProduct17(adtCv.value)
}

trait CoProduct18Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    extends CoProduct18ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        One[AdtFunction[Target, T18]]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target))),
      (t => Self.instance15(t.instance(target))),
      (t => Self.instance16(t.instance(target))),
      (t => Self.instance17(t.instance(target))),
      (t => Self.instance18(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        One[AdtFunction[Target, T18]]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct18[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14],
    AdtFunction[Target, T15],
    AdtFunction[Target, T16],
    AdtFunction[Target, T17],
    AdtFunction[Target, T18]
  ] =
    new CoProduct18(adtCv.value)
}

trait CoProduct19Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    extends CoProduct19ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        Successor[
                                          AdtFunction[Target, T18],

                                          One[AdtFunction[Target, T19]]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target))),
      (t => Self.instance15(t.instance(target))),
      (t => Self.instance16(t.instance(target))),
      (t => Self.instance17(t.instance(target))),
      (t => Self.instance18(t.instance(target))),
      (t => Self.instance19(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        Successor[
                                          AdtFunction[Target, T18],

                                          One[AdtFunction[Target, T19]]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct19[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14],
    AdtFunction[Target, T15],
    AdtFunction[Target, T16],
    AdtFunction[Target, T17],
    AdtFunction[Target, T18],
    AdtFunction[Target, T19]
  ] =
    new CoProduct19(adtCv.value)
}

trait CoProduct20Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    extends CoProduct20ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        Successor[
                                          AdtFunction[Target, T18],

                                          Successor[
                                            AdtFunction[Target, T19],

                                            One[AdtFunction[Target, T20]]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target))),
      (t => Self.instance15(t.instance(target))),
      (t => Self.instance16(t.instance(target))),
      (t => Self.instance17(t.instance(target))),
      (t => Self.instance18(t.instance(target))),
      (t => Self.instance19(t.instance(target))),
      (t => Self.instance20(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        Successor[
                                          AdtFunction[Target, T18],

                                          Successor[
                                            AdtFunction[Target, T19],

                                            One[AdtFunction[Target, T20]]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct20[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14],
    AdtFunction[Target, T15],
    AdtFunction[Target, T16],
    AdtFunction[Target, T17],
    AdtFunction[Target, T18],
    AdtFunction[Target, T19],
    AdtFunction[Target, T20]
  ] =
    new CoProduct20(adtCv.value)
}

trait CoProduct21Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    extends CoProduct21ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] { Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        Successor[
                                          AdtFunction[Target, T18],

                                          Successor[
                                            AdtFunction[Target, T19],

                                            Successor[
                                              AdtFunction[Target, T20],

                                              One[AdtFunction[Target, T21]]
                                            ]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target))),
      (t => Self.instance15(t.instance(target))),
      (t => Self.instance16(t.instance(target))),
      (t => Self.instance17(t.instance(target))),
      (t => Self.instance18(t.instance(target))),
      (t => Self.instance19(t.instance(target))),
      (t => Self.instance20(t.instance(target))),
      (t => Self.instance21(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        Successor[
                                          AdtFunction[Target, T18],

                                          Successor[
                                            AdtFunction[Target, T19],

                                            Successor[
                                              AdtFunction[Target, T20],

                                              One[AdtFunction[Target, T21]]
                                            ]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct21[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14],
    AdtFunction[Target, T15],
    AdtFunction[Target, T16],
    AdtFunction[Target, T17],
    AdtFunction[Target, T18],
    AdtFunction[Target, T19],
    AdtFunction[Target, T20],
    AdtFunction[Target, T21]
  ] =
    new CoProduct21(adtCv.value)
}

trait CoProduct22Apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    extends CoProduct22ApplyHelper[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
  Self =>
  def instance[Target](target: Target)(implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        Successor[
                                          AdtFunction[Target, T18],

                                          Successor[
                                            AdtFunction[Target, T19],

                                            Successor[
                                              AdtFunction[Target, T20],

                                              Successor[
                                                AdtFunction[Target, T21],

                                                One[AdtFunction[Target, T22]]
                                              ]
                                            ]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    typeOnly[Target].fold(
      (t => Self.instance1(t.instance(target))),
      (t => Self.instance2(t.instance(target))),
      (t => Self.instance3(t.instance(target))),
      (t => Self.instance4(t.instance(target))),
      (t => Self.instance5(t.instance(target))),
      (t => Self.instance6(t.instance(target))),
      (t => Self.instance7(t.instance(target))),
      (t => Self.instance8(t.instance(target))),
      (t => Self.instance9(t.instance(target))),
      (t => Self.instance10(t.instance(target))),
      (t => Self.instance11(t.instance(target))),
      (t => Self.instance12(t.instance(target))),
      (t => Self.instance13(t.instance(target))),
      (t => Self.instance14(t.instance(target))),
      (t => Self.instance15(t.instance(target))),
      (t => Self.instance16(t.instance(target))),
      (t => Self.instance17(t.instance(target))),
      (t => Self.instance18(t.instance(target))),
      (t => Self.instance19(t.instance(target))),
      (t => Self.instance20(t.instance(target))),
      (t => Self.instance21(t.instance(target))),
      (t => Self.instance22(t.instance(target)))
    )

  def typeOnly[Target](implicit
    adtCv: ADTValue[
      Successor[
        AdtFunction[Target, T1],

        Successor[
          AdtFunction[Target, T2],

          Successor[
            AdtFunction[Target, T3],

            Successor[
              AdtFunction[Target, T4],

              Successor[
                AdtFunction[Target, T5],

                Successor[
                  AdtFunction[Target, T6],

                  Successor[
                    AdtFunction[Target, T7],

                    Successor[
                      AdtFunction[Target, T8],

                      Successor[
                        AdtFunction[Target, T9],

                        Successor[
                          AdtFunction[Target, T10],

                          Successor[
                            AdtFunction[Target, T11],

                            Successor[
                              AdtFunction[Target, T12],

                              Successor[
                                AdtFunction[Target, T13],

                                Successor[
                                  AdtFunction[Target, T14],

                                  Successor[
                                    AdtFunction[Target, T15],

                                    Successor[
                                      AdtFunction[Target, T16],

                                      Successor[
                                        AdtFunction[Target, T17],

                                        Successor[
                                          AdtFunction[Target, T18],

                                          Successor[
                                            AdtFunction[Target, T19],

                                            Successor[
                                              AdtFunction[Target, T20],

                                              Successor[
                                                AdtFunction[Target, T21],

                                                One[AdtFunction[Target, T22]]
                                              ]
                                            ]
                                          ]
                                        ]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ]
  ): CoProduct22[
    AdtFunction[Target, T1],
    AdtFunction[Target, T2],
    AdtFunction[Target, T3],
    AdtFunction[Target, T4],
    AdtFunction[Target, T5],
    AdtFunction[Target, T6],
    AdtFunction[Target, T7],
    AdtFunction[Target, T8],
    AdtFunction[Target, T9],
    AdtFunction[Target, T10],
    AdtFunction[Target, T11],
    AdtFunction[Target, T12],
    AdtFunction[Target, T13],
    AdtFunction[Target, T14],
    AdtFunction[Target, T15],
    AdtFunction[Target, T16],
    AdtFunction[Target, T17],
    AdtFunction[Target, T18],
    AdtFunction[Target, T19],
    AdtFunction[Target, T20],
    AdtFunction[Target, T21],
    AdtFunction[Target, T22]
  ] =
    new CoProduct22(adtCv.value)
}
