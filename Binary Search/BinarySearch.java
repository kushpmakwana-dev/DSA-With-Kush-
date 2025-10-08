package com.kush;

public class BinarySearch {
    public static void main(String[] args) {

        /*

        Binary Search
        - Array must be sorted.
        - Find the middle element.
        - compare mid with target element if greater search right else left.
        - if target == mid then return mid.
        - We need binary search because the time complexity in worst case is log(N)

        */

        int[] arr={1, 2, 4, 10, 32, 45, 200, 213, 250, 300, 560};
        int target= 32;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }

            if(target>arr[mid]){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }
}
