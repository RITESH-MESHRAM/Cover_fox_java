package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet_Study {

	public static void main(String[] args) {

		TreeSet<String> tr=new TreeSet<String>();
		tr.add("Hello");
		tr.add("Akshay");
		tr.add("ritesh");
		tr.add("Ritesh"); // only take similer type of data 
		tr.add("Ritesh"); //duplicate values are not allow only take single duplicate value.
		//tr.add(null);  //null values not allow
		//tr.add(null); //----->> nullPointerException
		System.out.println(tr);
		tr.add("Pune");
		//tr.addFirst("hii");  //addFirst-sddLast not working here
		
		//System.out.println(tr.ceiling(" "));
		
		System.out.println("=========== Iterator ===========");
		Iterator<String> i=tr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("========== for each / Advance for loop =========");
		for(Object t:tr) {
			System.out.println(t);
		}
		System.out.println("=====================");
	}

}
