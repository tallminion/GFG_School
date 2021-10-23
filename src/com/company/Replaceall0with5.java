package com.company;

import java.util.Scanner;

public class Replaceall0with5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int now = convertFive(t);
        System.out.println(now);
        }
    static int convertFive(int n){
        int sum = 0;
        int num = 0;
        while(n>0) {
            int rem = n % 10;
            n /= 10;
            if (rem == 0) {
                rem = 5;
            }
            sum = sum * 10 + rem;
        }
        while(sum>0){
            int rem = sum%10;
            sum/=10;
            num = num*10+rem;
        }
        return num;
    }
}