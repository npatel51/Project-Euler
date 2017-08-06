
public class main {
/**
 * @problem 33
 * @Furious fraction
 * @author Niraj patel
 */
	public static void main(String[] args) {
		for(double i=11;i<100;i++){
			for(double j=i+1;j<100;j++){
				double division = i/j;
				//Converting number into string.
				String numerator =Integer.toString((int)i);
				String denomenator =Integer.toString((int)j);
				double pos1=((double)(numerator.charAt(0)-48)/(denomenator.charAt(1)-48));
				double pos2=((double)(numerator.charAt(1)-48)/(denomenator.charAt(0)-48));
				//Condition for furious fraction!
				if((division ==pos1||division==pos2)&&((((numerator.charAt(0)-48)==(denomenator.charAt(1)-48))
				||((numerator.charAt(1)-48)==(denomenator.charAt(0)-48))))){
					System.out.println(+(int)i+" / "+(int)j+" = ");
					System.out.println((numerator.charAt(0)-48)+" "+(numerator.charAt(1)-48));
					System.out.println(("-"+" "+"-"));
					System.out.println((denomenator.charAt(0)-48)+" "+(denomenator.charAt(1)-48));
					break;
				}
			}
		}
		//Once you get the number, you can figure out the product and the lowest common term of denominator by yourself.
	}
}
