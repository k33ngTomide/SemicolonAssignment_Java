import java.util.Scanner;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int numberOne = scan.nextInt();

		System.out.print("Enter second number: ");
		int numberTwo = scan.nextInt();

		System.out.print("Enter third number: ");
		int numberThree = scan.nextInt();

		System.out.print("Enter fourth number: ");
		int numberFour = scan.nextInt();

		System.out.print("Enter fifth number: ");
		int numberFive = scan.nextInt();
		
		int smallest = numberOne;
		if (numberTwo < smallest) {
			smallest = numberTwo;
			}
		if (numberThree < smallest){
			smallest = numberThree;
			}
		if (numberFour > smallest) {
			smallest = numberFour;
			}
		if (numberFive < smallest) {
			smallest = numberFive;
			}

		int largest = numberOne;
		if (numberTwo > largest){
			largest = numberTwo;
			}
		if (numberThree > largest){
			largest = numberThree;
			}
		if (numberFour > largest){
			largest = numberFour;
			}
		if (numberFive > largest){
			largest = numberFive;
			}

		
		

		System.out.printf("Largest is %d%n", largest);
		System.out.printf("Smallest is %d%n", smallest);
	}
}
