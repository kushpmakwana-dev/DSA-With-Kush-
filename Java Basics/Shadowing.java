package com.kush;

public class Shadowing {
    static int x = 30; // This 'x' is available to everything below this within the scope of Class 'Shadowing'.
    public static void main(String[] args) {
        int x = 10; // x = 39 will be shadowed by x = 10 which means that 'x' scope begins from where it is initialise
        System.out.println(x);
        fun(); // x = 10 will be shadowed by x = 40, higher level is shadowed by what is below
    }

    static void fun(){
       int  x = 40;
        System.out.println(x);
    }
}
