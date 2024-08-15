package Abstarct_study;

public class Concrete_use extends Abstract_demo {

	public static void main(String[] args) {
		
		Concrete_use c= new Concrete_use();
		c.test1(); //method completed in Abstract class

		c.test2(); //method completed in Abstract class

        c.test3(); //method completed in Abstract class

        c.test4(); //method completed on concreate class
        c.test5();  //method completed on concreate class

	}

	public void test4() {
		System.out.println("hi i am test 4 completed in concrete class");
	}
	public void test5() {
		System.out.println("hi i am test 5 completed in concrete class");
  }
}
