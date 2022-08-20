package Constructor;

public class test 
{
	int y;
	int z;
//	public int add()
//	{
//		int d=7+5;
//		return d;
//	}
//	public void sub()
//	{
//	    int c=8;
//		y=7-2;
//		System.out.println(y);
//	}
	
	public void display()
	{
		
		System.out.println(y);
//		System.out.println(d);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}
	test()
	{
		int a=6;
		int b=9;
		y=a+b;
		System.out.println(y);
	}
	public static void main(String[] args)
	{
	  test o= new test();
	  System.out.println(o.y);
	      //test o= new test();
	  
//      o.sub();
//	      System.out.println(o.y);
	  
//	      System.out.println(o.add());
//	      System.out.println(o.z); 
	}
}
