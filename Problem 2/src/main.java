
public class main {
	/**
	 * @Euler problem 2
	 * @author Nirajpatel
	 */

	public static void main(String[] args) {
		int fib1 = 1,fib2 = 1,newFib = 2,sum = 0; 
		while(newFib < 4000000){
			if(newFib % 2 == 0){
				sum += newFib;
			} 
			fib1 = fib2; 
			fib2 = newFib;
			newFib = fib1 + fib2; //Fibonacci sequence is generated by adding the previous two terms.
		} System.out.println("Sum = " + sum); 
	} 
}
