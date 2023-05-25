import java.util.Scanner;

public class RunwayLength{

	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter speed and acceleration:  ");
		double speed = scan.nextDouble();
		double acceleration = scan.nextDouble();
		double runwayLength = (speed * speed) / (2 * acceleration);
		
		System.out.printf("The minimum runway length for this airplane is %.3f%n", runwayLength);
	
	
	}

}
