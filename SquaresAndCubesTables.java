public class SquaresAndCubesTables{

	public static void main(String [] args) {
		int number;
		int square;
		int cube;
		
		
		System.out.println("Number\tSquare\tCube");
		
		
		
		for (number=0; number<11; number++) {
			square= number * number;
			cube= number * number * number;
			System.out.println(number+"\t"+square+"\t"+cube);
			
		}
		
		
	}


}
