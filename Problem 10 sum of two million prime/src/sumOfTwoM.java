import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class sumOfTwoM {

	public static void main(String[] args) {
		long sum =2;
		boolean isPrime = true;
		for (int i=3; i<2000000; i++) {
			isPrime = true;
			//There is no need to go beyond the square root of number to check weather it is prime or not.
			//we only need to test for factors less than or equal to the square root.
			for (int j=2; j<=(int)Math.sqrt(i); j++){
				if (i % j == 0){ 
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				sum +=i;
			}
		}
		System.out.println("Sum  = "+sum); 
	}

}
