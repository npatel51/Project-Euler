import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		/*The reason we start at 9999 is because 5 digit number multiply by 2 will be another 5 digit number,
		  Also as we know that number has to be starting with 9 to be the largest pandigital,
		  and 4 digit number is the largest possible multiple.
		 */
		int num = 9999,tmp;
		String number,product;
		boolean largestFound=true;
		while(largestFound){
			product = Integer.toString(num*2);
			number = Integer.toString(num);
			number= number.concat(product);
			tmp =Integer.parseInt(number);
			if(isPandigital(tmp)){
				largestFound = false;
				System.out.println(+num +" * "+(num*2));
				System.out.println(tmp);
			}
			num--;
		}
	}
	public static boolean isPandigital(int n){
		int digits = 0; int count = 0; int temp;
		for (; n > 0; n /= 10, ++count)
		{
			if ((temp = digits) == (digits |= 1 << (n - ((n / 10) * 10) - 1)))
				return false;
		}
		return digits == (1 << count) - 1;
	}

}
