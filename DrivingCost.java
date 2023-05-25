import java.util.Scanner;

public class DrivingCost{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter the driving distance:  ");
		double drivingDistance = scan.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = scan.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = scan.nextDouble();
		
		System.out.printf("The cost of driving is $%.2f%n", (drivingDistance*pricePerGallon) / milesPerGallon);
	
	
	}


}
