package com.cursor;

public class Main {
    public static void main(String[] args) {
        intExamples(64,8);

        byte q = 127;
        byteExamples((byte)1,q); //-128 +127

        short x = 32;
        short y = 8;
        shortExamples(x,y); // -32 768 + 32 767

        longExamples(1000L, 879024444);

        doubleExamples(1.8, 1.9);

        float a = 1.8f;
        float b = 1.9f;
        doubleExamples(a,b);
        floatExamples(a,b);



    }

    public static void intExamples (int x, int y){
        System.out.println("Arithmetic operations with int");
        int z = x+y;
        System.out.println(x+" + "+y +" = " + z);
        z = x-y;
        System.out.println(x+" - "+y +" = " + z);
        z = x*y;
        System.out.println(x+" * "+y +" = " + z);
        z = x/y;
        System.out.println(x+" / "+y +" = " + z);
    }

    public static void byteExamples (byte x, byte y){
        System.out.println("Arithmetic operations with byte");
        byte z = (byte)(x+y);
        System.out.println(x+" + "+y +" = " + z);
        z = (byte)(x-y);
        System.out.println(x+" - "+y +" = " + z);
        z = (byte)(x*y);
        System.out.println(x+" * "+y +" = " + z);
        z = (byte)(x/y);
        System.out.println(x+" / "+y +" = " + z);
    }

    public static void shortExamples (short x, short y){
        System.out.println("Arithmetic operations with short");
        short z = (short)(x+y);
        System.out.println(x+" + "+y +" = " + z);
        z = (short)(x-y);
        System.out.println(x+" - "+y +" = " + z);
        z = (short)(x*y);
        System.out.println(x+" * "+y +" = " + z);
        z = (short)(x/y);
        System.out.println(x+" / "+y +" = " + z);
    }

    public static void longExamples (long x, long y){
        System.out.println("Arithmetic operations with long");
        long z = x+y;
        System.out.println(x+" + "+y +" = " + z);
        z = x-y;
        System.out.println(x+" - "+y +" = " + z);
        z = x*y;
        System.out.println(x+" * "+y +" = " + z);
        z = x/y;
        System.out.println(x+" / "+y +" = " + z);
    }
    public static void doubleExamples (double x, double y){
        System.out.println("Arithmetic operations with double");
        double z = x+y;
        System.out.println(x+" + "+y +" = " + z);
        z = x-y;
        System.out.println(x+" - "+y +" = " + z);
        z = x*y;
        System.out.println(x+" * "+y +" = " + z);
        z = x/y;
        System.out.println(x+" / "+y +" = " + z);
    }

    public static void floatExamples (float x, float y){
        System.out.println("Arithmetic operations with float");
        float z = x+y;
        System.out.println(x+" + "+y +" = " + z);
        z = x-y;
        System.out.println(x+" - "+y +" = " + z);
        z = x*y;
        System.out.println(x+" * "+y +" = " + z);
        z = x/y;
        System.out.println(x+" / "+y +" = " + z);
    }



}
