import java.math.BigInteger;

public class PowerfulDigitSum {
	
	/**
	 * @Digital sum a,b<100 (a^b)
	 * @author Niraj Patel
	 */

	public static void main(String[] args) {
		//It takes less than minute.
		BigInteger big = new BigInteger("2");
		BigInteger powerDigit = new BigInteger("0");
		int largestSum =0,sum=0;
		String digits;
		for(long a = 2;a<100;a++){
			big = BigInteger.valueOf(a);
			for(int b =2;b<100;b++){
				sum =0;
				powerDigit = big.pow(b);
				digits = powerDigit.toString();
				for(int i=0;i<digits.length();i++){
					sum+=Character.getNumericValue(digits.charAt(i));
				}
				if(sum>largestSum){
					largestSum =sum;
				}
			}
		}
		System.out.println(largestSum);
	}

}
