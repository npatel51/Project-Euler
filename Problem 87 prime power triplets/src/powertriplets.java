import java.util.ArrayList;
import java.util.HashSet;

public class powertriplets {

	public static void main(String[] args) {
		/*I had to use Hashset to avoid repeating number in the process.
		*We only have to check until the square root of 50 million because the square of the number above it will exceed 50 million.
		*Made a list of all primes under the square root of 50 million.
		*Used three for loops to go through each possible case.
		*/
		ArrayList<Integer> primes = new ArrayList();
		HashSet<Integer> counts = new HashSet();
		int num =2;
		while(num<(int)Math.sqrt(50000000)){
			if(isPrime(num)){
				primes.add(num);
			}
			num++;			
		}
		for(int i=0;i<primes.size();i++){
			for(int j=0;j<primes.size();j++){
				for(int k=0;k<primes.size();k++){
					if((Math.pow(primes.get(i), 2)+Math.pow(primes.get(j), 3)+Math.pow(primes.get(k), 4))<50000000)
						counts.add((int)(Math.pow(primes.get(i), 2)+Math.pow(primes.get(j), 3)+Math.pow(primes.get(k), 4)));
					if((Math.pow(primes.get(i), 2)+Math.pow(primes.get(j), 3)+Math.pow(primes.get(k), 4))>50000000);
						break;				
				}
			}
		}
		System.out.println(counts.size());
	}
	public static boolean isPrime(long n){
		boolean result =true;
		for(long i=2;i*i<=n;i++){
			if(n%i==0){
				result =false;
			}
		}
		return result;
	}

}
