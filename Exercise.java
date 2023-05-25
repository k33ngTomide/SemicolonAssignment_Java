
// exercise 2.25

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
	
	Scanner Scan = new Scanner(System.in);
	 
		System.out.print("Enter a number .... ");
		int A = Scan.nextInt();
		
		int B = 3;
		
		if (A % B == 0 ) {
		
		System.out.printf("%d%n is divisible by 3 ", A);
		
		}
		
		if (A % B != 0 ) {
		
		System.out.printf("%d is not divisible by 3 %n", A);
		
		}
		
	
	
	}
}
