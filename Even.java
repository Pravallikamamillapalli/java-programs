 import java.util.*;
class Even
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int n, sum=0, rem;
      System.out.println("Enter your Number: ");
      int num=sc.nextInt();
      n=num;
      while(num>0)
      {
        rem=num%10;
        if(rem%2==0)
        {
            sum=sum+rem;
        }
        num=num/10;
     }
    System.out.println("Sum of even digits in "+n+" is "+sum);
  }
}
