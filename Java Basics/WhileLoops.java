package com.kush;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // While loop - When we don't know how many time the loop is going to run!
        // initialise the count
        int count;
        count = 1;

        // take the "end" of the loop from the user.
        System.out.print("Enter the number of your choice: ");
        int n = in.nextInt();

        // Apply final "While loop"
        while(count<=n){
            System.out.println(count);
            count++;
        }

        // Do-While loops - Loop will execute at-least once, After that it will run only if the condition is true

        /*
        Syntax
        do {
        DO Something
        } while(condition)
        */

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=5);
    }
}
