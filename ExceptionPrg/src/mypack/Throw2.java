package mypack;

public class Throw2 {
	public static int divide(int x, int y)
	{
		try{
			return(x/y);
		}catch(ArithmeticException e)
		{
			System.out.println("rethrowing Exception");
			//return 5;
			throw(e);
		}
		//return 6;
	}

	public static void main(String[] args) {
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Throw2.divide(a,b);
			System.out.println("division is"+c);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
