
public class main {

	public static void main(String[] args) {
		int number = 1000; // Obviously there is no number less than 1000 evenly divisible by all 1 to 20.
		while (!(number % 20 == 0 && number % 19 == 0 && number % 18 == 0 
				&&number % 17 == 0 && number % 16 == 0 && number % 15 == 0
				&&number % 14 == 0 && number % 13 == 0 && number % 12 == 0 &&number % 11 == 0)) {
			number += 20; //Increment by 20
		}
		System.out.println("The number that is evenly divisible by all of the numbers from 1 to 20: " + number);
	}
}
