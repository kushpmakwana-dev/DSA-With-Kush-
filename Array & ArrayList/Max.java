package com.kush;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 44, 51235, 322, 4, 6555, 23, 233, 7222};
        int ans = max(arr);
        System.out.println(ans);

    }

    static int max(int[] arr){
        int max=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
