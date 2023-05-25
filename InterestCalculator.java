import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
		System.out.print("Enter balance and interest rate: ");
	
		double balance =  input.nextDouble();
		double annualInterestRate = input.nextDouble();
	
		double interest = balance * (annualInterestRate/1200);
	
		System.out.printf("Interest rate is: %.5f%n", interest);
	
	
	}
	
}
