package LogicalProgram;

public class CountStringWhiteSpace {
public static void main(String[] args) {
	
	String s="R i tes h";
    int count=0;
    for(int i=0;i<=s.length()-1;i++){
        char temp=s.charAt(i);
        if(temp==' '){
            count++;
        }
    }
    System.out.println("Number of white space are "+count);
	
}
}
