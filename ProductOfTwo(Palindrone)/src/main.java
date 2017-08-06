import java.util.ArrayList;
import java.util.Collections;

public class main {
/**
 * @Euler Project 4
 * @Largest palindrome of three digit
 * @Niraj Patel
 */
	static int number=0,reversnum = 0,reminder,original;
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		for(int i=100;i<=999;i++){
			for(int j=100;j<=999;j++){
				number = i*j;
				original=number;
				//algorithm for palindrome number
				while(number>0){
					reminder = number%10;
					reversnum = reversnum*10+reminder;
					number= number/10;
				}
				if(reversnum==original){
					list.add(original);
				}
				original=0;
				reversnum=0;
			}
		}
		System.out.println(Collections.max(list));// To get maximum number from the list

	}

}
