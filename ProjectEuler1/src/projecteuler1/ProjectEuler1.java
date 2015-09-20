/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler1;

/**
 *
 * @author drbc
 */
public class ProjectEuler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * 
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
        */
        int sum =0;
        for (int i=1; i<1000; i++) {
            if (isMultiple(i,3) | (isMultiple(i,5))) 
            {
                sum+=i;
            }
        }
        
        System.out.print("Sum is: "+sum);
    }
    
    private static boolean isMultiple(int nNumber,int nMultiples) {
        /**
         * determines if given natural number is multiple of current number
         */
        if ((nNumber % nMultiples)==0) {
            // is multiple
            return true;
        } 
        return false;
    }
}
