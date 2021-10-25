package com.company;
//https://practice.geeksforgeeks.org/problems/area-of-rectange-right-angled-triangle-and-circle2600/0/?category[]=Mathematical&category[]=Mathematical&difficulty[]=-2&page=1&query=category[]Mathematicaldifficulty[]-2page1category[]Mathematical
class Solution {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code here
        int A1= L*W;
        int A2 = (int)(0.5*B*H);
        int A3= (int)(3.14*R*R);
        return new int[] {A1, A2, A3};
    }
}

