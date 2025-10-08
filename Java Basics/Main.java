package com.kush;
// Folder in which Java files lie
// This file will only be accessible to the files that are inside this packages
// "kush" folder is inside the "com" folder

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // In Java everything is in form of classes
        // Java developer has provided the code of basic functions (print, input etc etc)
        // System is a class
        // out is the variable that is "PrintStream"
        // println is the method inside the System

        //System (class) contain a printstream whose variable name is "out" and inside it there is method/function named "println"

        System.out.print("Hello World "); // It will not print output in "next line"
        System.out.println("I am Kush Makwana");
        System.out.println("I am Sanika Bhatkar");

        Scanner input = new Scanner(System.in);
        // Creating an object 'input'
        // input is taken from keyboard because we have specified "System.in"
        System.out.println(input.nextLine()); // Input entire line
        System.out.println(input.next()); // Input first word of the string e.g "How" of "How are you"
        System.out.println(input.nextInt()); // Take INT only, throws an error if "string" is detected
    }
}
