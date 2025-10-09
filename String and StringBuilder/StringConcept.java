package com.kush;

public class StringConcept {
    /*
    - Internal Working:
    -> String is most commonly use
    -> Everything starting with Caps is a class hence String is class
    ->  When I say

            *String name = "Kush Makwana"*

            String -> DataType.
            name -> Reference Variable.
            "Kush Makwana" -> Object.

    -> All the Object of Class string is stored in String Pool & it is Different Memory Structure inside the Heap Memory.
    ->  So if
        String a = Kush
        String b = Kush
        So in pool both are pointing at same object then it is not going to make two different object because it already exist in pool
    -> String a = "Kush"
    -> a = Sanika
    Sanika is not changed it is a new object created

    -> Strings are immutable because of securities reason
    */
    public static void main(String[] args) {
        String name = "Sanika Bhatkar ✨"; // name pointing at Sanika Bhatkar
        System.out.println(name);

        name = "Kush Makwana"; // Sanika Bhatkar is not changed to Kush Makwana, a new object Kush Makwana is created and variable name is pointing at Kush Makwana now, and Sanika Bhatkar object is then stored to garbage
        System.out.println(name);
    }
}
