package Lab3;
import java.util.Scanner; 

public class TestStrings {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		String a , b; 
		
		System.out.print("input the first String : ");
		a = s.nextLine();
		
		System.out.print("Input the second String : ");
		b= s.nextLine();
		
		if(a.equals(b)) {
			System.out.println("The strings are equal. ");
		}
	}
}
