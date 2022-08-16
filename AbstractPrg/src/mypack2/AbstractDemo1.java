package mypack2;
abstract class Ab1
{
	static int a=5;
	int b;
	static 
	{
		System.out.println("i am static block ");
	}
	{
		System.out.println("I am anonymous block ");
	}
	public Ab1()
	{
		System.out.println("I am simple constructor");
	}
	public Ab1(int x)
	{
		b=x;
		System.out.println("I am one parametrized constructor "+b);
	}
	public abstract void display();
	public void print()
	{
		System.out.println("I am just a Method ");
	}
	public static void main(String arg)
	{
		System.out.print(arg);
	}
}


public class AbstractDemo1 extends Ab1
{
	public void display()
	{
		System.out.println("I am display of abstract class ");
	}
	public AbstractDemo1()
	{
		super(44);
	}

	public static void main(String[] args) {
		Ab1 x1= new AbstractDemo1();
		
		   x1.display();
		   x1.print();
		   Ab1.main("Prashant");

}
}
