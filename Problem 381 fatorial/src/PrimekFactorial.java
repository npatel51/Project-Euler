import java.math.BigInteger;
import java.util.ArrayList;

public class PrimekFactorial {

	public static void main(String[] args) {
		ArrayList<BigInteger> listoffactorial = new ArrayList();
		BigInteger factorial = new BigInteger("1");
		BigInteger result = new BigInteger("0");
		listoffactorial.add(BigInteger.valueOf(1));
		long start =5,i=1;
		while(i<100000000){
			factorial=factorial.multiply(BigInteger.valueOf(i));
			listoffactorial.add(factorial);
			i++;
		}
		/*while(start<10000){
			if(isPrime(start)){
				BigInteger sum = new BigInteger("0");
				for(long num=(start-5);num<start;num++){
					BigInteger factorial = new BigInteger("1");
					long n=num;
					while(n>1){
						factorial=factorial.multiply(BigInteger.valueOf(n));
						n--;
					}
					sum=sum.add(factorial);
				}
				result = result.add(sum.mod(BigInteger.valueOf(start)));
			}
			start++;
		}*/
		System.out.println(result);
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
