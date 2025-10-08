package com.kush;

public class TypeCasting {
    public static void main(String[] args) {
        /* Type Casting :
        - Condition 1: Source Type should be greater than Destination
        - Condition 2: See from video
        */

        // TypeCasting
        int num = (int)(67.56f);
        System.out.println(num);

        // Automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); // Byte ranges till 256 soo since we are providing the bigger value than it's range then it consider the remainder in our case 257 % 256 = '1'

        /*
        Rules of *TypeCasting*
        - All the Byte Short and Char are promoted to Int
        - If any Operand is Long, Double or Float then everything will be converted to Long, Double or Float respectively
        - Smaller ones are converted into Bigger one
          Bigger (Float) * Smaller (Byte) = Float
        */
    }
}
