package projecteuler3;

import java.util.ArrayList;
import java.util.Iterator;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
* */
public class ProjectEuler3 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Long> listOfFactors;
    public static void main(String[] args) {
        listOfFactors = new ArrayList<>();
        primeFactorization(600851475143L);
        System.out.print("Highest "+ getHighest());
    }
    private static void primeFactorization(long number){
        for (long i=2;i<=number;i++) {
            while (number % i ==0) {
                listOfFactors.add(i);
               System.out.print("\n AAA "+i);
                number /= i;
            }
        }
    }
    
    private static long getHighest(){
        Iterator<Long> iter = listOfFactors.iterator();
        long highest=0;
        long current =0;
        while (iter.hasNext()) {
             current = iter.next();
            if (current>highest) highest =current;
        }
        return current;
    }
}
