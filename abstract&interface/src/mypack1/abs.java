package mypack1;

abstract class main
{
	int a=4;
	int b=5;
	abstract void add();
	public void display()
	{
		
	  System.out.println("\n Our number is:::"+(a+b));
	}
}
public class abs  extends main
{
     void add()
     {
    	 int y=6;
    	 int t=4;
    	 int r=y+t;
    	 System.out.println(r);
    	 
     }
	public static void main(String[] args) {
	    main obj= new abs();
		  obj.add();
		  obj.display();
		  

	}
	

}
