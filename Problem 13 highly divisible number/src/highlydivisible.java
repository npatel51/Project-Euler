/**
 * @Euler Problem 12
 * @author patel
 * @Finding a number divisible by 500 numbers or more.
 */

public class highlydivisible {
	public static void main(String[] args) {
		boolean found = false;
		int num=0,temp=0;
		while(found==false){
			temp++;
			num+=temp;
			if(divisior(num)>500){
				found=true;
				System.out.println(num);
			}
		}
	}
	public static int divisior(int num){
		int counter=0;
		for(int i=1;i<=Math.sqrt(num);i++){ 
			if(num%i==0){
				counter++;
			}
		}
		return 2*counter;
	}

}