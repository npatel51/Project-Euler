import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class maxPathsum2 {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader  read = new FileReader("C:\\Users\\patel\\Desktop\\p067_triangle.txt");
		Scanner  in = new Scanner(read);
		int[][] num = new int[100][100];
		int[][] maxNum = new int[100][100];
		for(int row=0;row<100;row++){
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
