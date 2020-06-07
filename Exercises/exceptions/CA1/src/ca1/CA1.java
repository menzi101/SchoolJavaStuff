
package ca1;

import java.io.File; 
import java.util.Scanner;
/**
 * Menzi Hlope
 * CGMSXBYZ5    
 */
public class CA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Scanner filer = new Scanner(System.in);
    System.out.println("Please enter name of file.");
    
    String fileName = filer.nextLine();
    
    File myFile = new File(fileName);
    
        System.out.println("Do you want to get rid of the file? y or n");
        String ans = filer.nextLine();
    
        
        switch (ans) {
            case "y":
            case "Y":
                
                if (myFile.delete()) {
                
                    System.out.println("File gone." + myFile.getName());   
                }
            
                break;
            case "n":
            case "N":
                
                System.out.println("File left alone.");    
                
                break;
            default:
                System.out.println("You have entered a bulls*** letter.");;
        }
    
    }
  }