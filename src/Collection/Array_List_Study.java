package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List_Study {

	public static void main(String[] args) {
		
		ArrayList<String> x = new ArrayList<String>();
			x.add("Sujay");
			x.add("Ritesh");
		    x.add("Komal");
		    x.add("Rupali");
		    x.add("velocity");
		    x.add("Engineer");
		    
		    System.out.println(x);
		    System.out.println("=========== For Loop ============");
		    for (int i=0;i<=x.size()-1;i++) {
		    	System.out.println(x.get(i));
		    }
		    System.out.println("========== For each Loop ===========");
            for(String x1:x) {
	        System.out.println(x1);
	        }
            System.out.println("========== Iterator ============");
            Iterator<String> A=x.iterator();
            while(A.hasNext()) {
	        System.out.println(A.next());
            }
            System.out.println("========== List-Iterator ============");
            ListIterator<String> b=x.listIterator();
            while(b.hasNext()) {
            	System.out.println(b.next());
            }
            
	     }
     }
