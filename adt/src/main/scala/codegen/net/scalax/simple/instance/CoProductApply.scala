package net.scalax.simple.adt
package instance

import typedadt._

trait CoProductApply1[T1] extends CoProductApplyHelper1[T1] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply2[T1, T2] extends CoProductApplyHelper2[T1, T2] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply3[T1, T2, T3] extends CoProductApplyHelper3[T1, T2, T3] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply4[T1, T2, T3, T4] extends CoProductApplyHelper4[T1, T2, T3, T4] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply5[T1, T2, T3, T4, T5] extends CoProductApplyHelper5[T1, T2, T3, T4, T5] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply6[T1, T2, T3, T4, T5, T6] extends CoProductApplyHelper6[T1, T2, T3, T4, T5, T6] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply7[T1, T2, T3, T4, T5, T6, T7] extends CoProductApplyHelper7[T1, T2, T3, T4, T5, T6, T7] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply8[T1, T2, T3, T4, T5, T6, T7, T8] extends CoProductApplyHelper8[T1, T2, T3, T4, T5, T6, T7, T8] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply9[T1, T2, T3, T4, T5, T6, T7, T8, T9] extends CoProductApplyHelper9[T1, T2, T3, T4, T5, T6, T7, T8, T9] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] extends CoProductApplyHelper10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] {
  Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
    extends CoProductApplyHelper11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
    extends CoProductApplyHelper12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
    extends CoProductApplyHelper13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
    extends CoProductApplyHelper14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    extends CoProductApplyHelper15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    extends CoProductApplyHelper16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    extends CoProductApplyHelper17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    extends CoProductApplyHelper18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    extends CoProductApplyHelper19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    extends CoProductApplyHelper20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    extends CoProductApplyHelper21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] { Self =>
  def target[Target](target: Target)(implicit
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

trait CoProductApply22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    extends CoProductApplyHelper22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
  Self =>
  def target[Target](target: Target)(implicit
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
