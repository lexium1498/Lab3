package Lab3;
import java.util.Scanner;

public class EvenLength {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the String : ");
		String a = s.nextLine();
		
		while(a.length() % 2 == 0 ) {
			System.out.println("The String is : " + a);
			break;
		}
		while(a.length() % 2 != 0) {
			break;
		}
	}
}
