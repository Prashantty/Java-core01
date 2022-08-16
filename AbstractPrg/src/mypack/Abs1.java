package mypack;

abstract  class Ab1
{
	{
	System.out.println("i am anonymous block");
	}
	public abstract void show();
	   public  Ab1()
	{
		   super();
		System.out.println("I am constructor");
	}
	   void display()
		{
			System.out.println("I am normal method");
		}
}

public  class Abs1 extends Ab1
{
	public void show()
	{
		System.out.println("i am abstract method");
	}
	

	public static void main(String[] args) 
	{
		
		Abs1 p=new Abs1();
		    p.display();
		  p.show();

	}

}
