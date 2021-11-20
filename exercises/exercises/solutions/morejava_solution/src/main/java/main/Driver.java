package main;

import util.Math;

public class Driver {
    public static void main(String[] args) {
        int a=10,b=20,c=30, integerResult=0;

        integerResult = Math.add(a, b, c);

        System.out.printf("%d + %d + %d = %d%n", a,b,c,integerResult);


        double d=10.55,e=5.21,f=77.87, doubleResult=0.0;

        doubleResult = Math.add(d, e, f);

        System.out.printf("%f + %f + %f = %f%n", d,e,f,doubleResult);

    }
}
