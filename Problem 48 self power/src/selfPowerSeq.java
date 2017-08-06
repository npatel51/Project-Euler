import java.math.BigInteger;

public class selfPowerSeq {

	public static void main(String[] args) {
		BigInteger result = new BigInteger("0");
		BigInteger num =new BigInteger("1");
		int number = 1;
		String lastTen;
		while(number<1001){
			result= result.add(num.pow(number));
			num = num.add(BigInteger.valueOf(1));
			number++;
		}
		lastTen = result.toString();
		System.out.println(lastTen.substring((lastTen.length()-10), lastTen.length()));	
	}

}
