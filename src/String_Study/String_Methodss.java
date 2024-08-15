package String_Study;

public class String_Methodss {

	public static void main(String[] args) {
		String name = "Ritesh Meshram";
		String name1="Nagpur";
		
		System.out.println(name.charAt(2));  // yachyat char index number check krtat
		
		System.out.println(name.length());  // yachyyat index chi length mojtat
		
		System.out.println(name.toUpperCase()); // small alphabets madhe lihla asel tr tyala capital latter mage lihte
		
		System.out.println(name.toLowerCase());  // lower case madhe convert karte yachyat 
		
		System.out.println(name.contains("Ritesh"));  // yachyat jo name yethi lihla ahe toch string variable madhi ahe ka he check krtat , boolian value print hote
		
		System.out.println(name.endsWith("am")); // end ya latter ne hot ahe ki nahi te check kartat
		
		System.out.println(name.startsWith("Rit")); // yachyat check kerto starts ya alphabets n hot ahe ki nahi he baghto
		
		System.out.println(name.substring(5));  // ha jo int enter kela ahe yachyat yachya samorcha srv print krte
		
		System.out.println(name.concat(" "+name1));  // ha fkt don string value le jodte 
		
		System.out.println(name1.indent(3));
		System.out.println(name.indent(6));   // jo index no. takla tya no. chya pudhe print krte
		
		System.out.println(name.lastIndexOf("e"));  // jo charctor takla apn to kiti index no. madhe ahe he santh
		
		System.out.println(name.replace("R", "H"));  // old char la replace krun new char add krto yachyat
		
		// Split
		//for(int f=0;f<name.length();f++) {
			
		
		

	}

}
