
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = -10;
//		
//		//Find larger of two numbers. Use .min to find minimum:
//		double z = Math.max(x, y);
//		System.out.println(z);
//		
//		//Get absolute value:
//		double absol = Math.abs(y);
//		System.out.println(absol);
//		
//		//Square Root:
//		double sqr = Math.sqrt(9);
//		System.out.println(sqr);
//		
//		// Round:
//		double roundNum = Math.round(x);
//		System.out.println(roundNum);
//		
//		// Round up (use .floor to round down):
//		double ceilNum = Math.ceil(x);
//		System.out.println(ceilNum);
		
		
		/////FIND HYPOTENUSE OF TRIANGLE //////////
		
		double x;
		double y;
		double z;
		
		//Create a scanner to capture user input: It has to be imported
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("Hypoten of z is: " + z);
		
		//Close the scanner after use:
		scanner.close();
	
	
		
	}

}
