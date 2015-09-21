class Solution {
    public int solution(int X, int[] A) {
        int n = A.length;
        int[] pos = new int[n];
       
        for (int i=0;i<pos.length;i++){
            pos[i]=0;
        }
        
        pos[0]=1;
        
        for (int i=0;i<n;i++) {
            pos[A[i]]+=1;
            if (coveredPositions(X,pos)) {
                return i;
            }
        }
        
        return -1;
    }
    
    private boolean coveredPositions(int x,int[] c) {
        for (int i=x;i>0;i--) {
            if (c[i]==0) return false;
        } 
        
        return true;
    }
}