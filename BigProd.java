package Lab3;
import java.util.Scanner; 

public class BigProd {
	public static void main (String[]args) {
		long prod = 0, i ; 
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print( "input an integer ( enter 1 to exit ): ");
			i = s.nextLong();
			prod += i ; 
			System.out.println( "The total prod is " + prod);
			
		}while(i != 1);
	}
}
