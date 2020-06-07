/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remainder3;

import java.util.Scanner;

/**
 *
 * @author Makro Centurion
 */
public class Remainder3 {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);    
        
        System.out.println("Please insert first number");
        int first = keyboard.nextInt();
        
        System.out.println("Please insert second number");
        int second = keyboard.nextInt();
        
        try {
            
            if (second == 0) {
                throw new Exception("Denominator cannot be zero.");
            }
            
        } catch (Exception e) {
        }
    }
    
}
