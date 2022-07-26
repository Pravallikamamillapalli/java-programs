//JFM1T3_Assignment2:

 import java.util.*;

public class Percentage {
  public static void main(String args[])
  {


Scanner sc = new Scanner(System.in);
System.out.print("Enter the total marks :");
double t= sc.nextInt();
System.out.print("Enter maximum marks possible :"); 
double m=sc.nextInt(); 
double p=(m/t)*100;

System.out.println("your percentage is= "+(int)p);

    }

}