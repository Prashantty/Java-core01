package mypack;

public class Ex1 {

	public static void main(String[] args) {
		try{
		int a=Integer.parseInt(args[0]);
		System.out.println("Prashant");
		int b=Integer.parseInt(args[1]);
		System.out.println("22");		
		try{
		System.out.println(a/b);
		}catch(ArithmeticException  x)
		{
			System.out.println(x);
		}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Normal flow");

	}

}
