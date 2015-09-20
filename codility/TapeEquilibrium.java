class Solution {
    public int solution(int[] A) {
        

        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        int diff = 0;
        int min = -1;
        
        int size = A.length;
        
        if (size>0) {
            for(int i=0;i<size;i++){
                totalSum+= A[i];
            }
            
            for (int i=0;i<size-1;i++) {
                leftSum+= A[i];
                rightSum= totalSum - leftSum;
                diff = Math.abs(leftSum - rightSum);
              
                if (i == 0) {
                    min = diff;
                } else {
                    if (diff < min) 
                    {
                        min = diff;
                    }
                }
                
            }
           
        }
        
        return min;
    }
}