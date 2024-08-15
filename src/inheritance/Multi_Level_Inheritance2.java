package inheritance;

public class Multi_Level_Inheritance2 {

	public static void main(String[] args) {
		
		GrandFather g= new GrandFather();  // this is for non-static regular method
		g.money();
		
		GrandFather.farm(); // this is for static regular method.
		
		Father f= new Father();
		f.gold();
		
	
        Father.color();
		Father.height();
		
		Son s= new Son();
				s.look();
				s.study();
				s.gold();
			
	}

}
