package com.kush;

public class Arrays {
    public static void main(String[] args) {
        /*
         Why we need Arrays?
         - Multiple values can be stored under the single variable
         - Arrays are collections of values of single data type
        */

        // Syntax : int[] rnos = new int[5]
        // or int[] rnos = {1, 2, 4, 5}

        /*
        - datatype[]: what datatype can be stored in an array, you cannot store any value of other datatype

        if arr = {1, "Sanika", true, 1.50} -> This Array can never exist because there are multiple datatype

        arr = {"Kush", "Sanika"}
        arr = {1, 2, 3, 4, 6}
        arr = {1.02, 3.54, 5.0, 5.6}

        - new keyword is used to create an "Object" in heap memory
        */

        int[] arr; // Declaration of array, Reference Variable is defined in stack

        arr = new int[5]; // Initialisation, actually here object is created in the heap memory

        System.out.println(arr[4]); // it will print "0" if the arr was of String it would have shown "null" when array is not mentioned

    }
}
