package com.kush;

public class OverLoadingFunction {
    public static void main(String[] args) {
        /*
        OverLoading Functions means
        You can make the two functions using the same names if two different datatype is passed
        */

        // But which Function to run? It is going to look what dataType is passed.. if int is passed then it will run the first one and if it is String it is the 2nd one

        // Note! If nothing is entered then it is the case of ambiguity and it will show and error

        // It also runs for VarArgs as well

        name(2); // Since integer is entered then 1st one will run
        name("Sanika"); // Since String is entered then 2nd one will run
    }

    // if the value passed in both the functions is "int" then it would have thrown an error
    static void name(int x){
        System.out.println(x);
    }

    static void name(String x){
        System.out.println(x);
    }
}
