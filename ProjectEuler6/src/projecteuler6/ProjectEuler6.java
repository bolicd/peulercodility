/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler6;

/**
 *
 * @author drbc
 */
public class ProjectEuler6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inputNumber=100;
       System.out.print("\n"+sumOfSquares(inputNumber)); 
       System.out.print("\n"+squareSum(inputNumber)); 
       System.out.print("\n Difference"+(squareSum(inputNumber)-sumOfSquares(inputNumber)));
    }
    
    private static long sumOfSquares(int number) {
        long sum = 0;
        for (int i=0;i<=number;i++) {
            sum+=Math.pow(i, 2);
        }
        return sum;
    }
    
    private static long squareSum(int number) {
       long sum=0;
       for (int i=0;i<=number;i++) {
            sum+=i;
        }
        return (long) Math.pow(sum, 2);
    }
}
