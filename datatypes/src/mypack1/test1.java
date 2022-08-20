package mypack1;

public class test1 
{

    int a=4;
	float f=3.12f;
	
	public void display(float x)
	{
		System.out.println(x);
	}
	public void display2(long x)
	{
		System.out.println(x);
	}

	public static void main(String[] args)
	{
		
		
      test1 obj = new test1();
          obj.display(3.14f);
          obj.display2(344444444444l);
          test1 o = new test1();
          System.out.println(o.a);
         
	}

}
