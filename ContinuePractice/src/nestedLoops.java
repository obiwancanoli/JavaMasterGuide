import java.util.Scanner;

public class nestedLoops {

	public static void main(String[] args) {
		
		// Nested loop = a loop inside another loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i = 1; i<=rows; i+=1) {
			System.out.println();
			for(int j=1; j<=columns; j+=1) {
				System.out.print(symbol);
			}
		}

	}

}
