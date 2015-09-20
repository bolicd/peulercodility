/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler10;
public class ProjectEuler10 {
    static long sum =2;
    public static void main(String[] args) {
        for (int i=2;i<2000000;i++) {
            if (isPrime(i)) 
            {
                sum+=i;
                System.out.print("\n Is Prime: "+i+" Sum "+sum);
            }
        }
        
        System.out.print("\n Sum "+sum);
    }
    
   private static boolean isPrime(int number){
        if (number%2==0) return false;
    //if not, then just check the odds
    for(int i=3;i*i<=number;i+=2) {
        if(number%i==0)
            return false;
    }
    return true;
    }
}
