/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvertor;

import java.util.Scanner;

/**
 *
 * @author Makro Centurion
 */
public class TempConvertor {

    String temp;/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner text = new Scanner (System.in);
        
         Double Degrees_C = null;
         Double Degrees_F = null;
       
        System.out.println("Please enter K or C");
        String nativeTemp = text.nextLine();
        
        if (nativeTemp == "F" || nativeTemp == "f") {
            Degrees_C = 5*(temp-32)/9;
        }else if (nativeTemp == "C" || nativeTemp == "c"){
            Degrees_F = (9*(temp/5)+32);
        }else{
            System.out.println("You have inserted an invalid letter");
            System.exit(0);
        }
        
        System.out.println("Please enter your temperature.");
        Double temp = text.nextDouble();

        

                System.out.println("Your temperature in Celcius is: " + Degrees_C);
              
                System.out.println("Your temperature in Celcius is: " + Degrees_F);
                
                System.out.println("You have entered an invalid number");
        }
     
    }
    
 