
package question9;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Menzi Hlope
 * CGMSXBYZ5
 */

public class Question9 {

    public final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container contentPane) {
        if (RIGHT_TO_LEFT) {
            contentPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        String[] levels = { "Certificate","Level 1", "Level 2", "Level 3" };

//        Any number of rows and 2 columns
        contentPane.setLayout(new GridLayout(0,2));

        contentPane.add(new JLabel("Number"));
        JTextField numberField = (JTextField) contentPane.add(new JTextField(""));
        
        contentPane.add(new JLabel("Name"));
        JTextField nameField = (JTextField) contentPane.add(new JTextField(""));
        
        contentPane.add(new JLabel("Surname"));
        JTextField surnameField = (JTextField) contentPane.add(new JTextField(""));
        
        contentPane.add(new JLabel("Level"));
        
        JComboBox stCombo = (JComboBox) contentPane.add(new JComboBox(levels));
        
       JButton button3 = (JButton) contentPane.add(new JButton("Insert"));
       button3.addActionListener((ActionEvent arg0) -> {
           
           PreparedStatement ps;

        SQLast db = new SQLast();
        Connection con;
        
        try {
            
            con = (Connection) db.getConnection();
            
            String query = "INSERT INTO StudentDetails set stNumber = ?, stName = ?, stSurname = ?, stLevel=?";
            // Query for database
            ps = (PreparedStatement) con.prepareStatement(query);
            // Prepared statements
            String number = numberField.getText();
            String name = surnameField.getText();
            String surname = surnameField.getText();
            String level = stCombo.getSelectedItem().toString();
           
            ps.setString(1, number);
            ps.setString(2, name);
            ps.setString(3, surname);
            ps.setString(4, level);

            int num = ps.executeUpdate();
            if(num >0 )
            JOptionPane.showMessageDialog(null,"The Record was successfully updated.", "Record Successfully Updated", 2);
             //If successfull
            con.close();
            
            
        } catch (SQLException sqle) {
            System.out.println("Error " + sqle);
            
        } catch (ClassNotFoundException cnfe){
            System.out.println("Error " + cnfe);
        } catch (Exception ex) {
            Logger.getLogger(Question9.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        });
        
        contentPane.add(new JLabel(""));
    }
    
        private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(false);

        JFrame frame = new JFrame("Library");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set up the content pane and components in GridLayout
        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
     javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            createAndShowGUI();   // TODO code application logic here
    }
     });}
}
             