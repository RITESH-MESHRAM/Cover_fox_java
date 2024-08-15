package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {

		LinkedList<Object> L=new LinkedList<Object>();
		L.add("Ritesh");
		L.add(null);
		L.add(123);
		L.add(true);
		L.add("R");
		L.add(15.5f);
		L.add("Bye");
		
		System.out.println(L);
		
		System.out.println(L.getFirst());
		
		System.out.println("========================================");
		
		System.out.println(L);
		System.out.println(L.element());
		System.out.println(L.peek());
		System.out.println(L.pop());
		System.out.println(L);
		System.out.println(L.poll());
		System.out.println(L);
		L.push("Ritesh");
		System.out.println(L);
		L.push("Hello");
		System.out.println(L);
		System.out.println(L.size());
		L.addLast(55);
		System.out.println(L);
		
		System.out.println("=================Traversing through LinkedList=============");
		
		
		System.out.println("==================for loop===============");
		
		for(int i=0;i<=L.size()-1;i++) {
			System.out.println(L.get(i));
		}
		
		System.out.println("=================for each loop==============");
		
		for(Object l:L) {
			System.out.println(l);
		}
			
		System.out.println("=================Iterator==============");
		Iterator<Object> it=L.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("===============List-Iterator==============");
		ListIterator<Object> it1=L.listIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("=============== reverse using while loop ==============");
		while(it1.hasPrevious()) {
			System.out.println(it1.previous());
		}

		System.out.println("=================reverse using for loop==============");
         for(int j=L.size()-1;j>=0;j--) {
        	 System.out.println(L.get(j));
         }
				
	}
}