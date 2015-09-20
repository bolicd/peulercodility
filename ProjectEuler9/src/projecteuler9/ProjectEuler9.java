/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author drbc
 */
public class ProjectEuler9 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Triplet> list;
    public static void main(String[] args) {
        list = new ArrayList<>();
        generateTriplet(20,19);
        
        Iterator<Triplet> iter = list.iterator();
        while (iter.hasNext()) {
            Triplet current = iter.next();
            System.out.print(" \n A "+current.a+ " B "+ current.b + " C: "+current.c+ " Sum " +current.sum);
        }
    }
    
    private static void generateTriplet(int m, int n) {
         int sum = 0;
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++) {
                if (i>j) {
                    Triplet t = new Triplet();
                    t.a = i*i-j*j;
                    t.b = 2*i*j;
                    t.c = i*i+j*j;
                    sum = t.a + t.b + t.c;
                    t.sum = sum;
                    list.add(t);
                }
            }
        }
    }
    
}

class Triplet{
    public int a;
    public int b;
    public int c;
    public int sum;
    
    public Triplet(){
        a = 0;
        b = 0;
        c = 0;
    }
}
