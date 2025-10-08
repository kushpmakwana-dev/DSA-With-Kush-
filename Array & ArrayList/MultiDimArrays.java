package com.kush;
import java.util.Scanner;
import java.util.Arrays;

public class MultiDimArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // arr.length will only print the numbers of row and not no. of the cols


        // Lets try to take the input for 2D array
        for (int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = in.nextInt();
            }
        }

        // Using arr[row].length because in java no. of column is not defined or no. of column is not fixed
        System.out.println();

        // Print the input taken
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                System.out.print(arr[rows][cols] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Print using Arrays.toString()
        for(int rows = 0; rows < arr.length; rows++) {
            System.out.println(Arrays.toString(arr[rows]));
        }

//        System.out.print(Arrays.deepToString(arr));
        }
}
