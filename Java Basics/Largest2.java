package com.kush;
import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 20;
        int b = 30;
        int c = 40;

        // max is defined
        int max;
        max = a; // max = 20

        // first if condition to compare it with 'b'
        if(b>max){
            max=b; // since b (30) > 20 hence now max = 30
        }

        // second if condition to compare it with 'c'
        if(c>max){
            max=c; // since c (40) > 30 hence now max = 40
        }

        System.out.println(max);

    }
}
