package com.kush;

public class EvenNumberDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count=0;
        for(int num: nums){
            if(count(num)%2==0){
                count++;
            }
        }
        return count;
    }

    static int count(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

}
