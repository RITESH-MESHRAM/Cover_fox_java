package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Study1 {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(29);
		t.add(66);
		t.add(23);
		t.add(98);
		t.add(26);
		System.out.println(t);
		
	    System.out.println(t.ceiling(23));
	    System.out.println(t.ceiling(25));
	    System.out.println(t.floor(36));
		System.out.println(t.higher(26));
		System.out.println(t.lower(26));
		System.out.println(t.isEmpty());
		System.out.println(t.size());
		System.out.println(t.clone());
		System.out.println(t.pollFirst());
		System.out.println(t);
		
		System.out.println("==============Iterator=============");
		Iterator<Integer> it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			System.out.println("=========== for each ==========");
			for(Integer t1:t) {
				System.out.println(t1);
			}
			System.out.println("================================");
		}
    }
}
