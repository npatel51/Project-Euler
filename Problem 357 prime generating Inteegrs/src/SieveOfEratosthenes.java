
public class SieveOfEratosthenes{

	/** Function to calculate all primes less than n **/

	private int[] calcPrimes(int N)	 {
		int[] arr = new int[N + 1];
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (arr[i] == 0)  {
				for (int j = i * i; j <= N; j += i)	{
					arr[j] = 1;
				}
			}
		}
		return arr;
	}
	/** Function to get all primes **/

	public int[] getPrimes(int N){
		int[] primes = calcPrimes(N);
		int prime[] = new int[N+1];
		int j=0;
		for (int i = 2; i < primes.length; i++){
			if (primes[i] == 0){
				prime[j] = i;
				j++;
			}
		}
		return prime;
	}

	/** Function to display all primes **/

	/*public void display(int[] primes){
		System.out.print("\nPrimes = ");
		for (int i = 2; i < primes.length; i++)
			if (primes[i] == 0)
				System.out.println(i +" ");
	}*/
}