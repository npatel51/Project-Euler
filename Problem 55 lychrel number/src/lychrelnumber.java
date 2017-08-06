import java.math.BigInteger;

public class lychrelnumber {

	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		long num = 1,i=0,count=0;		
		boolean islychrel =false;
		while(num<10000){
			sum = BigInteger.valueOf(num);
			i=0;
			islychrel = true;
			while(i<50){
				//reverse the sum of the number to add it to new sum.
				String flipNum = new StringBuffer(sum.toString()). reverse().toString();
				//String to bigInteger
				BigInteger flip = new BigInteger(flipNum);
				sum = sum.add(flip);
				//reverse sum  to see if they are palindromic.
				String reverse = new StringBuffer(sum.toString()). reverse().toString();
				if(sum.toString().equals(reverse)){
					islychrel = false;
				}
				i++;
			}
			//counts only if lychrel number.
			if(islychrel){
				count++;
			}
			num++;
		}
		System.out.println(count);
	}
}

