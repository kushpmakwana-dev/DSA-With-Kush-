package com.kush;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;
        /*
        - Formatting Print Statement
        - Place a placeholder using "%" and then variable name.
        - %.2f means I have float value and I need it only till 2 decimals
        - formatting can only take place when there is printf and not println.

        */
//        System.out.printf("Formatted number is %.2f", a);

        System.out.printf("Value of pie is %.3f", Math.PI);
        System.out.println();

        System.out.printf("Kush is %s and his surname is %s", "Cool", "Makwana");

    }
}
