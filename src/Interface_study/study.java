package Interface_study;

public interface study {
	
int a = 56;

void day1();
void day2();
default void day() {
	
	System.out.println("This is day method from interface study");
	
 }

static void day6() {
	System.out.println("This is day6 method from interface study");
}
}
