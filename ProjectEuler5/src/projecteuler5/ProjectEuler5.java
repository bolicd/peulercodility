/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler5;

/**
 *
 * @author drbc
 */
public class ProjectEuler5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int startingNum=1;
        while (!smallestDivisable(startingNum, 20)) {
            startingNum++;
        }
        System.out.print(" \n Smallest "+startingNum);
        
    }
    
    private static boolean smallestDivisable(int number, int divisor) {
        for (int i=1; i<=divisor; i++) {
            if ((number % i)>0) return false;
        }
        return true;
    }
}
