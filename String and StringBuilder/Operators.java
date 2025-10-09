package com.kush;

public class Operators {
    public static void main(String[] args) {
         /*
         "+" Operator in Java works differently depending on the data types:

         1. When used with 'char' values:
            - Each character is converted to its ASCII (numeric) value.
            - Then those numeric values are added together.
            Example: 'a' + 'b' → 97 + 98 = 195

         2. When used with strings (""):
            - The "+" operator joins (concatenates) the strings.
            Example: "a" + "b" → "ab"

         3. When adding a char and a number:
            - The character is converted to its ASCII value first.
            - Then the number is added to it.
            Example: 'a' + 3 → 97 + 3 = 100

         4. You can cast the result back to a char to see the new character:
            Example: (char)('a' + 3) → 'd'

         5. When adding a string and a number:
            - The number is converted to its string form.
            - Then concatenation happens.
            Example: "a" + 3 → "a3"

         6. The "+" operator cannot be used with non-primitive objects
            that do not involve strings.
            Example: new ArrayList<>() + new Integer(56) → ❌ Error
            (Because Java doesn’t know how to “add” or “concatenate” these objects)

         Note:
         - The "+" operator can perform arithmetic (with numbers/chars)
           or concatenation (with strings).
         - It does not automatically combine unrelated object types.
        */

        System.out.println('a' + 'b'); // Ascii value are added

        System.out.println("a" + "b"); // Concatation happens

        System.out.println('a' + 3); // Ascii value of a added with 3

        System.out.println((char)('a' + 3));
        System.out.println("a" + 3); //int will be converted to Integer that will call toString()
        // Internally it is same as after a few steps: "a" + "1".
        // Operator "+" can only be applied to Primitives or one of the value is String
        // We cannot used "+" operator for "new ArrayList<>() + new Integer(56)"
    }
}
