import java.util.*;

class Circle { 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter radius = ");
    int r=sc.nextInt();
    double pi=3.14;
    double cir=2*pi*r+1;
    System.out.println("circumferece of circle = "+(int)cir);
    }

}