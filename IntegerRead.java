import java.util.Scanner;

public class IntegerRead{

	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd= 0;
		int number;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter a number:   ");
		number = scan.nextInt();
		
		while (number != -1) {
	
			if (number % 2 != 0) {
				sumOdd += number;
			} else  {
				sumEven += number;
			}
			
			System.out.println("Enter another number or enter -1 to quit: ");
			number = scan.nextInt();
		
		}	
		
			System.out.printf("The total sum of even number is %d%n", sumEven);
			System.out.printf("The total sum of Odd number is: %d %n", sumOdd);
	
	}
	
	
}	
