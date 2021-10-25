package com.company;
//https://practice.geeksforgeeks.org/problems/sum-of-odd-and-even-elements3033/0/?category[]=Mathematical&category[]=Mathematical&difficulty[]=-2&page=1&query=category[]Mathematicaldifficulty[]-2page1category[]Mathematical
class sumofoddeven
{
    public int[] find_sum(int n)
    {
        // Code here
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1; i<=n; i++){
            if(i%2==0){
                sumEven+=i;
            }else sumOdd+=i;
        }
        return new int[] {sumOdd,sumEven};
    }
}
