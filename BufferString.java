public class BufferString
{
	public static void main(String[] args) 
	{
	   StringBuffer s=new StringBuffer("welcome");
         s.delete(0,4);
          System.out.println(s);
         StringBuffer s1=new StringBuffer("pravallika");
         s1.reverse();
          System.out.println(s1);
        StringBuffer s2=new StringBuffer("mamillapalli");
         s2.append("pravallika");
          System.out.println(s2);
         StringBuffer s3=new StringBuffer("pravallika");
          s3.insert(0,"ammulu");
           System.out.println(s3);
        StringBuffer s4=new StringBuffer("mamillapalli");
           s4.replace(3,5,"pradeep");
          System.out.println(s4);
        
         
    }
    

}