package com.kush;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 44, 51235, 322, 4, 6555, 23, 233, 7222};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
