package com.kush;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        // Switch inside Switch
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch(empID){
            case 1:
                System.out.println("Sanika Bhatkar");
                break;

            case 2:
                System.out.println("Kush Makwana");
                break;

            case 3:
                System.out.println("EmpID is '3'");
                switch(department){
                    case "IT":
                        System.out.println("Department is IT");
                        break;
                    case "Management":
                        System.out.println("Department is MANAGEMENT");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;

            default:
                System.out.println("Enter the valid Employee ID");
        }
    }
}
