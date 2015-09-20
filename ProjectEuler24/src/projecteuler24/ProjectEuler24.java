/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler24;


import java.util.Collections;


public class ProjectEuler24 {
    private static java.util.ArrayList<Long> lList = new java.util.ArrayList<>();
    private static int count=0;
    
    public static void main(String[] args) {
        permute(java.util.Arrays.asList(0,1,2,3,4,5,6,7,8,9), 0);
        System.out.print("\n Permute done. Total permutations :"+lList.size());
        java.util.Collections.sort(lList); // sort the list just in case
        System.out.print("\n "+lList.get(999999));
    }
   
    
    static void permute(java.util.List<Integer> arr, int k) {
        if (count >= 1000001) return;
        if (k==arr.size()-1) {
            lList.add(convertArrToString(arr));
        }
         for(int i = k; i < arr.size(); i++){
            if (i!=k) {
                 Collections.swap(arr, i, k);
            }
             permute(arr,k+1);
             Collections.swap(arr, k, i);
         }
    }
    
    private static long convertArrToString(java.util.List<Integer> arr) {
        // convert to long for sorting
        String t="";
        long ret=0L;
        for (int i=0; i<arr.size();i++) {
            t+=arr.get(i).toString();
        }
        ret = Long.valueOf(t);
        return ret; 
    }
}
