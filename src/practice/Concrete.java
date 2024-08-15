package practice;

import java.io.Console;

public class Concrete extends Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Concrete c= new Concrete();
c.fun();
c.fun2();
c.fun1(98);
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("hii");
	}


}
