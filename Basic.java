import java.util.Scanner;
class Basic{
public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a salary");
  double hra,da,grass,basic;
  basic=s.nextDouble();
    da=78*basic/100;
    hra=68*basic/100;
    grass= basic+da+hra;
    if(basic<=10000){
      System.out.println("the basic salary of hra,da:"+hra +da);
    }
    else if(basic<=10000 &&basic >=20000){
      System.out.println("the basic salary of hra,da:"+hra +da);}
     
      else{
      System.out.println("the basic salary of hra,da:"+hra +da);
      }
    }
  }

  
  
