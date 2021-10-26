package com.company;

import java.util.Scanner;

public class automorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N;
        int count=0;
        while(N>0){
            int rem = N%10;
            count++;
            N/=10;
        }
        System.out.println(count);
        int sq = (int)Math.pow(n,2);
        int div = (int)Math.pow(10,count);
        int rem = sq%div;
        String out = null;
        if(rem==n) {
            out = "Automorphic";
        }
        else {
            out = "Not Automorphic";
        }
        System.out.println(out);
    }
}
