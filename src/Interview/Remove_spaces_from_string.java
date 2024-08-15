package Interview;

public class Remove_spaces_from_string {

	public static void main(String[] args) {
		String name="Ritesh Meshram";
		String result=name.replaceAll("\\s", "");
		System.out.println("After: "+result);
		String result1=name.replaceAll("\\s", " ");
		System.out.println("Before: "+result1);
		}
}
