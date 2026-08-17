package net.scalax.simple.adt

import instance._

package object typedadt {

  type CoProducts2[Target, T1, T2] = ADTValue[
    Successor[
      AdtFunction[Target, T1],

      One[AdtFunction[Target, T2]]
    ]
  ]

  type CoProducts3[Target, T1, T2, T3] = ADTValue[
    Successor[
      AdtFunction[Target, T1],

      Successor[
        AdtFunction[Target, T2],

        One[AdtFunction[Target, T3]]
      ]
    ]
  ]

  type CoProducts4[Target, T1, T2, T3, T4] = ADTValue[
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

  type CoProducts5[Target, T1, T2, T3, T4, T5] = ADTValue[
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

  type CoProducts6[Target, T1, T2, T3, T4, T5, T6] = ADTValue[
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

  type CoProducts7[Target, T1, T2, T3, T4, T5, T6, T7] = ADTValue[
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

  type CoProducts8[Target, T1, T2, T3, T4, T5, T6, T7, T8] = ADTValue[
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

  type CoProducts9[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9] = ADTValue[
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

  type CoProducts10[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = ADTValue[
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

  type CoProducts11[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = ADTValue[
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

  type CoProducts12[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = ADTValue[
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

  type CoProducts13[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = ADTValue[
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

  type CoProducts14[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = ADTValue[
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

  type CoProducts15[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = ADTValue[
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

  type CoProducts16[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = ADTValue[
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

  type CoProducts17[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = ADTValue[
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

  type CoProducts18[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = ADTValue[
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

  type CoProducts19[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = ADTValue[
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

  type CoProducts20[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = ADTValue[
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

  type CoProducts21[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = ADTValue[
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

  type CoProducts22[Target, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = ADTValue[
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

}
