package com.kush;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int numa = 3;
        int numb = 4;
       swap(numa, numb);
        System.out.println(numa + " " + numb); // Swap will not happen because the explanation is given in greet file
    }

    static void swap(int numa, int numb){
        int temp = numa;
        numa = numb;
        numb = temp;
//        System.out.println(numa + " " + numb);
    }
}
