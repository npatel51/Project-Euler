import java.util.ArrayList;

public class PrimeGeneratingInt {

	public static void main(String[] args) {
		ArrayList<Long> primes = new ArrayList();
		long sum =3,num=2;
		while(num<1000000){
			if(isPrime(num)){
				primes.add(num);
			}
			num++;
		}
		System.out.println(primes.size());
	
		/*while(num<1000000000){
			if(!isPrime(num)){
				boolean allDivisorsPrime =true;
				for(int i=2;i<=(int)Math.sqrt(num);i++){
					if(!isPrime(num+1)){
						allDivisorsPrime =false;
						break;
					}
					if(num%i==0){
						if(!isPrime(i+(num/i))){
							allDivisorsPrime =false;
							break;
						}
					}
				}
				if(allDivisorsPrime){
					sum+=num;
				}
			}
			num+=4;
		}*/
		System.out.println(sum);
	}

	public static boolean isPrime(long n){
		boolean result = true;
		for (int i=2; i<=Math.sqrt(n); i++){
			if (n % i== 0){ 
				result= false;
				break;
			}
		} 
		return result;
	}
}
