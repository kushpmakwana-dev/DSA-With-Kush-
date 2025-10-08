package com.kush;

public class Greet {
    public static void main(String[] args) {
        String name = "Kush Makwana"; // A variable known as name is pointing at the object "Kush Makwana"

        // naam is the variable that will get the copy of "Kush Makwana" and in other words it will point at the same value since copy "Kush Makwana" == Original "Kush Makwana"
        // When "greet" function is applied then naam will start pointing to the new objects i.e. "Sanika Bhatkar"
        // but the original name is not changed it is still pointing to "Kush Makwana"
        // in simple words we are CREATING a new object instead of "CHANGING" it

        // Hence in the case of swapping the values were not swapped

        greet(name);
        System.out.println(name);


    }

    static void greet(String naam){
        naam = "Sanika Bhatkar";
    }
}
