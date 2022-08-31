package mypack;

public class Throw1 {

	public static void main(String[] args) {
		
		int age = Integer.parseInt(args[0]);
		try{
		if ((age <18)&&(age >60))
			throw new ArithmeticException ("Under age ");
		else 
			System.out.println("welcome to vote ");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Normal flow");
	}

}
