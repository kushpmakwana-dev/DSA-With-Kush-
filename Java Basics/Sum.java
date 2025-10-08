package com.kush;

// importing necessary libraries.
import java.util.Scanner;

// Class named Sum.
public class Sum {
    // Entry point of any code.
    public static void main(String[] args) {
        // Take inputs from user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();

        // Print the input taken and perform and print the sum
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
        int sum = num1 + num2;
        System.out.println("Sum of 2 numbers is = " + sum);
    }
}
