
public class digitReplacment {

	public static void main(String[] args) {
		int num =11;
		int[] trials = {10,100,110,1100,11000};
		boolean isFound =true;
		while(isFound){
			for(int i=0;i<trials.length;i++){
				int count=0;
				if(num>trials[i] && isPrime(num)){
					int next=num;
					while(next<trials[i]*10){
						next+=trials[i];
						if(isPrime(next)){
							//System.out.println(num+" "+next );
							count++;
						}	
					}
					if(count>6){
						isFound=false;
						System.out.println(num);
						break;
					}
				}
			}
			num++;
		}

	}
	public static boolean isPrime(int n){
		boolean result = true;
		for (int j=2; j*j<=n; j++){
			if (n % j == 0){ 
				result= false;
				break;
			}
		} 
		return result;
	}

}
