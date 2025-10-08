package com.kush;

public class StringSearch {
    public static void main(String[] args) {
        String str = "Sanika";
        char target = 'k';
        boolean ans = search(str.trim().toLowerCase(), target);
        System.out.println(ans);
    }

    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
