package practice;

public class Constructor {
	
	Constructor(){
		
		System.out.println("***********************************************");
		System.out.println("This is without parameterize constructor ");
	}
	
	Constructor(String name){
		super();
		System.out.println("This is with parametor constructor----1");
		System.out.println("The name is "+name);
		System.out.println("=====================================================");
	}
	
	Constructor(int age,float weight){
		//this();  // this () ; use for call this constructor to another constructor ,---- this(); must be the first statment in a constructor.
		//this("Sujay");  // This is a constructor chaining process
		System.out.println("=====================================================");
		
		System.out.println("This is double parametor constructor----2" );
		System.out.println("The age is "+age);
		System.out.println("Weight is "+weight);
		System.out.println("======================================================");
	}
	

	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		Constructor c1 = new Constructor("Ritesh");
		Constructor c2 = new Constructor(23,55.5f);


	}

}
