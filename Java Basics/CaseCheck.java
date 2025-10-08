package com.kush;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        // next() -> Take String as an input
        // .trim() -> remove extra spaces
        // .charAt(i) -> Character ith position

        if(ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        } else if(ch>='A' && ch<='Z') {
            System.out.println("Upper Case");
        } else {
            System.out.println("It is a Symbols or Numbers");
        }
    }
}
