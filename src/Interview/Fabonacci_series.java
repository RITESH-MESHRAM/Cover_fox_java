package Interview;

public class Fabonacci_series {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		int z;
		for(int i=1; i<=10; i++) {
		z=x+y; //z=0+1 //z=1
		x=y; //x=1
		y=z; //y=1 
		 //Next iteration z=1+1=2 
		System.out.println(z+"");
		}
	}

}
