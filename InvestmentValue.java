import java.util.Scanner;

public class InvestmentValue {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Investment amount:  ");
		double investmentAmount = scan.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage:  ");
		double annualInterestRate = scan.nextDouble();
		
		System.out.print("Enter number of years:  ");
		double numberOfYears = scan.nextDouble();
		
		double monthlyInterestRate = annualInterestRate/1200;
		double accumulatedValue = investmentAmount * Math.pow(1 + monthlyInterestRate,  (numberOfYears*12));
		System.out.printf("Accumulated value is $%.2f%n", accumulatedValue ); 
		
	
	
	}
	
}
