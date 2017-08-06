import java.util.ArrayList;
import java.util.Collections;

public class SquareChain {

	public static void main(String[] args) {
		//did this two ways both are efficient.
		int count = 0;
		for(int i = 1; i < 10000000; i++) {
			int is89= ends(i);
			if(is89==89)
				count++;
		}
		System.out.println(count);
	}
	private static int ends(int i) {
		if(i==1 || i== 89){
			return i;
		}
		else{
			//if not 89 then finds the sum again.
			return ends(digitSquare(i));
		}
	}	
	private static int digitSquare(int i) {
		int result = 0;
		while(i > 0) {
			result += (i%10)*(i%10);
			i = i/10;
		}
		return result;
		
	}	

}


/*	ArrayList<Integer> number = new ArrayList();
	int num = 2;
	long limit=9999999,count=0;
	//First I found what can be the maximum starting number, 9999999 = 567.
	// So I found all the number below 567 that falls in endless loop of 89.
	while(num<=567){
		String digits = Integer.toString(num);
		int sum=0;
		while(sum!=89){
			sum=0;
			for(int i=0;i<digits.length();i++){
				sum+=Character.getNumericValue(digits.charAt(i))*Character.getNumericValue(digits.charAt(i));
			}	
			if(sum==1){
				break;
			}
			if(sum==89){
				number.add(num);
			}
			digits = Integer.toString(sum);
		}
		num++;
	}
	//and then just found all the starting number and checked if they are in list.
	while(limit>1){
		String n = Long.toString(limit);
		int sumSquare=0;
		for(int i=0;i<n.length();i++){
			sumSquare+=Character.getNumericValue(n.charAt(i))*Character.getNumericValue(n.charAt(i));
		}	
		if(number.contains(sumSquare)){
			count++;
		}
		limit--;
	}
	System.out.println(count);
}*/