package Assignment1;

public class Result extends Marks {
int total;
	public static void main(String[] args) {
		
		Students s = new Students();
		s.studentInfo();
		s.getstudentInfo();
		
		Marks m= new Marks();
		m.getMarks();
		m.setMarks();
		
        Result r = new Result();
        r.calculate();
        r.getResult();

 }

	public void calculate() {
		total=marks1+marks2;
	}
	public void getResult() {
		System.out.println("Total marks obtained by  "+ name +" is : "+total);
	}
}
