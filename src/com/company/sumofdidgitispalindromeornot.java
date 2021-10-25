package com.company;

import java.util.Scanner;

public class sumofdidgitispalindromeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        int sum = 0;
//        int out;
        while(N>0){
            int rem = N%10;
            N/=10;
            sum+=rem;
        }
        int temp = sum;
        while(temp>0){
            int nrem = temp%10;
            temp/=10;
            num = num*10+nrem;
        }
        System.out.println(num);
        if(num==sum){
            System.out.println("palindrome");
        } else System.out.println("not palindrome");
    }
}
