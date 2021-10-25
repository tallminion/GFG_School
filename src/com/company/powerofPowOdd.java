package com.company;
//https://practice.geeksforgeeks.org/problems/power-of-pow-odd-numbers1103/0/?category[]=Mathematical&category[]=Mathematical&difficulty[]=-2&page=1&query=category[]Mathematicaldifficulty[]-2page1category[]Mathematical
import java.util.Scanner;

public class powerofPowOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum = 0;
        for (long i = 0; i <n ; i++) {
            long odd = 2*i+1;
            sum+=(long)(Math.pow(odd,2));
        }
        System.out.println(sum);
    }
}
