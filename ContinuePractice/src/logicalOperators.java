import java.util.Scanner;

public class logicalOperators {

	public static void main(String[] args) {
		
		// 					&& = (AND) both conditions must be true
		//					|| = (OR) either condition must be true
		//					! = (NOT) reverses boolean value of condition
		
		int temp = 23;
		
		if(temp > 30) {
			System.out.println("It is hot!!!");
		}
		// AND OPERATOR:
		else if(temp >= 20 && temp <=30) {
			System.out.println("It is perfect weather!!");
		}
		else {
			System.out.println("It is cold!!");
		}

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game. Press q or Q to quit");
		
		String response = scanner.next();
		// OR OPERATOR:
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("BYE!!!");
		}
		else {
			System.out.println("You are still in the game");
		}
		
		
		
		
	}

}
