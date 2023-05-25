

import java.util.Scanner;
public class Diameter {

	public static void main(String[] args) {
	
	Scanner Scan = new Scanner(System.in);
	System.out.print("Enter the Radius of the circle ... ");
	double R = Scan.nextDouble();
	
	System.out.printf("The diameter is %f%n", 2 * R);
	System.out.printf("The Circumference is %f%n", 2 * Math.PI * R);
	System.out.printf("The area is %f%n", Math.PI * (R * R));
	
	}
}
