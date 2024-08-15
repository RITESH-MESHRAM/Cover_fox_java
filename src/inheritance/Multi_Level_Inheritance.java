package inheritance;

public class Multi_Level_Inheritance {

	public static void main(String[] args) {
		
		System.out.println("======================");
		
		GrandMother grandMother=new GrandMother();  // for calling non-static regular method , we have to create object.
		grandMother.story();
		grandMother.singing();
		
		GrandMother.story();   // calling Static methods
		
		 Mother  mother=new  Mother();
		 mother.recipi();
		 mother.look();
		 mother.nature();
		 
		 Mother.nature(); // static method calling
		 
		 Daughter  daughter = new  Daughter();        // Non-Static method calling
		 daughter.hobbies();
		 daughter.study();
		 
		Daughter.hobbies();  //calling Static method.
		
		 System.out.println("========================");
	}

}
