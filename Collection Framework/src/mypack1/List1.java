package mypack1;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		       obj.add("Prashnat");
		       obj.add("Aman");
		       System.out.println(obj);
	   List<Integer> obj1= new ArrayList();
	            obj1.add(1);
	            obj1.add(5);
	            System.out.println(obj1);
	            obj1.add(9);
	            System.out.println(obj1);
	            obj1.add(1,4);
	            obj1.set(3, 34);
	       System.out.println(obj1);
	       
	       List<Integer> obj2 =new ArrayList();
	               obj2.add(232);
	               obj2.add(434);
	               
	          
	               obj1.addAll(obj2);
	               System.out.println(obj1);
	       System.out.println(obj1.get(5));
	       
	       for(int i=0;i<obj1.size();i++)
	       {
	    	   System.out.println("\n Our all elements in the lists are:::"+obj1.get(i));
	       }
	}

	

	}
