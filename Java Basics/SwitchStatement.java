package com.kush;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        /*
        In Switch Statement, You can jump in various cases based on your Expressions.
        Rules:
        - Cases must be of same type as expression.
        - Duplicate case values not allowed
        - "break" is used to terminate the sequence otherwise it will continue to the next case
        - "default" will execute when none of the above does
        - if "default" is not at the end, put break after it.
        */

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            case "Sanika" -> System.out.println("My sunshine");
            default -> System.out.println("Enter the valid fruit");
        }

        int day = in.nextInt();

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }

    }
}
