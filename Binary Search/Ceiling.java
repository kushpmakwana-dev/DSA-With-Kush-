package com.kush;

public class Ceiling{
    public static void main(String[] args) {
        /*
        Ceiling = Smallest element in array greater or equal to target

        Floor = Largest element in array greater or equal to target
        */
        int[] arr = {1, 4, 6, 17, 45, 92, 102, 132, 147, 344, 5002};
        int target = 111;
        int ans=ceiling(arr, target);
        int ans1=floor(arr, target);
        System.out.println(ans);
        System.out.println(ans1);

    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<= end) {
            int mid =  start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }

        return end;
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<= end) {
            int mid =  start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }

        return start;
    }
}
