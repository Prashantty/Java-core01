package mypack1;
class A 
{
	int a;
	
	public A(int x)
	{
		a=x;
	}
	public void display()
	{
		System.out.println("a = " + a);
	}	
}


class AB
{
	A a;
	int b;
	
	public AB(int x, int y)
	{
		a=new A(x);
		b=y;
	}
	
	public void display()
	{
		a.display();
		System.out.println("b = " + b);
	}
	
}


public class HasATest {

	

}
