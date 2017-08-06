import java.math.BigInteger;

public class ConvergentSum {

	public static void main(String[] args) {
		BigInteger prevNum1 = BigInteger.ONE;
		BigInteger prevNum2 = BigInteger.ONE;
		BigInteger prevDen = BigInteger.ONE;
		int count = 0;
		for(int i = 0; i < 1000; i++){
			prevDen = prevDen.add(prevNum1);
			BigInteger temp = prevNum1;
			prevNum1 = prevNum1.add(prevNum1).add(prevNum2);
			prevNum2 = temp;
			if(prevNum1.toString().length()>prevDen.toString().length()){
				count++;
			}
		}
		System.out.println(count);

	}
}
/*BigInteger numerator = new BigInteger("0");
		BigInteger denomenator = new BigInteger("0");
		BigInteger previousX = new BigInteger("1");
		BigInteger previousY = new BigInteger("2");
		BigInteger X = new BigInteger("1");
		BigInteger Y = new BigInteger("2");
		int count =0,i=1;
		while(i<1001){
			numerator = (Y.multiply(BigInteger.valueOf(3)).add(X));
			denomenator = (Y.multiply(BigInteger.valueOf(2)).add(X));
			if(numerator.toString().length()>denomenator.toString().length()){
				count++;
			}
			previousX = X;
			previousY= Y;
			X = Y;
			Y = (previousY.multiply(BigInteger.valueOf(2)).add(previousX));
			i++;
		}
		System.out.println(count);

	}

}*/
