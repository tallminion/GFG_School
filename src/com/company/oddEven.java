package com.company;
//https://practice.geeksforgeeks.org/problems/odd-or-even3618/0/?category[]=Mathematical&category[]=Mathematical&difficulty[]=-2&page=1&query=category[]Mathematicaldifficulty[]-2page1category[]Mathematical
class oddEven{
    static String oddEven(int N){
        // code here
        String out;
        if(N%2==0){
            out= "even";
        }else{
            out = "odd";
        }
        return out;
    }
}
