package com.kush;

public class OrderAgnosticRefined {
    public static void main(String[] args) {
        int[] arr={220, 210, 200, 190, 150, 130, 32, 20, 14, 9};
        int target= 32;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            } else {
                if(target<arr[mid]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
