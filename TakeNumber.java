import java.util.Scanner;

public class TakeNumber{

	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd= 0;
		int takeNumber;
		
		Scanner can = new Scanner(System.in);
	
		System.out.print("Enter a number:   ");
		takeNumber = can.nextInt();
		
		while (takeNumber !=-1) {
	
			if (takeNumber % 2 != 0) {
				sumOdd += takeNumber;
			} else  {
				sumEven +=takeNumber;
			}
			
			System.out.println("Enter another number or enter -1 to quit: ");
			takeNumber = can.nextInt();
		
		}	
		
			System.out.printf("The total sum of even number is %d%n", sumEven);
			System.out.printf("The total sum of Odd number is: %d %n", sumOdd);
	}

}
