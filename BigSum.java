package Lab3;
import java.util.Scanner; 

public class BigSum {
	public static void main(String[]args) {
		long sum = 0 , i ; 
		Scanner kbd = new Scanner(System.in);
		
		do {
			System.out.print("Input an integer ( enter 0 to exit ) : " );
			i = kbd.nextLong();
			sum += i; 
			System.out.println( "The Total sum is " + sum);
			
		}while(i != 0 );
	}
}
