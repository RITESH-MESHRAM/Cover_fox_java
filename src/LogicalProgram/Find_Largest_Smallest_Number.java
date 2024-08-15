package LogicalProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class Find_Largest_Smallest_Number {

	public static void main(String[] args) {

		int ar[]= {55,78,32,89,12,6,50,26};
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			ts.add(ar[i]);
		}
		System.out.println(ts+" ");
		System.out.println("==================================");
		ArrayList<Integer> al=new ArrayList<Integer>(ts); //casting is done here
		
		//Smallest Element
		System.out.println(al.get(0));  
		//Largest Element
		System.out.println(al.get(al.size()-1));
		//Find second largest element
		System.out.println(al.get(al.size()-2));
		//Find second smallest element
		System.out.println(al.get(1));	
	}
}
