package mypack2;

class A
{
	private static int a;
	private int b;
	
	public A(int x)
	{
		b=x;
	}
	
	static
	{
		a=5;
		System.out.println("A is loaded...");
	}
	
	public void display()
	{
		System.out.println("a of this class is : " + a);
		System.out.println("b of this class is : " + b);
	}
	
	// non-static inner class starts
	public class B
	{
		int c;
		
		public B(int x)
		{
			c=x;
		}
		
		public void display()
		{
			System.out.println("a of outer class is : " + a);
			System.out.println("b of this object is : " + b);
			System.out.println("c of this object is : " + c);
		}
	}
	// non-static inner class ends.
}

public class InnerTestStatic 
{

	public static void main(String[] args) 
	{
		System.out.println("Initiating outer class..");
		A x = new A(10);

		System.out.println("Initiating non-static inner class..");
		A.B y = x.new B(20);

		System.out.println("invoking display() method on outer class object");
		x.display();
		
		System.out.println("invoking display() method on inner class object");
		y.display();		

	}

}
