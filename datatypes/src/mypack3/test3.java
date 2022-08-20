package mypack3;

public class test3 {
	
	static  void min(int a[])
	{
	for(int i=0;i<a.length;i++)
	{
		System.out.println("our total elements in the array is :::"+a[i]);
	}
	}

	public static void main(String[] args) {
      int[] a={1,2,3,45,5};
      min(a);
      min(new int[]{2,3,45,6,5});
	}

}
