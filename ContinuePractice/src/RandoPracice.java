import java.util.Random;


public class RandoPracice {

	public static void main(String[] args) {
		
		//Initialize the random instance:
		Random random = new Random();
		
		int diceRoll = random.nextInt(1, 7);
		
		System.out.println(diceRoll);
		
		
		boolean z = random.nextBoolean();
		System.out.println(z);
	}

}
