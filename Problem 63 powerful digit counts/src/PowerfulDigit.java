import java.math.BigInteger;

public class PowerfulDigit {

	public static void main(String[] args) {
		//we have to use biginteer here.
		BigInteger power = new BigInteger("0");
		BigInteger value = new BigInteger("0");
		int count=0;
		//You have to start at 1 because you know 1 to 9  is one digit, and raise it to 1 power is one digit number.
		for(int i=1;i<10;i++){
			power = BigInteger.valueOf(i);
			for(int j=1;j<100;j++){
				value = power.pow(j);
				String digits= value.toString();
				if(digits.length() == j){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
