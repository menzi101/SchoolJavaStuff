/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruity;

import javax.swing.JOptionPane;
/**
 *
 * @author Makro Centurion
 */
public class Fruity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String appleString = JOptionPane.showInputDialog(null, "Enter number of apples");
      
      int appleCount = Integer.parseInt(appleString);
      String orangeString = JOptionPane.showInputDialog(null, "Enter number of apples");
      int orangeCount = Integer.parseInt(orangeString);
      int totalFruitCount = appleCount + orangeCount;
      JOptionPane.showMessageDialog(null, "The total number of fruits = " + totalFruitCount);
      System.exit(0);
    }
    
}
