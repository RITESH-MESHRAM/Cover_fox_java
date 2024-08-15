package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
//import java.util.LinkedList;

public class LinkedHashSet_Study {

	public static void main(String[] args) {

LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();

lhs.add("India");
lhs.add(111);
lhs.add(98.9f);
lhs.add(true);
lhs.add('R');
lhs.add("Ritesh");
lhs.add("Ritesh");
lhs.add(null);
lhs.add(null);

System.out.println(lhs);
System.out.println(lhs.add("xyz"));
System.out.println(lhs.clone());
System.out.println(lhs.getLast());
System.out.println(lhs.size());
lhs.addLast(50);
lhs.addFirst("hii");
System.out.println(lhs);
//lhs.clear();
//System.out.println(lhs);
// Only these two we use in LinkedHashSet
//1.for each loop
//2.Iterator
System.out.println("================================");
System.out.println("========== for each loop =======");
for(Object r:lhs) {
	System.out.println(r);
}

System.out.println("========== Iterator =========");
Iterator<Object> t=lhs.iterator();
while(t.hasNext()) {
	System.out.println(t.next());
}
System.out.println("===========================");
 }
}
