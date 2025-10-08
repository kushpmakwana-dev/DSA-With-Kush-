package com.kush;

import java.util.ArrayList;
import java.util.List;

public class DisappearedArray {
public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    System.out.println(disappearedNumber(arr));
}

static List<Integer> disappearedNumber(int[] arr){
    int i=0;
    while(i<arr.length){
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr, i, correct);
        } else {
            i++;
        }
    }

    List<Integer> l = new ArrayList<>();
    for (int j = 0; j < arr.length; j++) {
        if(j!=arr[j]-1){
            l.add(j+1);
        }
    }
    return l;
}

static void swap(int[] arr, int firstIndex, int secondIndex){
    int temp = arr[firstIndex];
    arr[firstIndex] = arr[secondIndex];
    arr[secondIndex] = temp;
}

}
