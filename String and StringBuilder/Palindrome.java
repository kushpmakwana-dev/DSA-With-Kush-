package com.kush;

public class Palindrome {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "ABA";

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }

        if (str.equals(sb.reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
    }
}
