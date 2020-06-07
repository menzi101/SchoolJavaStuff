
package question6;

import javax.swing.JOptionPane;

/**
 * Menzi Hlope
 * CGMSXBYZ5
 */
public class Question6 {

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter first number."));//Getting and converting the string to int
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter second number."));
        int z = x + y;//addition
        JOptionPane.showMessageDialog( null, "The sum is " + z, "Sum of Two Numbers", JOptionPane.INFORMATION_MESSAGE );
    }
    
}
