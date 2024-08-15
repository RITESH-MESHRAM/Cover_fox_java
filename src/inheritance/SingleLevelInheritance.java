package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Mother mother= new Mother();
		Daughter daughter= new Daughter();
		System.out.println("============================");
		mother.recipi();
		mother.look();
		daughter.study();
		daughter.hobbies();
		daughter.recipi();//using sub class object, calling super class method
		daughter.look();//using sub class object, calling super class method
System.out.println("===========================");
	}

}
