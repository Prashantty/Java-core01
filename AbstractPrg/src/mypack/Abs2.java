package mypack;


abstract  class Ab
{
	{
	System.out.println("i am anonymous block");

}
	public abstract void show();
	   
	public  Ab()
	{
		System.out.println("I am constructor");
	}
	  
	void display()
		{
			System.out.println("I am normal method");
		}


class Abc extends Ab
{
	public void show()
	{
		System.out.println("i am abstract method");
	}
}	

public class Abs2 
 {

	public static void main(String[] args) 
	{
		Abc p= new Abc();
		p.show();
		   p.display();
	}
}



