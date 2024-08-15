package LogicalProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {

		// 153-->1^3+5^3+3^3-->1+125+27-->153
		//123-->1^3+2^3+3^3-->1+8+27-->36
		//153-->3,5,1
		int num=153;
		int num1=0;
		for(int i=num;i>0;i=i/10)//153,15,3
		{
		int rem = i%10;//3,5,1
		num1=num1+(rem*rem*rem);//
		//27=0+27;
		//152=27+125;
		//153=152+1
		}
		if(num==num1)
		{
		System.out.println("Given number is ArmStrong number");
		}
		else {
		System.out.println("Given number is not ArmStrong number");
	    }
	}
}
