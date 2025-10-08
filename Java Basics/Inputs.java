package com.kush;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of your choice: ");
        int roll = in.nextInt();
        System.out.println("Your number is " + roll);

        String name = in.next();
        System.out.println(name);

        float marks = in.nextFloat();
        System.out.println(marks);

        int a = 10; // Here 'a' is the Reference Variable / Identifier / Variable and '10' is the literal

    }
}
