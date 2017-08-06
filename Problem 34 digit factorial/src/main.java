import java.util.ArrayList;

public class main {
	/**
	 * @Poject Euler problem 34
	 * @Author Niraj Patel
	 */

	public static void main(String[] args) {
		int num = 3,sum =0;
		int target = 99999;
		while(num<target){
			if(num==factorialSum(num)){
				sum+=num;
			}
			num++;
		}	
		System.out.println("Sum : "+sum);
		
	}
	public static int factorialSum (int n){
		int result=0,factorial=1, temp=0;
		ArrayList<Integer> list = new ArrayList();
		//Getting each digit in list as we don't know the size of array..
		while(n!=0){
			temp =n%10;
			list.add(temp);
			n=n/10;
		}
		//Finding factorial of each digit
		for(int j=0;j<list.size();j++){ 
			temp = list.get(j);
			while(temp>0){
				factorial = factorial*(temp);
				temp = temp-1;
			}
			result+=factorial;
			factorial=1;	
		}
		return result;

	}

}
	/*	Alternate version:
	 * int total=0;
		
		for(int i=3;i<9999999;i++)
		{
			if (fact(i) == i){
				total+=i;
			}
		}
		System.out.println(sum);
		System.out.println(total);
	}
	
	public static int fact(int number) {

		int[] factorials = new int[] {1,1,2,6,24,120,720,5040,40320,362880};
		String temp = Integer.toString(number);
		int fact_sum=0;
		
		for(int i=0;i<temp.length();i++)
			fact_sum += factorials[Integer.parseInt(temp.substring(i,i+1))];
		
		return fact_sum;
	}*/
