package mypack;

public class Ex3 {

	public static void main(String[] args) {
		int c=100;
		try
		{
			int i ,sum;
			
			sum=10;
			for(i=1;i<3;++i)
		      sum= (sum/i);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("an arirhmetic error ");
			
			System.out.println(sum);
		
		}
        System.out.println(c);
	}

}
