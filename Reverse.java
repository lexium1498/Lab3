package Lab3;
import java.util.Scanner;

public class Reverse {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Integer : ");
		int n = s.nextInt();
		int reverseNum = 0 ;
		/*reverseNum = reverseNum * 10 + n % 10;
		 * this equation remains last digit of number n and stores as reverseNum;
		 * pull the digit to 10th each time.
		 * n = n / 10; rid off the last digit of the number n. 
		 * */
		while( n > 0 ) {
			reverseNum = reverseNum * 10 + n % 10 ; 
			n = n / 10 ; 
		}
		System.out.println(reverseNum);
	}
}
