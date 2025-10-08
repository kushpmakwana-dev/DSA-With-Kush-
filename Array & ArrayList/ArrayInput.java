package com.kush;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        /*
        1. Using for-loop you can take input/print from users
        2. using for-each loop you can take input/print
        3. Arrays.toString is used for printing the arrays
        * */

        // "for loop" for taking input from user

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // "for loop" for printing each and every input
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // "for-each"
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        * */

        System.out.println(Arrays.toString(arr)); // another way to print an array

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
