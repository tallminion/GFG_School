package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum = 0L;
        while(n>0){
            long rem = n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
