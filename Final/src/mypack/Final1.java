package mypack;

class P1
{
	public void display()
	{
		System.out.println("hello i am display ");
	}
    final 	public void print()
	{
		System.out.println("hello i am final method");
	}
}
public class Final1 extends P1 {
    public void display()
    {
    	System.out.println("i am display in class Final1");
    }
    public void print()  //final method cannot be reinitialized 
    {
    	System.out.println("i am print in class Final1");
    }
	public static void main(String[] args) 
	{
		Final1 x1= new Final1();
		       x1.print();
		       x1.display();
		P1  x2 = new P1();
		    x2.display();
		    x2.print();
		     
		
	}

}
