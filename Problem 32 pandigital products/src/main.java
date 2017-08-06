import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class main {
	/**
	 * @Problem 32 Euler
	 * @Sum of all pandigital products
	 * @author Niraj Patel
	 */

	public static void main(String[] args) {
		Set<Integer> pandigitals = new HashSet<Integer>(); 
		ArrayList<Integer> list =new ArrayList(); //Not Needed!
		int product=0,sum=0;
		String productLength;
		for(int i=1;i<999;i++){
			for(int j=1;j<9999;j++){
				product = i*j;
				productLength = Integer.toString(product);
				if(productLength.length()<5){
					if(ispandigital(i,j,product)){
						pandigitals.add(product);
					}
				}
			}
		}
		list.addAll(pandigitals); //You can avoid doing this!
		for(int i=0;i<list.size();i++){
			sum+=list.get(i);
		}
		System.out.println("Sum of all pandigital products is :"+sum);
	}
	public static boolean ispandigital(int a,int b,int c){
		boolean result=false;
		int temp=0;
		int [] nums = {a,b,c};
		Set<Integer> digits = new HashSet<Integer>(); 
		for(int  i=0;i<nums.length;i++){
			while(nums[i]>0){
				temp = nums[i]%10;
				if(temp>0){
					digits.add(temp);
				}
				nums[i]=nums[i]/10;
			}
		}
		if(digits.size()==9){
			result=true;
		}
		return result;
	}
}
