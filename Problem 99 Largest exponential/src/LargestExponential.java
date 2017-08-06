
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class LargestExponential {

	public static void main(String[] args) throws FileNotFoundException {
		/*Largest exponential. It took me some time as I was trying to brute force it, 
		 * but I figured out that I need to use math (Logarithms)
		 * to solve it. a^m > b^n ---> m*log(a) >n*log(b)
		 * It was a good one, I liked it. */
		FileReader reads = new FileReader("C:\\Users\\patel\\Desktop\\p099_base_exp.txt");
		Scanner in = new Scanner(reads).useDelimiter("(\\s|,)+");
		int[][] baseexp = new int[1000][2];
		int line=0, largest=0,logvalue=0;
		for(int row =0;row<1000;row++){
			for(int col =0;col<2;col++){
				baseexp[row][col] =in.nextInt();
			}
			logvalue = (int) (baseexp[row][1]*Math.log(baseexp[row][0]));
			if(logvalue>largest){
				largest=logvalue;
				line =row;
			}
		}
		System.out.println((line+1));
	}
}

