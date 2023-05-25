import java.util.Scanner;

public class ConvertingMeters{

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a value for feet:  ");
		double feet = scan.nextDouble();
		
		System.out.printf("%.1f feet is %.4f meters.", feet, feet * 0.305);
		
		System.out.printf("%n");
		
	
	}


}
