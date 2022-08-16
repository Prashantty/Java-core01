package mypack;

abstract class Abst1
{
	 static int b=5;
	  int c;
	  static
	  {
		  System.out.println("static block of Ab1");
	  }
	  {
		  System.out.println("anonymous block of Ab1");
	  }
	  public Abst1()
	  {
		  System.out.println("Default of Ab1");
	  }
	  public Abst1(int x)
	  {
		  c=x;
		  System.out.println("One paramterize Ab1");
	  }
	  public abstract void display();
		public void print()
		{
			System.out.println("hello");
		}
		public static void main(String arg)
		{
			System.out.println(arg);
		}
	}

public class AbstractDemo1 extends Abst1
{
	public void display()
	 {
		 System.out.println("hiiii");
		 
	 }
	 
	public AbstractDemo1()
	{
		System.out.println("default of AbstractDemo1");
	}
	public AbstractDemo1(int x)
	{
		super(44);
	}

	public static void main(String[] args)
	{
		Abst1 x1=new AbstractDemo1();
		Abst1 x2=new AbstractDemo1(44);
		    x1.display();
		     x1.print();
		     Abst1.main("india");

	}
		


}
