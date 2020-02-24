/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package face;

import javax.swing.JApplet;
import java.awt.Graphics;

/**
 *
 * @author Makro Centurion
 */
public class face extends JApplet {
@Override
public void paint(Graphics diagram){
    diagram.drawOval(100, 50, 200, 200);
    diagram.fillOval(155, 100, 10, 20);
    diagram.fillOval(230, 100, 10, 20);
    diagram.drawArc (150, 160, 100, 50, 180, 180);
}
}
