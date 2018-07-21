package Lab3;
import java.util.Scanner;
public class StringLength {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input a string : ");
		String a = s.nextLine();
		
		System.out.println("The length of \"" + a + "\" is " + a.length() + ".");
	}
}
