import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		int num = 2,consPrime = 0,largestTerm=1;
		ArrayList<Integer> primes = new ArrayList();
		//Populating the arraylist with primes
		while(num<1000000){
			if(isPrime(num)){
				primes.add(num);
			}
			num++;
		}
		for(int i =(primes.size()-1);i>=(primes.size()/2);i--){
			//It is obvoius that it will be a large number so i started at 990000.
			if(primes.get(i)>990000){
				for(int j=0;j<primes.size();j++){
					int sum =0,terms=0;
					for(int k=j;k<primes.size();k++){
						sum+=primes.get(k);
						terms++;
						if(sum==primes.get(i)){
							if(terms>largestTerm){
								largestTerm=terms;
								consPrime=sum;
							}
							break;
						}
						if(sum>primes.get(i)){
							break;
						}
					}
				}
			}
		}
		System.out.println(consPrime);
	}
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
