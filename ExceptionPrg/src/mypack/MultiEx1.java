package mypack;

public class MultiEx1 {

	public static void main(String[] args) 
	{
	  try{
		  System.out.println("Hii this is Prashant ");
		  System.out.println(4/0);
	  } catch(ArithmeticException e)
	       {
	    	   System.out.println("Handled");
	       }
       try{
    	   System.out.println("i'm going to Divide");
    	   System.out.println(4/2);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("Divide Error");
       
       }
       try{
    	   int a[]=new int [5];
    	   a[5]=7;
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println("Range out");
       }
	  
       
       System.out.println("Finished");
	  }
		}

