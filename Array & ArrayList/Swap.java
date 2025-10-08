package com.kush;
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 4, 5, 3, 5, 5};
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] num, int index1,int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2]= temp;
    }
}
