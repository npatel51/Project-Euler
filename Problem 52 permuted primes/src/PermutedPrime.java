import java.util.Arrays;

public class PermutedPrime {
	/**
	 * @Problem 52 prime permuted 
	 * @author Niraj Patel
	 */

	public static void main(String[] args) {
		boolean isFound = false;
		int num =100;
		while(!isFound){
			if(isPermut(num,num*2)&&isPermut(num,num*3)&&isPermut(num,num*4)&&isPermut(num,num*5)&&isPermut(num,num*6)){
				isFound =true;		
				System.out.println(num+" "+num*2+" "+num*3+" "+num*4+" "+num*5+" "+num*6);
			}
			num++;
		}

	}
	//checks if they are equal number by sorting the digits in order
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

}
