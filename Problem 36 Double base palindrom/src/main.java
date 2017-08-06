
public class main {

/**
 * @Problem 36 euler
 * @Double base palindrome number
 * @author patel
 */
	public static void main(String[] args) {
		String dec,revdec,bin,revbin;
		int sum =0;
		for(int i=0;i<1000000;i++){
			dec=Integer.toString(i);
			revdec= new StringBuffer(dec).reverse().toString();
			bin = Integer.toBinaryString(i);
			revbin=new StringBuffer(bin).reverse().toString();
			if(dec.equals(revdec)&&bin.equals(revbin)){
				sum+=(i);
			}
		}
		System.out.println(sum);
	}
}
