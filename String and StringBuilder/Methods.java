package com.kush;
import java.util.Arrays;
public class Methods {
    /*
    - toCharArray():
        Converts the string into an array of characters.
        Example: "Kush" → ['K', 'u', 's', 'h']

    - toLowerCase():
        Converts all characters of the string to lowercase.
        It does not change the original string because strings are immutable.
        Instead, it creates and returns a new string in lowercase.

    - strip():
        Removes extra spaces from the beginning and end of the string.
        Example: "  Kush  " → "Kush"

    - split():
        Splits the string into parts based on a given separator (like space).
        Returns an array of strings.
        Example: "Kush Makwana" → ["Kush", "Makwana"]
*/


    public static void main(String[] args) {
        String name = "Kush Makwana";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println("  KUSH SANIKA  ".strip().toLowerCase());
        System.out.println(Arrays.toString(name.split(" ")));


    }
}
