package Lab3;

import java.util.Scanner;

public class power2 {
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
		
		do {
			result = result * a ; 
			i ++;
		}while(n >= 0 && i <= n );
		do {
			result = 1/a * result ; 
			i--;
		}while( n < 0 && i > n );
		System.out.println(result);
		/*
		while( n >= 0 && i < n ) {
			result = result * a ; 
			i++;
		}
		
		while( n < 0 && i > n ) {
			result = 1/a * result; 
			i--;
		}
		System.out.println(result);
	  */
	} 
}
