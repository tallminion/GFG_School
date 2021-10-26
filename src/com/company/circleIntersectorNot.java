package com.company;

import java.util.Scanner;

public class circleIntersectorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X1 = in.nextInt();
        int Y1 = in.nextInt();
        int R1 = in.nextInt();
        int X2 = in.nextInt();
        int Y2 = in.nextInt();
        int R2 = in.nextInt();
        int out;
        int x = (int) Math.pow(X2-X1 , 2);
        int y = (int)Math.pow(Y2-Y1 , 2);
        int r = R1+R2;
        int d = (int)Math.sqrt(x+y);
        if(d<=r){
            out = 1;
        } else out = 0;
        System.out.println(out);
    }
}
