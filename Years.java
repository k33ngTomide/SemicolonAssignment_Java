import java.util.Scanner;

public class Years {

	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of years in minutes:  ");
		int minutes = scan.nextInt();
		
		long years = minutes / (60*24*365);
		int days = (minutes / (60*24)) % 365;
		
		
		System.out.printf("%d minutes approximately %d years and %d days.%n",  minutes, years, days);
		
		
	
	}


}
