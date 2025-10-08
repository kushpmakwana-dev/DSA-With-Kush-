package com.kush;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int nums = 23597;
        int res=0;

        // While Loops to reverse the number
        while(nums>0){
            int rem = nums%10; // Get the last digit
            res = res*10 + rem; // add the last digit to the previous digit
            nums/=10; // eliminate the last digit
        }

        System.out.println(res);
    }
}
