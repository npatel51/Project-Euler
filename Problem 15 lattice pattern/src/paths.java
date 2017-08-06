import java.math.BigInteger;

public class paths {

	public static void main(String[] args) {
		BigInteger big = new BigInteger("1"); 
		BigInteger big2 = new BigInteger("1"); 
		int n=1;
		while(n<41){
			big = big.multiply(BigInteger.valueOf(n));
			//for 20!
			if(n<21){
				big2 =big2.multiply(BigInteger.valueOf(n));
			}
			n++;
		}
		System.out.println(big.divide((big2.multiply(big2))));

	}

}
