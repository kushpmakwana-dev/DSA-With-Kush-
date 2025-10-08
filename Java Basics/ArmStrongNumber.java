package com.kush;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 1534;

        boolean ans = armStrong(n);
        System.out.println(ans);
    }

    static boolean armStrong(int n){
        int original = n;
        int sum=0;
        while(n > 0){
            int rem = n%10;
            n/=10;
            sum=sum+rem*rem*rem;

        }

        return sum == original;
    }
}
