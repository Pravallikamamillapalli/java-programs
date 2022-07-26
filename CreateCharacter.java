import java.util.*;
 class CreateCharacter{
     public static void main(String args[]){
         
         Scanner s = new Scanner(System.in);
      System.out.println("First add some characters...");
      char[] a = s.next().toCharArray();
      String s1="";
      System.out.println("Elements = ");
      for (int i = 0; i < a.length; i++)
      {
         System.out.println(a[i]);
         s1=s1+a[i];
   }
   System.out.println(s1);
}
 }
