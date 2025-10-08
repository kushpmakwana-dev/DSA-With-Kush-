package com.kush;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        /* Variable Length Arguments :
        - We will use when we don't know how many inputs the "Function" is going to take
        - It can be used for Strings, Int, Chars etc
        */
        fun(1, 3, 4, 5, 6, 66, 67);
        multipleArgs(1, 2, "Kush", "Sanika", "Manjiri", "Rahul", "Raj", "Rachel", "Amul", "Jetha", "Daya");
    }

    static void multipleArgs(int a, int b, String ...v){

        // VarArgs comes at the end means multipleArgs(int a, String ...v, int b)
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
