package com.kush;
import java.util.Arrays;
public class Array2d {
    public static void main(String[] args) {
        int[][] arr = {
                {91, 22, 4, 523},
                {12, 6, 3, 621},
                {6, 34, 33, 90}
        };
        int target=34;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int[] search(int[][] arr, int target){
//        int[] ans = new int[2];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }

    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
}
