import java.util.ArrayList;
import java.util.Arrays;

public class CubicPermutations {
	public static void main(String[] args) {
		for(long num= 345;num<10000;num++){
			int count =1;
			String n1 = Long.toString((long) Math.pow(num, 3));
			for(long num1= num+1;num1<10000;num1++){
				String n2 =Long.toString((long) Math.pow(num1, 3));
				if(isPermut(n1,n2)){
					count++;
				}
				if(n2.length()>n1.length()){
					break;
				}
			}
			if(count==5){
				System.out.println(n1);
				break;
			}
		}
	}
	//For permutation
	public static boolean isPermut(String n,String n1){
		boolean result =false;
		char[] digits = n.toCharArray();
		char[] digits1 = n1.toCharArray();
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
