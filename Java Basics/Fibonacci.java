package com.kush;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        int sum;

        for (int i = 0; i <= n; i++) {
            sum = a + b; // 1 + 0 = 1 = sum
            System.out.println(a);
            a = b; // a = 1
            b = sum; // b = 1
        }
    }
}
