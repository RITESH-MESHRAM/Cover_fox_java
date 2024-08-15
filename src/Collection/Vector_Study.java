package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) {

		Vector<Object> v =new Vector<Object>();
		v.add("Ritesh");
		v.add("Nagpur");
		v.add('M');
		v.add(99.99f);
		v.add(true);
		v.add(null);
		v.add(100);
		v.add("Velocity_Pune");
		
		System.out.println(v);
		System.out.println("_________________________________________________");
		System.out.println("********** Traversing through vector **********");

		System.out.println("========== for loop ========");

		for (int i=0;i<=v.size()-1;i++) {
			System.out.println(v.elementAt(i));
		}
		System.out.println("========= for each loop =========");
		for(Object r:v) {
			System.out.println(r);
		}
		System.out.println("============ Iterator ==========");
		 Iterator<Object> it = v.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
			System.out.println("========== List Iterator ========");
			ListIterator<Object> it1=v.listIterator();
			
				while(it1.hasNext()) {
				System.out.println(it1.next());
			}
				System.out.println("========= Enuemeration =========");
				
				Enumeration<Object> en=v.elements();
				
				while(en.hasMoreElements())
				{
					System.out.println(en.nextElement());
				}
				

			}
	
}

