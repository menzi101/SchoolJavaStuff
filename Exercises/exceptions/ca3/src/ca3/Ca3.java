
package ca3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Menzi Hlope
 * CGMSXBYZ5
 */
public class Ca3 {

    public static void main(String[] args) {
       
      Scanner s = new Scanner(System.in);
      
      double [] myArray = new double[20];
      System.out.println("Enter the elements of the array:");
      double [] maray = new double[20]; 

      for(int i=0; i<20; i++ ) {
         myArray[i] = s.nextInt();
      
         
      }
      for(int j=0; j<20; j++ ) {
            
          maray[j] = myArray[j]-myArray[19];
      
      }
      
              System.out.println(Arrays.toString(myArray));
              System.out.println(Arrays.toString(maray));
    
    }
    
}
