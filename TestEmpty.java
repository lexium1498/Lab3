package Lab3;
import java.util.Scanner; 

public class TestEmpty {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the String : ");
		String a = s.nextLine();
		
		if(a.isEmpty()) {
			System.out.println("The String is empty !");
		}else {
			System.out.println("The String is : " + a);
		}
	}
}
