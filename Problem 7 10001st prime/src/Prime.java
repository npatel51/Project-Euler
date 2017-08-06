
public class Prime {

	public static void main(String[] args) {
		int count =0,num=2;
		while(count!=10001){
			if(isPrime(num)){
				count++;
			}
			if(count==10001){
				System.out.println(num);
			}
			num++;
		}

	}
	public static boolean isPrime(int n){
		boolean result = true;
		for (int num=2; num*num<=n; num++){
			if (n % num == 0){ 
				result= false;
				break;
			}
		} 
		return result;
	}
}
