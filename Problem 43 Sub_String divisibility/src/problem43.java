import java.util.HashSet;
import java.util.Set;

public class problem43 {

	public static void main(String[] args) {
		int total=0;
		long n = 1023456789,sum=0;
		String num;
		//Above this number sub string number are not divisible from (2-17)
		while(n<=5000000000L){
			num=Long.toString(n);
			if(Integer.parseInt(num.substring(1,4))%2==0 &&
					Integer.parseInt(num.substring(2,5))%3==0 &&	
					Integer.parseInt(num.substring(3,6))%5==0 &&
					Integer.parseInt(num.substring(4,7))%7==0 &&
					Integer.parseInt(num.substring(5,8))%11==0 &&
					Integer.parseInt(num.substring(6,9))%13==0 &&	
					Integer.parseInt(num.substring(7,10))%17==0 ){
				if(isPanadigital(n)){
					System.out.println(n);
					sum+=n;				
				}
			}
			//Adding 9 you will not lose any pandigital number
			n+=9;
		}
		System.out.println(sum);
	}
	public static boolean isPanadigital(long n){
		boolean result = true;
		Set<Integer> digits = new HashSet();
		String num ;
		num = Long.toString(n);
		for(int i=0;i<num.length();i++){
			if(digits.add(num.charAt(i)-48)==false){
				result =false;
			}
		}
		return result;
	}


}
