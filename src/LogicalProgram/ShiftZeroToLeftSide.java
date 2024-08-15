package LogicalProgram;

public class ShiftZeroToLeftSide {

	public static void main(String[] args) {

		
		int ar[]= {1,0,2,0,3,4,0,5,6,7,0}; //Output--> {0,0,0,0,1,2,3,4,5,6,7}
		int index=0;
		int ar1[]=new int [ar.length];
		
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]==0) {
				index++;
			}
		}
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]!=0) {
				ar1[index]=ar[i];
				index++;
			}
			System.out.print(ar1[i]+" ");
		}
	}

}
