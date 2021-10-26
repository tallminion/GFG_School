package com.company;

import java.util.Scanner;

public class PartyofCouples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    break;
                }
            if(j==N){
                System.out.println(arr[i]);
            }
            }
        }
    }



}
