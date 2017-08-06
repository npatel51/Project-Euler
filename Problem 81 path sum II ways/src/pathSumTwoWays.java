import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class pathSumTwoWays {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader  input = new FileReader("C:\\Users\\patel\\Desktop\\p081_matrix.txt");
		Scanner in = new Scanner(input).useDelimiter("(\\s|,)+");
		int[][] num = new int[80][80];
			for(int i=0;i<80;i++){
				for(int j=0;j<80;j++){
					num[i][j] = in.nextInt();
				}
			}
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[0].length; j++) {
					if (i == 0 && j != 0) {
						num[i][j]+= num[i][j - 1];
					} else if (i != 0 && j == 0) {
						num[i][j] = num[i][j] + num[i - 1][j];
					} else if (i == 0 && j == 0) {
						num[i][j] = num[i][j];
					} else {
						num[i][j]+= Math.min(num[i][j - 1], num[i - 1][j]);
					}
					System.out.println(num[i][j]);
				}
				
			}
		System.out.println(num[num.length-1][num[0].length-1]);	
	}
	

}
