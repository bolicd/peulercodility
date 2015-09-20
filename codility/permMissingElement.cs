using System;
// you can also use other imports, for example:
// using System.Collections.Generic;

// you can write to stdout for debugging purposes, e.g.
// Console.WriteLine("this is a debug message");

class Solution {
    public int solution(int[] A) {
       int tSum = 0;
       int aSum = 0;
       int n = A.Length;
       int mElement = 1;
       
       if (n>=1){
           for (int i=1;i<n+2;i++){
               tSum+=i;
           }
           
           for (int i=0;i<n;i++){
               aSum+=A[i];
           }
           
           
           
           mElement = tSum - aSum;
       }
       
       return mElement;
    }
}