package com.huylq.chapter3;

public class PrimitiveTypes {
    public static void main(String[] args) {
        /*
        * The Primitive Types
        * Integer: This group include byte, short, int and long
        * Floating-point numbers: This group include float and double
        * Characters: This group include char, which represent symbols in a char set, like letters and numbers
        * Boolean: This group include boolean, which is a specific type for representing true/false
        * Primitive represent single values-not complex objects.
        */

        /*
        * INTEGERS GROUP
        * byte, short, int and long all of these are signed, positive and negative value.
        * Java DOES NOT SUPPORT unsigned, positive-only integers!
        * +---------+-------+---------------------------------------------------------+
        * |  NAME   | WIDTH |                          RANGE                          |
        * +---------+-------+---------------------------------------------------------+
        * |  long   |  64   | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
        * |  int    |  32   |      -2,147,483,648 to 2,147,483,647                    |
        * |  short  |  16   |         -32,768 to 32,767                               |
        * |  byte   |   8   |           -128 to 127                                   |
        * +---------+-------+---------------------------------------------------------+
        */

        System.out.println("**********************************************");
        System.out.println("Integers group:");
        //byte useful when working with a stream of data from network or file
        byte a = 1;
        System.out.println("This is value from defined byte variable: " + a);

        //short (probably the least used type)
        short b = 2;
        System.out.println("This is value from defined short variable: " + b);

        //int the most commonly, usually use to control loops and to index arrays
        int c = 10;
        System.out.println("This is value from defined int variable: " + c);

        //long use when int is not large enough. For example computes the number of miles light will travel
        long lightSpeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightSpeed * seconds;
        System.out.println("In 1000 days light will travel about: " + distance + " miles");
        System.out.println("**********************************************");

        /*
        * FLOATING-POINT TYPES GROUP
        * also known á real numbers, are used when evaluating expressions require fractional precision
        * for example, calculation such as square root, or transcendentals such as sine and cosine
        * java implements standard IEEE-754 set of floating-points types and operators
        * 2 kinds of floating-point types, float(single precision) and double(double-precision)
        * +---------+-------+--------------------------------------------------------------+
        * |  NAME   | WIDTH |                            RANGE                             |
        * +---------+-------+--------------------------------------------------------------+
        * |  float  |  32   |  Approximately ±3.40282347E+38 (7 decimal digits)            |
        * |  double |  64   |  Approximately ±1.79769313486231570E+308 (15 decimal digits) |
        * +---------+-------+--------------------------------------------------------------+
        */

        //float specifies a single-precision value
        float temperatureNow = 27;
        System.out.println("Temperature from a float variable: " + temperatureNow);

        //double - double precision use 64bits. Use when need to maintain accuracy over many iterative calculations
        double pi = 3.141592653589793238462643383279502884197;
        double r = 10.8;
        double area = pi * r * r;
        System.out.println("This is value from defined double variable: " + area);
        System.out.println("**********************************************");


    }
}
