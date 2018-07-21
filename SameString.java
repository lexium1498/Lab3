package Lab3;
import java.util.Scanner;

public class SameString {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String n = s.nextLine();
		String temp = "";
		int i = 0 ; 
		
		do {
			System.out.println(temp);
			temp = temp + n.substring(i, i+1);
			i++;
			if(temp.equals(n)){
				System.out.println(temp);
			}
		}while(temp.length() <= n.length() && i < n.length());
		
		
		/*
		 * using while loop
		while(temp.length() <= n.length() && i < n.length()) {
			temp = temp + n.substring(i, i + 1);
			i++; 
			System.out.println(temp);
		}
		if(temp.equals(n)) {
			System.out.println(temp);
		}
		*/
	
	}
}
