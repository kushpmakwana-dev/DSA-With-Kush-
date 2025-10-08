package com.kush;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        // Array list when I want to enter as many number as I want and. it will never get full

        // Here the <Integer> is not a Primitive but a "wrapper class"
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(122);
//        list.add(112);
//        list.add(11211);
//        list.add(11212221);
//        list.add(112122322);
//        list.add(112122222);
//
//        System.out.println(list);
//        System.out.println(list.contains(121));

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
