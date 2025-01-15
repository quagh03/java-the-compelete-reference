package com.huylq.chapter3;

public class Variables {

    /*
    * Variable is the basic unit of storage in Java program.
    * Defined by the combination of and identifier, type and an optional initializer. All vars have a scope,
    * which defines their visibility, and a lifetime. These elements are examined next.
    */

    public static void main(String[] args) {

        // Variable must be declared before they can be used. The basic form of variable declaration is
        // type identifier [= value][, identifier[= value]...];
        // Example variable declarations of various types.
        int a, b, c;
        int d = 3, e, f = 4;
        byte z = 22;
        double pi = 3.14159265359;
        char x = 'x';

        /*
        * 'var' keyword introduced in Java 10 as part of the Local Variable Type inference feature.
        * Allows the compiler to infer the type of local variable based on the context.
        * Makes code more concise while still being strongly typed
        * Key Features of 'var'
        *   Type inference: The compiler determines the variable's type at compile-time based on the value assigned
        *   Restrictions:
        *       Cannot be used for fields: var can only be used for a local vars in methods, constructors, or initialization blocks.
        *       Cannot be used without initialization
        *           var x; // ERROR: x might not have been init
        *       Cannot be null without explicitly casting
        *           var obj = null; // ERROR: cannot infer type
        *           var obj = (String) null; // Valid
        */
        //EXAMPLE
        var num = 10;
        var s = "String";

        /*
        * Scopes can be nested. For example, each time you create a block of code, you are
            creating a new, nested scope. When this occurs, the outer scope encloses the inner scope.
            This means that objects declared in the outer scope will be visible to code within the inner
            scope. However, the reverse is not true. Objects declared within the inner scope will not be
            visible outside it.
        */

        /*
        * variables are created when their scope is entered, and destroyed when their scope is left. This means that a variable will not hold its
            value once it has gone out of scope. Therefore, variables declared within a method will not
            hold their values between calls to that method. Also, a variable declared within a block will
            lose its value when the block is left. Thus, the lifetime of a variable is confined to its scope.
            If a variable declaration includes an initializer, then that variable will be reinitialized each
            time the block in which it is declared is entered. For example, for loop
        */

        for(int i = 0; i < 3; i++){
            int y = -1;
            System.out.println("y = " + y);
            y = 100;
            System.out.println("y is now: " + y);
        }

    }

}
