package mypack;
import java.io.IOException;

public class ThrowsAndThrow {
   void m()throws IOException
   {
	   throw new IOException("device error");
   }
   void n()throws IOException 
   {
	   m();
   }
   void p()
   {
	   try{
		   n();
	   }catch(Exception e)
	   {
		   System.out.println("exception handled ");
	   }
   }
   
	public static void main(String[] args) {
		
		ThrowsAndThrow o1=new ThrowsAndThrow ();
		o1.p();
		System.out.println("normal flow");
	}

}
