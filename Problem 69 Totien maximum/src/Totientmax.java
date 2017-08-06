import java.util.ArrayList;

public class Totientmax {
	public static void main(String[] args) {
		int max=1,number=0,limit=1000000;
		/* I got stuck on this one for a while. Although, I had the algorithm which works but not efficient for million number.
		/ There is a mathematical formula for this on Wikipedia. Link : https://en.wikipedia.org/wiki/Euler's_totient_function
		/ basically we are trying to find the smallest ratio without exceeding million. Thus multiplying primes will give us the number
		that is divisible by primes as well and is multiple of those numbers. I hope my explanation made sense.*/
		for(int num=2;num<100;num++){
			if(isPrime(num)){
				if(num*max<limit){
					max*=num;
				}
			}
		}	
		System.out.println(max);
		}
		public static boolean isPrime(int n){
			boolean result =true;
			for(int i=2;i*i<=n;i++){
				if(n%i==0){
					result =false;
				}
			}
			return result;
		}

	}