import java.math.BigInteger;

public class PowerDigit {

	public static void main(String[] args) {
		int sum =0;
		BigInteger big = new BigInteger("2");
		big = big.pow(1000);
		String result =big.toString();
		for(int i=0;i<result.length();i++){
			sum+=Character.getNumericValue(result.charAt(i));
		}
		System.out.println("sum : "+sum );

	}

}
