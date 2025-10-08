package com.kush;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {1, 22, 34, 54, 677, 22, 43, 22, 56, 223};
        System.out.println(arr[6]);
        int target = 43;
        int ans = search(arr, target, 3, 8);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end) {
        if(arr.length==0){
            return -1;
        }

        for (int i = start; i <= end ; i++) {
            if(target==arr[i]){
                return i;
            }
        }

        return -1;
    }
}
