package com.kush;

public class ComparisionOfString {
    public static void main(String[] args) {
        String a = "Kush";
        String b = "Kush";

        // To check whether a and b are pointing at same object or not we are using == comparators
        System.out.println(a==b); // If they are pointing at same variable it should return "true" and it does
        System.out.println("Because both the Reference variable a and b are pointing on same object that is inside of the pool. Inside the pool same value is not repeated");

        /*
        - "==" Checks whether ref variable is pointing    at the same object

           Soo if a and b are pointing at same object it returns true
            If different variable it is going to return    false
        - if you use new keyword and explicitly tell  java to make new object that time it will create two different objects and that to outside the String Pool

        So,
        String a = "Kush" and String b = "Kush"

        - Kush is inside the pool and a & b are pointing at the same object.

        - if String a = new String("Kush")
             String b = new String("Kush")
          then both are pointing at the different object and both the objects are stored outside the pool
          soo in that case a==b will be false
        */

        String c = new String("Sanika");
        String d = new String("Sanika");

        System.out.println();
        System.out.println(c==d); // Ofc it will return false since both var is pointing at different object
        System.out.println("Because both the Reference variable c and d are pointing on different object that is out of the pool");

        /*Simple Conclusion

            * == ONLY RETURNS TRUE IF both the variable  are pointing towards same object else it   will return false

            * If Explicitly mentioned by using "new" keyword then both are pointing at different object even if they are almost same and will return false and will be out of the string pool

            * When you only need to check values use == method
        */
        System.out.println();
        /*To check the values use .equals()
        - It is a method
        - it compares the value and not where both ref variable are pointing
        */

        String name1 = "Kush";
        String name2 = "Kush";
        String name3 = "Sanika";

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
    }
}
