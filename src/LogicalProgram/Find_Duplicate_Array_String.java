package LogicalProgram;

public class Find_Duplicate_Array_String {

	public static void main(String[] args) {

		 String ar[]={"Ritesh","Sujay","Rupali","Akshay","Bunty","Sujay","Ritesh","Jiya"};
	        System.out.println("Duplicate Elements are: ");
	        int count=0;
	        for(int i=0;i<ar.length;i++){
	            
	            for(int j=i+1;j<ar.length;j++){
	                if(ar[i].equals(ar[j])){
	                    System.out.print(ar[i]+" ");
	                    count++;
	                }
	            }
	        }
	        System.out.println();
	       System.out.println("Total duplicate number of count: "+count);
	    }
	}


