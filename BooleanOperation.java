/* JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
  public class BooleanOperation {
    
  
  public static void main(String args[]){

                   Scanner s = new Scanner(System.in); 
                   System.out.print("Enter the Value of x as boolean : "); 
                    boolean x=s.nextBoolean(); 
                   System.out.print("Enter the Value of y as boolean : "); 
                    boolean y=s.nextBoolean();
                   System.out.println("x && y is : "+( x && y));
                    System.out.println("x || y is : "+( x || y));
                    System.out.println("!y is : "+(!y));
                   System.out.println("!x is : "+(!x));
                    
    }
  }
