
public class forLoops {

	public static void main(String[] args) {
		
		//Continue loop for as long as i is less than or equal to 10. Increase i by 1 after each iteration:
		for(int i = 1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				System.out.println("FIZZBUZZ");
			}
			else if(i % 5 == 0) {
				System.out.println("FIZZ");
			}
			else if(i % 3 == 0) {
				System.out.println("BUZZ");
			}
			else {
				System.out.println(i);
			}
		}
		
	}

}
