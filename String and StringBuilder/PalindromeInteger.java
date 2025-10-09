package com.kush;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("The input the integer: ");
        int nums = in.nextInt();

        int originalNums = nums;
        int rev=0;

        while(nums>0){
            int rem = nums%10;
            rev = rev*10+rem;
            nums/=10;
        }

        if(originalNums==rev){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }
}
