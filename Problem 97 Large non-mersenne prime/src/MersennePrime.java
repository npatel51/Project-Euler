import java.math.BigInteger;

public class MersennePrime {
	/**
	 * @ Problem 97 largest prime
	 * @author Niraj Patel
	 */

	public static void main(String[] args) {
		// pretty straight forward question needs no explanation.
		BigInteger Largestprime = new BigInteger("2"); 
		BigInteger mod = new BigInteger("10000000000"+ ""); 
		Largestprime = Largestprime.modPow(new BigInteger("7830457"),mod).multiply(new BigInteger("28433")).add(BigInteger.ONE).mod(mod); 
		System.out.println(Largestprime);
	}

}
