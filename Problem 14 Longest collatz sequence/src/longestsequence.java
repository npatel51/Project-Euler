/**
 * @euler project 14
 * @Using the rule above and starting with 13, we generate the following sequence:
 * @13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * @It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 *  @Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *@ Which starting number, under one million, produces the longest chain?
 * @author patel
 *
 */
public class longestsequence {
	public static void main(String[] args) {
		int large=0, count=1,num=0;
		for(int i=2;i<=1000000;i++){
			long n=i;
			count=1;
			while(n>1){
				if(n%2==0){
					n=n/2;
				}
				else{
					n=(3*n)+1;
				}
				count++;
			}
			if(count>large){
				large=count;
				num=i;
			}
		}
		System.out.println("Largest sequence num :"+num);
		System.out.println("longest sequence value:"+large);

	}
}