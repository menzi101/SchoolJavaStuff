
package ifexercise;

import java.util.Scanner;

/**
 * Menzi Hlope
 * CGMSXBYZ5
 */
public class IfExercise {

      public static final double MIN_SALARY = 100;
      public static final double MIN_BONUS = 200;
        
    public static void main(String[] args) {
        
        System.out.println("Enter Salary");
        Scanner keyboard = new Scanner(System.in);
        double salary = keyboard.nextDouble();
        
        System.out.println("Enter Bonus");
        
        double bonus = keyboard.nextDouble();
        
        
        if (MIN_SALARY < salary || salary == MIN_SALARY || bonus >=MIN_BONUS ) {
            System.out.println("OK");
        } else
            System.out.println("Too low");
        }
    }
    
