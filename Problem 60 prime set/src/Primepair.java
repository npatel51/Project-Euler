import java.util.ArrayList;

public class Primepair {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList();
		int num =2;
		boolean stop =true;
		// The limit has to be less than ten thousand to be the lowest sum.It takes less than 5 seconds
		while(num<10000){
			if(isPrime(num)){
				primes.add(num);
			}
			num++;
		}
		//and then brute force. I don't know any logical way of doing this.
		//I saw solution on the project euler and they were using Sieve of Eratosthenes, which I haven't learned yet. 
		for(int i =4;stop;i++){
			String n1 =Integer.toString(primes.get(i));
			for(int j=i;j<primes.size();j++){
				String n2 = Integer.toString(primes.get(j));
				if(isPrime(Long.parseLong(n1.concat(n2)))&&isPrime(Long.parseLong(n2.concat(n1)))&&stop){
					for(int k=j;k<primes.size();k++){
						String n3 =  Integer.toString(primes.get(k));
						if(isPrime(Long.parseLong(n3.concat(n1)))&&isPrime(Long.parseLong(n1.concat(n3)))
								&&isPrime(Long.parseLong(n3.concat(n2)))&&isPrime(Long.parseLong(n2.concat(n3)))&&stop){
							for(int l=k;l<primes.size();l++){
								String n4 =  Integer.toString(primes.get(l));
								if(isPrime(Long.parseLong(n1.concat(n4)))&&isPrime(Long.parseLong(n4.concat(n1)))
										&&isPrime(Long.parseLong(n4.concat(n2)))&&isPrime(Long.parseLong(n2.concat(n4)))
										&&isPrime(Long.parseLong(n4.concat(n3)))&&isPrime(Long.parseLong(n3.concat(n4)))&&stop){
									for(int m=l+1;m<primes.size();m++){
										String n5 =  Integer.toString(primes.get(m));
										if(isPrime(Long.parseLong(n5.concat(n1)))&&isPrime(Long.parseLong(n1.concat(n5)))
												&&isPrime(Long.parseLong(n2.concat(n5)))&&isPrime(Long.parseLong(n5.concat(n2)))
												&&isPrime(Long.parseLong(n3.concat(n5)))&&isPrime(Long.parseLong(n5.concat(n3)))
												&&isPrime(Long.parseLong(n4.concat(n5)))&&isPrime(Long.parseLong(n5.concat(n4)))){
											System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
											stop=false;
											break;
										}
									}

								}

							}
						}
					}
				}
			}
		}
	}
	public static boolean isPrime(long n){
		boolean result =true;
		for(long i=2;i*i<=n;i++){
			if(n%i==0){
				result =false;
			}
		}
		return result;
	}

}
