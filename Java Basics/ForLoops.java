package com.kush;
// importing necessary libraries
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q. Print number from 1 to 5
        // Loops - a particular part of code running for certain amount time

        // for-loop - When we know how many times loop is going to run!

        // taking the inputs from the user
        System.out.print("Enter Your lucky number: ");
        int n;
        n = in.nextInt();

        // Running the for-loop for the "n" times
        for (int i = 1; i <=n ; i++) {
            System.out.println(i + "." + "Hello World");
        }

    }
}
