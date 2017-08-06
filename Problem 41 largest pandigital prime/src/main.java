import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class main {
	/**
	 * @Problem 41 largest pandigital primes
	 * @author Niraj Patel
	 */

	public static void main(String[] args) {
		ArrayList<Integer> pandigitalprimes = new ArrayList();
		for(int num=1000;num<8000000;num++){
			//Checking if the number is pandigital and then checking for prime makes the algorithm faster.
			if(isPandigital(num)){
				if(isPrime(num)){
					pandigitalprimes.add(num);
				}
			}
		}
		System.out.println(Collections.max(pandigitalprimes)+" is a largest pandigital prime!");
	}
	//Method for pandigital
	public static boolean isPandigital(int n){
		int digits = 0; int count = 0; int temp;
		for (; n > 0; n /= 10, ++count)
		{
			if ((temp = digits) == (digits |= 1 << (n - ((n / 10) * 10) - 1)))
				return false;
		}
		return digits == (1 << count) - 1;
	}
	public static boolean isPrime(long n){
		boolean result = true;
		for (int j=2; j*j<=n; j++){
			if (n % j == 0){ 
				result= false;
				break;
			}
		} 
		return result;
	}
}
//for 9 digit pandigital test
/*public static boolean isPanDigital(long n){
int result = 0;
while ( n > 0 ){
	int digit = (int)(n % 10);
	if ( digit == 0 ){
		return false;
	}
	result |= (1 << (digit - 1));
	n = n / 10;
}
return (result == 0x1ff);
}*/
