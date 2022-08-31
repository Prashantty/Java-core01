package mypack;

public class Ex2 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		try{
		System.out.println(a/b);
		}catch(Exception e)
		{
			System.out.println("kya haal hai");
			System.out.println(e);
		}
		System.out.println("Or bata bhai");

	}

}
