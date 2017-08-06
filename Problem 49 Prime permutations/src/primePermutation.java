import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class primePermutation {
/***
 * @problem 49 prime permutations
 * @author Niraj Patel
 */
	public static void main(String[] args) {
		//Takes less than a second, a bit longer but efficient in a way.
		//The interval is same 3330 and it make sense the last digit has for the interval to be the same.
		//One could just find prime number having a difference of 3330, I did this problem 2 ways.
		ArrayList<Integer> primes = new ArrayList();
		int num =1000,maxdif=0,dif1 =0,dif2=0;
		while(num<9999){
			if(isPrime(num)){
				primes.add(num);
			}
			num++;
		}
		for(int i=primes.size()-1;i>0;i--){
			maxdif= 3333; //difference could not be greater than this 3333.
			while(maxdif>3000){
				dif1= primes.get(i) - maxdif;
				dif2= primes.get(i)- 2*maxdif; //doubles the difference for third term
				if(primes.contains(dif1) && primes.contains(dif2)&&isPermut(primes.get(i),dif1)&&isPermut(primes.get(i),dif2)){
					System.out.println(dif2+""+dif1+""+primes.get(i));
					break;
				}
				maxdif--;
			}
		}
	}
	//sorting both numbers and if they are equal they are permutation of each other, I think it's better than finding all permutes.
	public static boolean isPermut(int n,int n1){
		boolean result =false;
		String num = Integer.toString(n);
		String num1 = Integer.toString(n1);
		char[] digits = num.toCharArray();
		char[] digits1 = num1.toCharArray();
		Arrays.sort(digits);
		Arrays.sort(digits1);
		String sorted = new String(digits);
		String sorted1 = new String(digits1);
		if(sorted.equals(sorted1)){
			result =true;
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
/* solution without permutations
for(int i=primes.size()-1;i>0;i--){
String c=Integer.toString(primes.get(i));
dif1= primes.get(i) -3330;
String a = Integer.toString(dif1);
dif2 = primes.get(i)-2*3330;
String b=Integer.toString(dif2);
if(primes.contains(dif1)&&primes.contains(dif2)&&(a.charAt(3)==b.charAt(3))&&(c.contains(a.substring(0,2)))){
	System.out.println(dif2+""+dif1+""+primes.get(i));
}
}*/