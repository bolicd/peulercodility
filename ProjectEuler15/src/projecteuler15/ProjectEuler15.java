/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler15;

/**
 *
 * @author drbc
 */
public class ProjectEuler15 {
    
    public static void main(String[] args) {
    int num=3;
    long matrix[][] = new long[num][num];

          for (int i=0;i<num;i++) {
              for (int j=0;j<num;j++) {
               if ((i==0) | (j==0)) {
                   matrix[i][j]=1;
               } else {
                    matrix[i][j]=0;
               }
            }  
          }
          
          for (int i=1;i<num;i++) {
              for (int j=1;j<num;j++) {
                 System.out.print("\n M i:"+i+" j:"+j+" "+matrix[i][j]+" i-1 "+matrix[i-1][j]+" j-1 "+matrix[i][j-1]);
                 matrix[i][j] = matrix[i-1][j] + matrix[i][j-1]; 
              }
              
          }
          System.out.print("\n Mfin "+matrix[2][2]+"\n");
    
           for (int i=0;i<num;i++) {
              for (int j=0;j<num;j++) {
                 System.out.print(matrix[i][j]+" ");
                
              }
              System.out.print("\n");
          }
    }
}

