package Lab3;
import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the Integer : ");
		int n = s.nextInt();
		int a = (int)Math.sqrt(n);
		
		if(a == Math.sqrt(n)) {
			System.out.println("This is perfect square !");
		}else {
			System.out.println("This is not the perfect square !");
		}
		
	}
}
