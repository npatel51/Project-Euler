
public class main {
	/**
	 * @Problem 37 tranc
	 * @author Niraj Patel
	 */
	public static void main(String[] args) {
		int number = 13,count=0,sum=0;
		while(count!=11){
			if(isPrime(number)&&tranctable(number)){
				System.out.println(number);
				count++;
				sum+=number;
			}
			number++;
		}	
		System.out.println(sum);
	}
	
	public static boolean tranctable(int n){
		String num = Integer.toString(n);
		int limit = (num.length()-1), tmp;
		boolean result =true;
		//This will go from left to right
		for(int i=limit;i>=0;i--){
			tmp=n%(int)Math.pow(10, i);	
			if(!(isPrime(tmp))||tmp==1){
				result = false;
				break;
			}
		}
		tmp = n;
		//This will go from right to left
		while(tmp>0){
			tmp=tmp/10;
			if(!(isPrime(tmp))||tmp==1){
				result = false;
				break;
			}
		}
		return result;
	}
	public static boolean isPrime(int n){
		boolean result = true;
		for (int i=2; i*i<=n; i++){
			if (n % i == 0){ 
				result= false;
				break;
			}
		}
		return result;
	}

}
