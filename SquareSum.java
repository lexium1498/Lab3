package Lab3;
import java.util.Scanner ; 

public class SquareSum {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nth number : ");
		int n ;
		double sum ; 
		double i ; 
		sum = 0 ;
		i = 0; 
		n = s.nextInt();
		
		while(i <= n) {
			sum = sum + Math.pow(i, 2.0);
			i++;
		}
		System.out.println(sum);
	}
}
