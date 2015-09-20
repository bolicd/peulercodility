/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteutler4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author drbc
 */
public class ProjectEutler4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // even
        ArrayList<Long> list = new ArrayList<Long>();
        long product=0;
        for (int i=100; i<1000;i++) {
            for (int j=100;j<1000;j++) {
                 System.out.print("\n I :"+i+" J: "+j);
                 product = i*j;
                 if (isPalindromic(product)) {
                     list.add(product);
                 }
            }
        }
        System.out.print(" ----- DONE ------ ");
        System.out.print("\n Last one: "+list.get(list.size()-1));
        long largest = Collections.max(list);
        System.out.print("\n Largest in list: "+largest);
    }
    
    private static boolean isPalindromic(long num){
        String tmp = String.valueOf(num);
        char[] tmpChar = tmp.toCharArray();
        char[] tmpChar2 = new char[tmpChar.length];
        int j=0;
        for (int i=tmpChar.length-1; i>= 0; i--) {
            tmpChar2[j]=tmpChar[i];
            j++;
        }
        String s1 = String.valueOf(tmpChar);
        String s2 = String.valueOf(tmpChar2);
        if (s1.compareTo(s2)==0) {
            return true;
        }
        return false;
    }
}
