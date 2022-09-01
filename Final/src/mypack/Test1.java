package mypack;

public class Test1 {

	public static void main(String[] args) {
		final int a=6;

		a=2;   // final datamember cannot be reinitialized 
		System.out.println(a);
	
	}

}
