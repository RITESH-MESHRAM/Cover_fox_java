package Collection;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.ListIterator;

public class HashSetStudy {

	public static void main(String[] args) {

		HashSet<Object> hs=new HashSet<Object>();
		
		hs.add("Ritesh");
		hs.add(98);
		hs.add(65.3);
		hs.add(true);
		hs.add(null);
		hs.add(null);
		hs.add("pune");
		hs.add("ritesh");
		hs.add("Ritesh");
		
		System.out.println(hs);
		System.out.println("===============================");
		
		System.out.println(hs.add("India"));
		System.out.println(hs.clone());
		System.out.println(hs.size());
		
		System.out.println("===for each/advance for/dynomic for loop====");
		for(Object h:hs) {
			System.out.println(h);
		}
		System.out.println("=========Iterator==========");
Iterator<Object> it=hs.iterator();
	while(it.hasNext()) {
		
	System.out.println(it.next());
	
	}
		
		
		
	}

}
