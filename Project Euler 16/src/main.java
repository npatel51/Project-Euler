
import java.math.BigInteger;
/**
 * @Euler project 16
 * @author patel
 * @Fingding 2 to the 1000th power and add all digits.
 */

public class main {

	public static void main(String[] args){
		BigInteger num = new BigInteger("2");
		int sum=0;
		String nums;
		int i=1;
		//algorithm to find power of any digit.
		while(i<1000){
			int k=2;//to mutiply it by 2 10000 times
			num = num.multiply(BigInteger.valueOf(k));
			i++;
		}
		nums = num.toString();
		for(int j=0;j<nums.length();j++){
			sum+=Character.getNumericValue(nums.charAt(j)); //to s=convert string's characters into int value.
		}
		System.out.println(sum);
	}

}

