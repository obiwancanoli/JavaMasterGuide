
public class ArrayPractice {

	public static void main(String[] args) {

		String[] cars = {"McLaren", "Ford", "Nissan", "Rivian"};
		
		System.out.println(cars[3]);
		
		
		//Another way to make an array. Assigning 3 elements to the array:
		String[] tacos = new String[3];
		
		tacos[0] = "al pastor";
		tacos[1] = "pollo";
		tacos[2] = "carne asada";
		
		
		// Loop through an array:
		for(int i = 0; i<tacos.length; i++) {
			System.out.println(tacos[i]);
		}
		
	}

}
