import java.util.ArrayList;

public class distinctPrime {
	static ArrayList<Integer> primes = new ArrayList();
	public static void main(String[] args) {
		int num = 2;
		//we need list of primes
		while(num<999){
			if(isPrime(num)){
				primes.add(num);
			}
			num++;
		}
		//not working 
	int i=134043;
			if(distinct(i)){
				if(distinct(i+1)){
					if(distinct(i+2)){
						if(distinct(i+3)){
							System.out.println(+i+" "+(i+1)+" "+(i+2)+" "+(i+3));
						}	
					}
				}
			}
	}
	public  static boolean distinct(int n){ //brute force 
		boolean isFound = false;
		boolean result = false;
		for(int a =0;a<primes.size();a++){
			for(int b=0;b<primes.size();b++){
				for(int c=0;c<primes.size();c++){
					for(int d=0;d<primes.size();d++){
						if(n==(primes.get(a)*primes.get(b)*primes.get(c)*primes.get(d))
							||n==(primes.get(a)*primes.get(a)*primes.get(b)*primes.get(c)*primes.get(d))){
							result = true;
							break;
						}
					}
				}
			}
		}
		return result;
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
