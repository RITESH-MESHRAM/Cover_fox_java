package LogicalProgram;

public class FindDuplicateArrayNum {

	public static void main(String[] args) {

		int ar[]= {1,2,3,4,3,5,7,8,4,9,7};
		System.out.println("Duplicate Element Are: ");
		int count=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j]) 
				{
					
					System.out.print(ar[i]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Number of duplicate count "+count);
	}

}
