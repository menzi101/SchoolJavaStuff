package question5;
/**
 * Menzi Hlope
 * CGMSXBYZ5
 */
public class Question5 {

    public static void main(String[] args) {
        
    int rows = 5;
 
    for (int i= rows-1; i>=0 ; i--)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print("*" + " ");//Print out stars
        }
    System.out.println();// ending line after each row
    }
    
    int row = 7;
    int k, l;  
        for(k = 1; k < row; k++) //outer loop for number of rows(n) 
        {
            for(l=1; l <= k; l++) //  inner loop for columns
            {       
                for (l = 1; l < k; ++l)
                {
                    System.out.print("* "); //Print out stars
                }
            System.out.print("\n");// ending line after each row
            }           
        }
    }
    
}
