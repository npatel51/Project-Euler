import java.awt.List;
import java.util.ArrayList;

public class main {
	public static void main(String[] args){
		int max = 0;
		int maxdeci = 0;
	//	for(int i = 100; i <1000; i++){
		int i=7;
			int r=10;					
			ArrayList<Integer> rem = new ArrayList<Integer>();		
			int count = 0;			
			while(!rem.contains(r)){
				System.out.println(r);
				rem.add(r);
				r = 10 * (r%i);
				count++;
			}						
			int length = count - rem.lastIndexOf(r);			
			if(length > max){
				max = length;
				maxdeci = i;
			}
		//}
		System.out.println(maxdeci);		
	}
}