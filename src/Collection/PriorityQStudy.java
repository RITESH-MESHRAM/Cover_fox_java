package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQStudy{

	public static void main(String[] args) {

		PriorityQueue<String> pq=new PriorityQueue<String>();	
		pq.add("Nagpur");
		pq.add("Ritesh");
		pq.add("Ritesh");
		//pq.add(null);
		pq.add("Pune");
		pq.add("Bunty");
		
		System.out.println(pq);
		System.out.println(pq.add("hii"));
		System.out.println(pq.peek());
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		System.out.println(pq.element()); //first element study
	
		System.out.println("==============Iterator==============");
		Iterator<String> t=pq.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		System.out.println("==============for each===============");
	for(String p:pq) {
		System.out.println(p);
	}
	/*System.out.println("==============forloop================");
	for(int i=0;i<=6;i++) {
		System.out.println(pq);
		}*/
	
	}

}