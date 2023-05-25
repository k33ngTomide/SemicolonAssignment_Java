import java.util.Scanner;

public class Conversion{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter a number in pound:  ");
	double kilogram = scan.nextDouble();
	
	
	System.out.printf("%.2f pounds is %.3f kilograms %n", kilogram, kilogram * 0.454);
	System.out.print("");
	
	
	}


}
