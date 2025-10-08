package com.kush;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Take input from the users
        System.out.print("Enter the first number: ");
        int firstNum = in.nextInt();

        System.out.print("Enter the Second number: ");
        int SecondNum = in.nextInt();

        System.out.print("Enter the Third number: ");
        int ThirdNum = in.nextInt();

        // Check the Conditions
        if (firstNum > SecondNum && firstNum > ThirdNum){
            System.out.println(firstNum + " is the greatest");
        } else if (SecondNum>firstNum && SecondNum>ThirdNum) {
            System.out.println(SecondNum + " is the greatest");
        } else {
            System.out.println(ThirdNum + " is the greatest");
        }


    }
}
