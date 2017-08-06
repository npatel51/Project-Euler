
public class SpiralPrime {

	public static void main(String args[]){
		int count=0, n=0,ratio;
		boolean isbelow =false;
		while(!isbelow){
			n+=2;
			if(isPrime(n*n+1)){
				count++;
			}
			if(isPrime(n*n+n+1)){
				count++;
			}
			if(isPrime(n*n-n+1)){
				count++;
			}
			ratio = ((count*100)/((2*n)+1));
			if(ratio<10){
				System.out.println("Side: "+(n+1));
				isbelow = true;
				break;
			}
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
