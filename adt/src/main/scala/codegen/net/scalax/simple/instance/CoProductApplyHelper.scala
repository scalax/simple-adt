

package net.scalax.simple.adt
package instance

import typedadt._







    trait CoProduct1ApplyHelper[T1 ] {
        

        def instance1(t: T1): CoProduct1[T1 ] =
            new CoProduct1[T1 ](
    
        One.value(t)
    
)
    }



    trait CoProduct2ApplyHelper[T1  ,T2 ] {
        
            def instance1(t: T1): CoProduct2[T1  ,T2 ] =
                new CoProduct2[T1  ,T2 ](
    
        Successor.Left(t)
    
)
        

        def instance2(t: T2): CoProduct2[T1  ,T2 ] =
            new CoProduct2[T1  ,T2 ](
    
        Successor.Right(
    
        One.value(t)
    
)
    
)
    }



    trait CoProduct3ApplyHelper[T1  ,T2  ,T3 ] {
        
            def instance1(t: T1): CoProduct3[T1  ,T2  ,T3 ] =
                new CoProduct3[T1  ,T2  ,T3 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct3[T1  ,T2  ,T3 ] =
                new CoProduct3[T1  ,T2  ,T3 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        

        def instance3(t: T3): CoProduct3[T1  ,T2  ,T3 ] =
            new CoProduct3[T1  ,T2  ,T3 ](
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
)
    
)
    
)
    }



    trait CoProduct4ApplyHelper[T1  ,T2  ,T3  ,T4 ] {
        
            def instance1(t: T1): CoProduct4[T1  ,T2  ,T3  ,T4 ] =
                new CoProduct4[T1  ,T2  ,T3  ,T4 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct4[T1  ,T2  ,T3  ,T4 ] =
                new CoProduct4[T1  ,T2  ,T3  ,T4 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct4[T1  ,T2  ,T3  ,T4 ] =
                new CoProduct4[T1  ,T2  ,T3  ,T4 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        

        def instance4(t: T4): CoProduct4[T1  ,T2  ,T3  ,T4 ] =
            new CoProduct4[T1  ,T2  ,T3  ,T4 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
)
    
)
    
)
    
)
    }



    trait CoProduct5ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5 ] {
        
            def instance1(t: T1): CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ] =
                new CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ] =
                new CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ] =
                new CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ] =
                new CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        

        def instance5(t: T5): CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ] =
            new CoProduct5[T1  ,T2  ,T3  ,T4  ,T5 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
)
    
)
    
)
    
)
    
)
    }



    trait CoProduct6ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ] {
        
            def instance1(t: T1): CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ] =
                new CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ] =
                new CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ] =
                new CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ] =
                new CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ] =
                new CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        

        def instance6(t: T6): CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ] =
            new CoProduct6[T1  ,T2  ,T3  ,T4  ,T5  ,T6 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
)
    
)
    
)
    
)
    
)
    
)
    }



    trait CoProduct7ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ] {
        
            def instance1(t: T1): CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ] =
                new CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ] =
                new CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ] =
                new CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ] =
                new CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ] =
                new CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ] =
                new CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        

        def instance7(t: T7): CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ] =
            new CoProduct7[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    }



    trait CoProduct8ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] {
        
            def instance1(t: T1): CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] =
                new CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] =
                new CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] =
                new CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] =
                new CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] =
                new CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] =
                new CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] =
                new CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        

        def instance8(t: T8): CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ] =
            new CoProduct8[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    }



    trait CoProduct9ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] {
        
            def instance1(t: T1): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
                new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
                new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
                new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
                new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
                new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
                new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
                new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
                new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        

        def instance9(t: T9): CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ] =
            new CoProduct9[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    }



    trait CoProduct10ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] {
        
            def instance1(t: T1): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
                new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        

        def instance10(t: T10): CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ] =
            new CoProduct10[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct11ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] {
        
            def instance1(t: T1): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
                new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance11(t: T11): CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ] =
            new CoProduct11[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct12ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] {
        
            def instance1(t: T1): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
                new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance12(t: T12): CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ] =
            new CoProduct12[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct13ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] {
        
            def instance1(t: T1): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
                new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance13(t: T13): CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ] =
            new CoProduct13[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct14ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] {
        
            def instance1(t: T1): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
                new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance14(t: T14): CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ] =
            new CoProduct14[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct15ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] {
        
            def instance1(t: T1): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance14(t: T14): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
                new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance15(t: T15): CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ] =
            new CoProduct15[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct16ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] {
        
            def instance1(t: T1): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance14(t: T14): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance15(t: T15): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
                new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance16(t: T16): CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ] =
            new CoProduct16[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct17ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] {
        
            def instance1(t: T1): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance14(t: T14): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance15(t: T15): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance16(t: T16): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
                new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance17(t: T17): CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ] =
            new CoProduct17[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct18ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] {
        
            def instance1(t: T1): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance14(t: T14): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance15(t: T15): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance16(t: T16): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance17(t: T17): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
                new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance18(t: T18): CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ] =
            new CoProduct18[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct19ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] {
        
            def instance1(t: T1): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance14(t: T14): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance15(t: T15): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance16(t: T16): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance17(t: T17): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance18(t: T18): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
                new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance19(t: T19): CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ] =
            new CoProduct19[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct20ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] {
        
            def instance1(t: T1): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance14(t: T14): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance15(t: T15): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance16(t: T16): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance17(t: T17): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance18(t: T18): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance19(t: T19): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
                new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance20(t: T20): CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ] =
            new CoProduct20[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct21ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] {
        
            def instance1(t: T1): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance14(t: T14): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance15(t: T15): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance16(t: T16): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance17(t: T17): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance18(t: T18): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance19(t: T19): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance20(t: T20): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
                new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance21(t: T21): CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ] =
            new CoProduct21[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }



    trait CoProduct22ApplyHelper[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] {
        
            def instance1(t: T1): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Left(t)
    
)
        
            def instance2(t: T2): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
        
            def instance3(t: T3): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
        
            def instance4(t: T4): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
        
            def instance5(t: T5): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
        
            def instance6(t: T6): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance7(t: T7): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance8(t: T8): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance9(t: T9): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
    
)
        
            def instance10(t: T10): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance11(t: T11): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance12(t: T12): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance13(t: T13): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance14(t: T14): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance15(t: T15): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance16(t: T16): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance17(t: T17): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance18(t: T18): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance19(t: T19): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance20(t: T20): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        
            def instance21(t: T21): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
                new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Left(t)
    
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
        

        def instance22(t: T22): CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ] =
            new CoProduct22[T1  ,T2  ,T3  ,T4  ,T5  ,T6  ,T7  ,T8  ,T9  ,T10  ,T11  ,T12  ,T13  ,T14  ,T15  ,T16  ,T17  ,T18  ,T19  ,T20  ,T21  ,T22 ](
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        Successor.Right(
    
        One.value(t)
    
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
    }

