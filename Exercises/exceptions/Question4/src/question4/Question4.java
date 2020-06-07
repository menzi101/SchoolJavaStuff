
package question4;

import java.util.Scanner;

/**
 * Menzi Hlope
 * CGMSXBYZ5
 */
public class Question4 {

    public static void main(String[] args) {
        
        Scanner kilo = new Scanner(System.in);
 
        System.out.println("Please enter number of days renting travelled.");
        double days = kilo.nextDouble();
        System.out.println("Please enter Kilomter travelled.");
        double km = kilo.nextDouble();
        
        double rent = 250 * days;
        
        if (km < 60) {
            double cpd = (rent*0.03 + rent);
            System.out.println(cpd);
        }else if (km > 350) {
            double cpd = rent*-0.09 + rent;
            System.out.println(cpd);
        }else   {
            double cpd = rent;
            System.out.println(cpd);
        }
        
    }
    
}
