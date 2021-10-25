//package com.company;
//class Solution
//{
//    public int find_median(int[] v)
//    {
//        // Code here
//        int ans;
//        int n = v.length;
//        for(int i = 0; i<n;i++){
//            for(int j=1;j<n;j++){
//                if(v[j-1]>v[j]){
//                    int temp = v[j];
//                    v[j]=v[j-1];
//                    v[j-1]= temp;
//                }
//            }
//        }
//        if(n%2==0){
//            ans =(v[n/2]+v[n/2-1])/2;
//        }else{
//            ans=v[(n)/2];
//        }
//        return ans;
//    }
//}
