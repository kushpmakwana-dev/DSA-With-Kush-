package com.kush;

public class CountingOccurrences {
    public static void main(String[] args) {
        // initialize n (Hard coded for testing purpose)
        int n = 45536;

        // initialise count as '0'
        int count;
        count=0;

        while(n>0){
            int rem = n%10; // gets the last digit
            if (rem==3){
                count++; // if the rem matches with the value then increment the count
            }
            n /= 10; // It will eliminate the last digit from the code
        }

        System.out.println(count);
    }
}
