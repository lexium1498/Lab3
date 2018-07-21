package Lab3;
import java.util.Scanner;

public class FixMe3 {
	public static void main(String[]args) {
		double x , y , quotient; 
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("First Integer ? ");
		x = kbd.nextInt();
		
		System.out.println("Second Integer ? ");
		y = kbd.nextInt();
		
		quotient = x/y; 
		System.out.println("The quotient is " + quotient);
	}
}
