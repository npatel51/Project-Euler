import java.math.BigInteger;

public class concealedPrime {
	/**
	 * @Project euler problem 206 concealed square
	 * @author Niraj Patel
	 */

	public static void main(String[] args) {
		/*
		 * The code runs pretty smooth, it takes less than a second in my Intel celeron.
		 *  The data type long messed me up, it wasted my one hour. I was using long for square as we know that the max digit will be 19.
		 *   But when squaring a number using wolfram alpha I got different answer. Thus, I used big Integer. 
		 *   And the upper bound I found it using wolfram alpha as the square is close to 1.96*10^18, which is the largest possible number.
		 *    Then I jumped by "10" as the last digit is zero. 
		 */
		boolean isFound = true;
		BigInteger square = new BigInteger("0");
		for(long num =1400000000;isFound;num=(num-10)){
			square = BigInteger.valueOf(num);
			square =square.pow(2);
			String number = square.toString();
			char[] digits =  number.toCharArray();
			if(digits[0]=='1'&&digits[2]=='2'&&digits[4]=='3'&&digits[6]=='4'&&digits[8]=='5'&&digits[10]=='6'&&
					digits[12]=='7'&&digits[14]=='8'&&digits[16]=='9'){		
				System.out.println(num);
				isFound=false;
			}
		}
	}
}
