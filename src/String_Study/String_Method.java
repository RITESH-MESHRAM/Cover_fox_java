package String_Study;

public class String_Method {

	private static final String TY = null;

	public static void main(String[] args) {
		
		String s="pune";
		
		//1. length();
		
		System.out.println(s.length());
		int StringLenght = s.length();
		System.out.println(StringLenght);
		System.out.println("=======================");

		// 2. toUpperCase();		
		 String name ="Ritesh";
		 System.out.println(name.toUpperCase());
		String Upper = name.toUpperCase();
		System.out.println("========================");
		
		//3. toLower();
		//without using new 
		String Name="Akshay";
		System.out.println(Name.toLowerCase());
		String LowerCase = Name.toLowerCase();
		System.out.println("========================");
		
		//4. without using new keyword--> constant pool area
		String s1="velocity";
		String s2="velocity";
		String s3="vel";
		String s4="Test";
		
		// using new keyword--> non-constant pool area
		String m= new String("velocity");
		String m1= new String("velocity");
		String m2= new String("VELOCITY");
		String m3= new String("");
		String m4= new String("Java Classes");
		
		System.out.println(s1==s2);    // (==) use to indicate memory location
		System.out.println(s3==m1);
		System.out.println(s2==m2);
		System.out.println(s1.equals(m1));  // equals use to indicate cantains of the Shring
		System.out.println(m3.length());
		System.out.println(m4.equalsIgnoreCase(s4));
		System.out.println(m.equalsIgnoreCase(s2));
		System.out.println("==========================");
		System.out.println(m4.charAt(5)); //only single char taking
		
		System.out.println("========================");
		System.out.println(m2.endsWith("TY"));
		System.out.println("========================");
		
		// contains()
		String d1="Engineering";
		System.out.println(d1.contains("n"));
		System.out.println(d1.contains("Eng"));
		boolean D = d1.contains("ring");
		System.out.println(D);
		System.out.println("=====================");
		
		// isEmpty()
       
		String e1="Testing";
		String e2=null;
		String e3="";
		String e4="    ";
		String e5="           r          ";
		System.out.println(e1.isEmpty());
		//System.out.println(e2.isEmpty()); //  java.lang.NullPointerException:
		System.out.println(e3.isEmpty());
		System.out.println(e4.isEmpty());
		System.out.println("=====================");
		
		// isBlank()
          
		System.out.println(e1.isBlank());
		System.out.println(e3.isBlank());
		System.out.println(e4.isBlank());
		System.out.println(e5.isBlank());
		System.out.println("============================");
		
		// charAt()
		
		String w="Ritesh Meshram";
		System.out.println(w.charAt(0));
		//System.out.println(w.charAt(14)); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 14 out of bounds for length 14
		System.out.println(w.charAt(8));
		// System.out.println(w.charAt(-1)); //Index -1 out of bounds for length 14
		System.out.println("===========================");
		
		// endsWhith()
		
		String x="Engineering";
		System.out.println(x.endsWith("g"));
		System.out.println(x.endsWith("ng"));
		System.out.println(x.endsWith("r"));
		System.out.println(x.endsWith("neering"));
		System.out.println("============================");
		
		// startsWith()
		String h="QA Engineer";
		System.out.println(h.startsWith("QA"));
		System.out.println(h.startsWith("Eng"));
		System.out.println("============================");
		
      // object.substring()
		
		String j="Engineering";
		System.out.println(j.substring(6));
		System.out.println(j.substring(9));
		System.out.println(j.substring(10));
		System.out.println(j.substring(3, 8));
		System.out.println(j.substring(6, 11));
		System.out.println(j.substring(0,5));
		String sub = j.substring(0, 5);
		System.out.println(sub);
		System.out.println("===========================");
		
		
		// concat()
		
        String v1="Ritesh";
        String v2="Meshram";
        System.out.println(v1.concat(v2));
        System.out.println(v1.concat(" "+v2));
        System.out.println(v1.concat("_Bhai"));
        System.out.println("===========================");
        
        // indexOf()
        
        String z="testing";
        String z1="Engineering";
        System.out.println(z.indexOf("t"));
        System.out.println(z.indexOf("n"));
        System.out.println(z1.lastIndexOf("n"));  //last n index number count
        System.out.println(z1.indexOf("n"));    // first n index number count
        System.out.println(z1.indexOf("n", 3));   // inbetween n index count
        
        System.out.println(z.indexOf("ing"));
        System.out.println(z1.indexOf("eeri"));
        System.out.println("===========================");
        
        // replace()
        
        String k1="Pune Pimpari";
        System.out.println(k1.replace("P", "U"));
        System.out.println(k1.replace("n","r"));
        System.out.println(k1.replace("", m));
	}
}
