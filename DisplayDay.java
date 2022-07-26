                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
 import java.util.Scanner;

public class DisplayDay {
  public static void main(String a[])
  {
    
  

//declare number variable

//Use the scanner class to provide input at execution time using scanner object
Scanner sc= new Scanner(System.in);



//Take input of the number for displaying day
System.out.print("Enter value for displaying day:");
int number=sc.nextInt();
switch(number){
  case 1:
    System.out.println("monday");
    break;
  case 2:
    System.out.println("tuesday");
    break;
  case 3:
    System.out.println("wednesday");
    break;
  case 4:
    System.out.println("thursday");
    break;
  case 5:
    System.out.println("friday");
    break;
  case 6:
    System.out.println("saturday");
    break;
  case 7:
    System.out.println("sunday");
    break;
}

//Declare switch case and check the input value to print the day entered by the user
    }
}