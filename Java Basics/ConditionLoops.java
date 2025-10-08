package com.kush;

public class ConditionLoops {
    public static void main(String[] args) {
        int salary = 25400;
        System.out.println("Previous Salary - " + salary);

        // if the condition is "true" doo this
        // else if - use for multiple "condition"
        // else - if no condition is true then doo this thing
        if(salary>10000){
            salary += 2000;
        } else if (salary>20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println("After Salary - " + salary);
    }
}
