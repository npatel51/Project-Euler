import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * @problem 35 Euler
 * @Circular primes
 * @author patel
 *
 */
public class main {
	static 	Set<Integer> circularprimes = new HashSet();
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList();
		primes.add(2);
		circularprimes.add(2);
		circularprimes.add(3);
		circularprimes.add(5);
		circularprimes.add(9);
		//Finding all primes less than one million		
		for (int i=3; i<1000000; i++) {
			if(isPrime(i)){
				primes.add(i);
			}
		}
		for(int i=0;i<primes.size();i++){
			Circulars(primes.get(i));
		}
		//Finds the intersection of primes and circular primes list.
		primes.retainAll(circularprimes);
		System.out.println(primes); // Prints all circular prime numbers.
		System.out.println(circularprimes.size()); //Prints no. of circular primes.
	}
	//Method for circular numbers of prime
	public static void Circulars(int n){
		int limit,count=0,reminder,CircularNum;
		String num = Integer.toString(n);
		limit = (num.length()-1);
		CircularNum = n;
		for(int i=0;i<limit;i++){
			reminder = (int) (CircularNum %(Math.pow(10, limit)));
			CircularNum = reminder*10+(int)(CircularNum/(Math.pow(10, limit)));
			if(isPrime(CircularNum)){
				count++;
			}	
			if(count==limit){
				circularprimes.add(CircularNum);
			}
		}
	}
	//Method of isPrime
	public static boolean isPrime(int n){
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
