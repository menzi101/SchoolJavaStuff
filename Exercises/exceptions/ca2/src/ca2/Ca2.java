
package ca2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Menzi Hlope
 * CGMSXBYZ5
 */
public class Ca2 {

    public static void main(String[] args) {
        PrintWriter textStream = null;
        try {
            textStream = new PrintWriter(new File("C:\\Users\\Makro Centurion\\OneDrive - Pearson Institute of Higher Education\\ITJA211\\Exercises\\exceptions\\ca2\\src\\ca2\\pearson.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ca2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scanner wrds = new Scanner (System.in);
        System.out.println("What would you like to type?");
        String tex = wrds.nextLine();
        
        textStream.write(tex);
        textStream.flush();
        textStream.close();
        System.out.println("Successfully wrote to the file.");
  }
}
    

