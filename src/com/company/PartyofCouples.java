package com.company;

import java.util.Scanner;

public class PartyofCouples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        int result = 0;
        for (int i: arr) {
            result = result^i;
        }
        System.out.println(result);
//        int arr[] = {1,2,3,2,1};
//        for(int i:arr){
//            System.out.println(i);
//        }
    }



}
