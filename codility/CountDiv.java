class Solution {
    public int solution(int A, int B, int K) {
        
        int offset = A % K ==0?1:0;
        
        return (B/K) - (A/K) + offset;
        
    }
}