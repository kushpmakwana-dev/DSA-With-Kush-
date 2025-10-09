package com.kush;
//import java.lang.StringBuilder;

public class Performance {
    public static void main(String[] args) {
    /*
    - Initially, the string (series) is empty ("").
      When the loop runs, it keeps adding characters one by one using "+".

      Example:
        1st iteration: "" + 'a' → "a"
        2nd iteration: "a" + 'b' → "ab"
        3rd iteration: "ab" + 'c' → "abc"

    - The "+" operator works here because at least one operand is a String.
      When that happens, Java automatically converts the other value
      into a string using the toString() method internally.

    - However, this is not an efficient approach.
      Each time "+" is used, Java creates a new String object
      by copying the old one and adding the new character.
      This leads to extra memory usage and slower performance.

    - A better approach is to use StringBuilder or StringBuffer,
      which can append characters without creating new objects every time.
    */

    String series = "";
    for (int i = 0; i < 26; i++) {
        char ch = (char)('a'+i);
        System.out.println(ch);
        series += ch;
    }
    System.out.println();
    System.out.println(series);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 26; i++) {
        char ch = (char)('a'+ i);

        sb.append(ch);
    }
        System.out.print("This is a stringBuilder approach: ");
        System.out.println(sb);
        System.out.println();

        System.out.print("How to find the reverse using string builder: ");
        System.out.println(sb.reverse());
    }
}
