import java.util.*;
class  Base
  {
    public static void main(String args[])
    {
      int e,b;
      long r=1;
      Scanner s= new Scanner(System.in);
      System.out.println("enter b value");
      b=s.nextInt();
       System.out.println("enter e value");
      e=s.nextInt();
      for(;e!=0;--e)
        {
          r=r*b;
          System.out.println(r);
        }
    }
        }
