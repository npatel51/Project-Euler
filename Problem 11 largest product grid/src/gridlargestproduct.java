
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class gridlargestproduct {
	/**
	 * @author Niraj patel
	 * @Euler Project 11
	 */
	static int product = 1;
	public static void main(String[] args) throws IOException {
		FileReader ff = new FileReader("C:\\Users\\patel\\Desktop\\Grid File (20X20).txt");
		Scanner in = new Scanner(ff);
		int[][] num = new int[20][20];
		ArrayList<Integer> list = new ArrayList();
		//reading the numbers into 2D array
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				num[i][j] = in.nextInt();
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		// Multiplying numbers vertically in downward direction
		for(int col=0;col<20;col++){
			for(int k=0;k<17;k++){
				for(int j=k;j<k+4;j++){
					product*=num[j][col];
				}
				if(product!=0){
					list.add(product);	
				}
				product=1;
			}
		}
		//multiplying numbers in horizontal direction
		for(int row=0;row<20;row++){
			for(int k=0;k<17;k++){
				for(int j=k;j<k+4;j++){
					product*=num[row][j];
				}
				if(product!=0){
					list.add(product);	
				}
				product=1;
			}
		}
		//multiplying number diagonally\
		for(int j =0;j<17;j++){
			int row=j; 
			for(int i=0;i<17;i++){
				for(int col =i;col<i+4;col++){
					product*=num[row][col];
					row++;
				}
				row=j;
				if(product!=0){
					list.add(product);	
				}
				product=1;
			}
		}
		//multiplying diagonally in reverse order
		for(int j =0;j<17;j++){
			int row=j; 
			for(int i=19;i>=3;i--){
				for(int col =i;col>i-4;col--){
					product*=num[row][col];
					row++;
				}
				row=j;
				if(product!=0){
					list.add(product);	

				}
				product=1;
			}

		}
		System.out.println(Collections.max(list));
	}
}
