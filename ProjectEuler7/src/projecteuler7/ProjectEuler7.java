
package projecteuler7;

/**
 *
 * @author drbc
 */
public class ProjectEuler7 {
    public static void main(String[] args) {
        boolean stop = false;
        int counter = 0;
        int number = 0;
        do {
            number++;
            if (isPrime(number)) {
                counter++;
                System.out.print("\n Prime:"+number+"Counter "+counter);
                if (counter == 10002) {
                   stop = true;
                } 
            }
        } while (!stop);
        System.out.print(" Prime is: "+ number);
    }
    
    private static boolean isPrime(int number){
        for (int i=2;i<=number-1;i++) {
            if (number % i ==0) {
                return false;
            }
        }
        return true;
    }
}
