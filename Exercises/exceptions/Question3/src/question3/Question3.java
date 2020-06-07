
package question3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *  Menzi Hlope
 *  CGMSXBYZ5
 */

class MyForm extends JFrame implements ActionListener{

    static JTextField t; //Textbox 
    static JFrame f;  // JFrame
    static JButton b; //JButton
    static JLabel l; //JLabel
    
    MyForm(){}

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        
        
        if (s.equals("submit")) {
            String enteredText = t.getText();//Saving to string for JOptionPane.
            if (t.getText().equals(" ")) {// If user enters nothing at all.
                JOptionPane.showMessageDialog(null, "You have entered null value. Please enter something.");
            }else {
            l.setText(t.getText());//Get the label to be equals the entered text.
            t.setText(" ");
            
            JOptionPane.showMessageDialog(null, enteredText);// Value of Textbox displayed on JOptionPane.
            }
        }
    }
    
     
public static class Question3 {
    
    public static void main(String[] args) {
        f = new JFrame("Textbox"); // Frame to store text field and button 
        
        l = new JLabel("Entered text will display here.");
            
        b = new JButton("submit");// create a new button  
  
        MyForm te = new MyForm(); // create a object of the text class
  
        b.addActionListener(te);  // addActionListener to button 
  
        t = new JTextField("Please enter text here.", 16); // create a panel to add buttons and textfield 
      
        JPanel p = new JPanel(); // create a panel to add buttons and textfield 
        
        // add buttons and textfield to panel 
        p.add(t); 
        p.add(b); 
        p.add(l); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(300, 300); 
  
        f.setVisible(true); 
      
    }
    
}
}