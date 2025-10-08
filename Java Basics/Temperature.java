package com.kush;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the temperature in "Celsius"
        System.out.print("Enter the Temperature in Celsius: ");
        float TempC = input.nextInt();

        // Formula for converting Degree Celsius into Fahrenheit
        float TempF = (TempC * 9/5) + 32;

        // Print the output
        System.out.print("The temperature in F* is: ");
        System.out.println(TempF);

    }
}
