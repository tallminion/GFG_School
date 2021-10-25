package com.company;
//https://practice.geeksforgeeks.org/problems/floyds-triangle1222/0/?category[]=Mathematical&category[]=Mathematical&difficulty[]=-2&page=1&query=category[]Mathematicaldifficulty[]-2page1category[]Mathematical
public class floydTriangle {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(k+++" ");

            }
            System.out.println("");
        }
    }
}
