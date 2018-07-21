package Lab3;
import java.util.Scanner;

public class Power {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n;
		//i is being count from 0 to nth number.
		int i = 0; 
		
		double a; 
		// result is start from 1 to multiple each other, when it is zero : 0 * 0 = 0;
		double result = 1; 
		
		System.out.println("Enter the a : ");
		a = s.nextDouble();
		System.out.println("Enter the power of n ");
		n = s.nextInt();
		
		
		while( n >= 0 && i < n ) {
			result = result * a ; 
			i++;
		}
		
		while( n < 0 && i > n ) {
			result = 1/a * result; 
			i--;
		}
		System.out.println(result);
	}
	
}
