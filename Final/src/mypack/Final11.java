package mypack;

final class P2
{
	public void display()
	{
		System.out.println("hy this is display method  in class P1");
	}
	
	 public void print()
	
	{
		System.out.println("hyy this print method in class P1");
	}
}

public class Final11 
{

	public void display()
	{
		System.out.println("hy this is display method in class Final11");
	}
	public void print()
	{
		System.out.println("hyy this is print method in class Final11");
	}

	public static void main(String[] args) 
	{
	P2 x2= new P2();
	      x2.display();
	      x2.print();
	      
	   
	}

}
