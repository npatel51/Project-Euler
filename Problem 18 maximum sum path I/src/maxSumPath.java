import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class maxSumPath {

	public static void main(String[] args) throws FileNotFoundException {
		//This one took me some time because I was thinking of going through each route and It seems like brute force.
		//So I thought why not reduce the each line by finding max number below a digit and add it to the new line.
		//let's look at example (it's basically collapsing the triangle into smaller dimension by finding max number underneath.
		/* 3 --> 3+20 =23
		 * 7 4 --> (7+13,4+15) = (20,19)
		 * 2 4 6 --> start here max number below each number and add it =(2+8,4+9,6+9) =(10,13,15)
		 * 8 5 9 3
		 */
		FileReader  read = new FileReader("C:\\Users\\patel\\Desktop\\Maximum total.txt");
		Scanner  in = new Scanner(read);
		int[][] num = new int[15][15];
		int[][] maxNum = new int[15][15];
		for(int row=0;row<15;row++){
			for(int col=0;col<row+1;col++){
				num[row][col] = in.nextInt();
			}
		}
		for(int i =num.length-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				maxNum[i][j] = max(num[i+1][j],num[i+1][j+1])+num[i][j];//adds max number out of two
				num[i][j]=maxNum[i][j];// updates the new line
			}
		}
		System.out.println(maxNum[0][0]);
	}
	public static int max(int n,int n1){
		if(n>n1){
			return n;
		}
		else{
			return n1;
		}
		
	}
}
