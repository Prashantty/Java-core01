package mypack;

public class FinallyPrg {

	public static void main(String[] args) {
		try{
			
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			
			System.out.println(a/b);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally Executed");
		}
		System.out.println("normal flow");
	}

}
