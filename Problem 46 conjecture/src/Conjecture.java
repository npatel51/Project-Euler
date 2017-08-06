import java.util.ArrayList;

public class Conjecture {

	public static void main(String[] args) {
		// it takes less than second
		ArrayList<Integer> primes = new ArrayList();
		int num=2,n = 0;
		boolean isFound = false;
		//list of primes
		while(num<10000){
			if(isPrime(num)){
				primes.add(num);
			}
			num++;
		}
		for(int i=9;i<10000;i++){
			isFound=false;
			//for number to be odd and not prime
			if(!(i%2==0) && (!isPrime(i))){
				n = i;
				for(int j =0;j<primes.size();j++ ){
					for(int k=1;k<50;k++){
						if(n ==(primes.get(j)+(2*Math.pow(k, 2)))){
							isFound=true;
							break;
						}
					}
					if(isFound){
						break;
					}
				}
				if(!isFound){
					System.out.println(n);
					break;

				}
			}
		}
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
