package Lab3;
import java.util.Scanner; 

public class ForeverConcat{
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the String : ");
		String bigString = s.nextLine();
		
		do{
			System.out.println(bigString);
			break;
		}
		while(bigString.length() > 0);
		
		do {
			break;
		}
		while(bigString.isEmpty());
	}
}
