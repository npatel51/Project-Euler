import java.math.BigDecimal;

public class squareRoot {

	public static void main(String[] args) {
		int sum=0;
		BigDecimal deci = new BigDecimal(0);
		deci = new BigDecimal(Math.sqrt(2));
		System.out.println(deci);
		String digits = deci.toString();
		for(int j=digits.indexOf(".")+1;j<=digits.indexOf(".")+100;j++){
			sum+=Character.getNumericValue(digits.charAt(j)); 
		}
		System.out.println(sum);
	}
}
