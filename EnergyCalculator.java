import java.util.Scanner;

public class EnergyCalculator{
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in Kilograms: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter the Initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energy = weight * (finalTemperature - initialTemperature) * 4184;
		
		System.out.printf("The energy needed is %.1f%n", energy);
		
		
	
	
	
	}


}
