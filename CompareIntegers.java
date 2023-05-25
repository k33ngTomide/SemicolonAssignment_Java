import java.util.Scanner;

public  class CompareIntegers {

	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number:  ");
		int number = scan.nextInt();
		
		int  square = number*number;
		int add = number + square;
		
		if (add > 100 ){
			System.out.println("The number and its square is greater than 100.");		
		}
		
		if (add < 100 ){
			System.out.println("The number and its square is less than 100.");
		}
		
		if (add == 100 ){
			System.out.println("The number and its square is equal to 100.");
		}
		
		if (add != 100 ){
			System.out.println("The number and its square is not equal 100.");
		} 
		
		//System.out.println(add > 100 ? "The number and its square is greater than 100." : "The number and its square is not equal 100.");
		
		//System.out.println(add == 100 ? "The number and its square is equal to 100." : "The number and its square is not equal 100.");
	}
	
}
