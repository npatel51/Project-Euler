
public class main {

	public static void main(String[] args) {
		long num = 600851475143L;
		long newnum = num;
		long largestFactor = 0;
		int counter = 2;
		// counter * counter : To improve the algorithm,  Fundamental Theorem of Arithmetic (Logical explanation can be found on web).
		while (counter * counter <= newnum) { 
			if (newnum % counter == 0) {
				newnum = newnum / counter;
				largestFactor = counter;
			} else {
				counter++;
			}
		}
		if (newnum > largestFactor) { 
			largestFactor = newnum;
		}
		System.out.println(largestFactor);
	}
}