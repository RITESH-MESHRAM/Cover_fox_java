package methodStudy;

public class StudentInfo{

public static void main(String[] args){

		StudentInfo info = new StudentInfo();
        info.displayInformation(); // method without parameter
        
        info.displayInformation("bunty", 11, 25.6f, 'A', 98f, true); // method with parameter 
        
        info.displayInformation("Ritesh", 12, 24.4f, 'B', 88.80f, true);
	}
 public void displayInformation()  // This is Non-static regular Method without parameter
 {
	 // name, rollNo , Age, Div ,% marks, PassingStatus
	 String name="Ritesh"; 
	 int rollNo= 67;
	 float Age = 25.4f;
	 char Div = 'A';
	 float marks = 78.9f;
	 boolean result = true;	 
	 
	 System.out.println("============================================================================");
	 
	 System.out.println("Studdent name is "+name);
	 System.out.println("Student rollNo is "+rollNo);
	 System.out.println("Student Age is "+Age);
	 System.out.println("Student division is "+Div);
	 System.out.println("Student marks is "+marks+"%" );
	 System.out.println("Student result is "+result);
 }
  public void displayInformation(String name,int rollNo, float Age, char Div, float marks,boolean result) //This is Non-static regular Method with parameter
  {      
	     System.out.println("==========================================================================");
	     System.out.println("Studdent name is "+name);
		 System.out.println("Student rollNo is "+rollNo);
		 System.out.println("Student Age is "+Age);
		 System.out.println("Student division is "+Div);
		 System.out.println("Student marks is "+marks+"%" );
		 System.out.println("Student result is "+result);
		 System.out.println("===========================================================================");
  }
  
}