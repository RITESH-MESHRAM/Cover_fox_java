package Array;

import java.util.Arrays;

public class Array_Study {

	public static void main(String[] args) {
		
		// i want to store rollno
		
		// Declaration
		int rollNo[]= new int [5];
		
		//initilization
		rollNo[0]=11;
		rollNo[1]=13;
		rollNo[2]=32;
		rollNo[3]=21;
		rollNo[4]=8;
		
		// Usage
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[2]);
		System.out.println(rollNo[3]);
		System.out.println(rollNo[4]);
		System.out.println("=========================");
		
		// Declaration
		String name[]=new String[3];
		//initilization
		name[0]="Ritesh";
		name[1]="Sujay";
		name[2]="Virat";
		//Usage
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println("==========================");
		
		float Age[]=new float[4];  //Declaration
		
		Age[0]=22.3f;  // Initilization
		Age[1]=32.2f;
		Age[2]=11.2f;
		Age[3]=14f;
		//Usage
		
		System.out.println("===============Dynomic Way Ascending Order ==============");
		
		Arrays.sort(Age);
		for(int i=0;i<=Age.length-1;i++) {
			System.out.println(Age[i]);
		}
		System.out.println("======================Dynamic Way Descending order=======================");
		
		for(int i=Age.length-1;i>=0;i--) {
			System.out.println(Age[i]);
			
		}
		
	}

}
