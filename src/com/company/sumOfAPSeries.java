package com.company;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/sum-of-ap-series4512/1/?category[]=Mathematical&category[]=Mathematical&difficulty[]=-2&page=2&query=category[]Mathematicaldifficulty[]-2page2category[]Mathematical
public class sumOfAPSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();
        long sum = 0;
        for(int i=0;i<n;i++) {
            sum = sum + a;
            a=a+d;
        }
        System.out.println(sum);
    }
}
