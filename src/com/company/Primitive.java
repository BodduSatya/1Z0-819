package com.company;

public class Primitive {
    long primitive(){

        boolean bo = true ; //false

        //underflow
        byte b = 1; //int (-128 to 127)
        b = 'a';

        short s =1; //int (-32,768 to 32,767)
        s='a';
        s=b;
        //b=s;

        int i=1;
        i='a';
        i=b;
        i=s;
        //b=i;
        //s=i
        long lo=1;
        lo=2147483648L;
        lo='a';

        float f=1;
        f = 1L;
        f=2147483648L; //2.14748365E9
        f = 3.14f;
        f='a';

        double d=1;
        d=2147483648L;
        d =3.14; //double
        d='a';

        char c = 'a'; //97
        c = 1; //(0 to 65,535)

        return 1L;
    }
}
