package com.kush;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        // Functions: In java it is known as "Methods"
        // Bunch of code that can be used again and again

        /*
           Syntax:
            return_type name(){
             // Write the code that can be used again and again
            }
        */

        // Function call
        sum();

        // Function call of integer return type functions
        multiplication();

        // Function call of String return type functions
        System.out.println(greet());

        // Function with Value pass
        System.out.println(modulo(20, 5));
        System.out.println(myGreet("Kush"));

    }

    // One with "NO RETURN TYPE" or "VOID"
    static void sum(){
        Scanner in = new Scanner(System.in);

        //  Take user Inputs
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();

        // Calculate Total
        int tot = num1 + num2;
        System.out.println("The Sum: " + tot);

    }

    // One with "INT" return type
    public static int multiplication(){
        // here "int" is the return type
        // hence the value
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num3 = in.nextInt();
        System.out.print("Enter the Second number: ");
        int num4 = in.nextInt();

        // Calculate Total
        int Product = num3 * num4;

        return Product; // This line is important because it is returning the integer
        // Any thing after "return" will never be executed and are known as unreachable
    }

    // One with "STRING" return type
    static String greet(){
        return "Hello, Namaste";
        // If return type is "String" you cannot return integers
    }

    // Passing the value of numbers when you are calling the method in main()
    static int modulo(int a, int b){
        int mod = a % b;
        return mod;
    }

    // Passing String as an input
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
