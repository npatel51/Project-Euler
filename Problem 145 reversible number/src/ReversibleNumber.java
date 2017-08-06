import java.math.BigInteger;
import java.util.ArrayList;

public class ReversibleNumber {

	public static void main(String[] args) {
		/*I preferred using bigInteger although it can be  done using long.
		 *It takes 5 minutes on my old HP laptop (intel celeron). 
		 *Arghh! not a efficient algorithm or analytical thinking though it works smoothly for million. */
		BigInteger sum = new BigInteger("0");
		int count=0;
		for(int num =1;num<1000000000;num=(num+2)){
			sum = new BigInteger(Integer.toString(num));
			String reverse = new StringBuffer(sum.toString()). reverse().toString();
			BigInteger flip = new BigInteger(reverse);
			sum= sum.add(flip);
			if(reverse.charAt(0)!='0'){
				if(digitsOdd(sum.toString())){
					count++;
				}
			}
		}
		System.out.println(count*2);
	}
	public static boolean digitsOdd(String n){
		boolean result =true;
		for(int i =0;i<n.length();i++){
			if(Character.getNumericValue(n.charAt(i))%2==0){
				result=false;
				break;
			}
		}		
		return result;
	}

}
