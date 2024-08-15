package practice;

public class Loop {
public static void main(String[] args) {
// FOR LOOP
	for(int a=3;a<=30;a=a+3) {
		System.out.println(a );
	}
	
	System.out.println("=======================================================");
	// WHILE LOOP
	int h=4;
	while(h<=40) {
		System.out.println(h);
		h=h+4;
	}
	System.out.println("______________________________________________________");
// WHILE LOOP
    int j = 70;
    while(j>=7) {
    	System.out.println(j);
    	
    	j=j-7;
    }
    System.out.println("___________________________________________");
    // DO WHILE LOOP
    int r=90;
    do{
    	System.out.println(r);
    	r=r-9;}
    while(r>=9);
    
    System.out.println("_______________________________________");
    // DO WHILE LOOP
    int u=6;
    do {
    	System.out.println(u);
    	u=u+6;
    }while(u<=60);
    
    System.out.println("________________________________");
    
    // odd number
    for(int a=3;a<=21;a=a+2) {
    	System.out.println(a);
    }
    
}

}
