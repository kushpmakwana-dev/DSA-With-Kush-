package com.kush;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {21, 22, 34, 54, 677, 22, 2, 43, 22, 56, 223};
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr){
        if(arr.length==0){
            return -1;
        }

        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
