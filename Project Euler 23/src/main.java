import java.util.ArrayList;
import java.util.Collections;

/**
 * @euler project 23
 * @For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * @As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, 
 * @the smallest number that can be written as the sum of two abundant numbers is 24. 
 * @ it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers.
 * @Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 * @author patel
 *
 */
public class main {
	static ArrayList<Integer> list = new ArrayList();
	public static void main(String[] args) {
		int sum=0,sum1=0;
		//finding abundant numbers
		for(int i=1;i<=28123;i++){
			sum1 =0;
			for(int j=1;j<=(i/2);j++){
				if(i%j==0){
					sum1+=j;
				}
			}
			if(sum1>i){
				list.add(i);
			}
		}
		for(int i=1;i<=28123;i++){
			int add=0;
			for(int j=1;j<=(i/2);j++){
				if(i%j==0){
					add+=j;
				}
			}
			//checking for sum of abundant number....
			if(chk(i)==true && add==i){
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("Sum of perfect number :"+sum);
	}
	public static boolean chk(int n){
		boolean result= true;
		for(int k=0;k<list.size();k++){
			if(list.get(k)+list.get(0)==n){
				result = false;
				break;
			}
		}
		return result;
	}
}

