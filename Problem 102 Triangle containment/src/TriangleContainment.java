import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TriangleContainment {

	public static void main(String[] args) throws FileNotFoundException {
		/*Used the area formula of triangle abs(((x1*(y2-y3)+(x2*(y3-y1))+(x3*(y1-y2))))/2)).
		 * If the triangle contains origin than the sum of areas of triangles
		 * containing a co-ordinates (0,0) will be equal to the area of original triangle.*/
		FileReader reader = new FileReader("C:\\Users\\patel\\Desktop\\Problem 102.txt");
		Scanner in = new Scanner(reader).useDelimiter("(\\s|,)+");
		int[] num = new int[6000]; 
		int count=0;
		for(int i=0;i<num.length;i++){
			num[i] = in.nextInt();
		}
		for(int i =0;i<num.length;i=(i+6)){
			if(area(num[i],num[i+1],num[i+2],num[i+3],num[i+4],num[i+5])==((area(0,0,num[i+2],num[i+3],num[i+4],num[i+5])+
					area(num[i],num[i+1],0,0,num[i+4],num[i+5])+
					area(num[i],num[i+1],num[i+2],num[i+3],0,0)))){
				count++;
			}
		}
		System.out.println(count);
	}
	public static double area(double x1,double y1,double x2,double y2,double x3,double y3){	
		return  Math.abs(((x1*(y2-y3)+(x2*(y3-y1))+(x3*(y1-y2))))/2);
	}
}

