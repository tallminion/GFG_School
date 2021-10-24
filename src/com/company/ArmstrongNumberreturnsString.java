package com.company;
//https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1/?category[]=Mathematical#
import java.util.Scanner;

public class ArmstrongNumberreturnsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNumber(n));
    }
    static String armstrongNumber(int n){
        int num = n;
        int sum = 0;
        String check = null;
        while(num>0) {
            int rem = num % 10;
            int power = (int) Math.pow(rem, 3);
            sum = sum + power;
            num = num / 10;
        }
        if(sum==n){
            check = "Yes";
        } else{
            check = "No";
        }
        return check;
    }
}
