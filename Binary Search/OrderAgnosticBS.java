package com.kush;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={220, 210, 200, 190, 150, 130, 32, 20, 14, 9};
        int[] arr_one={9, 10, 22, 25, 30, 32, 220, 890, 10220, 32110};
        int target= 32;

        if(isAsc(arr)){
            System.out.println(search(arr, target));
        } else{
            System.out.println(searchDes(arr, target));
        }

        if(isAsc(arr_one)){
            System.out.println(search(arr_one, target));
        } else{
            System.out.println(searchDes(arr_one, target));
        }
    }

    static boolean isAsc(int[] arr){
        int start=0;
        int end = arr.length-1;
        if(arr[start]<arr[end]){
            return true;
        }
        return false;
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

    static int searchDes(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }

            if(target<arr[mid]){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }
}
