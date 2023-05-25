
import java.util.Scanner;

public class NationalHeart {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter your Weight (in Pounds) ...");
	float weight = scan.nextInt();
	
	System.out.print("Enter your Height (in inches) ...");
	float height = scan.nextInt();
	
	float BMI =  (weight * 703)/(height * height);
	System.out.println("From the National Heart Lung and Blood Institute");
	System.out.printf("Your Body Mass Index, BMI = %.2f%n", BMI);
	
		if (BMI > 30){
		System.out.println("your BMI is showing you might have Obesity");
		}
	
		if (25.0 > BMI < 30) {
		System.out.println("You are overweight");
		}
	
		if (18.5 > BMI <= 25) {
		System.out.println("You are Healthy");
		}
	
		if (BMI < 18.5) {
		System.out.println("You are underweight");
		}
	
	}

}
