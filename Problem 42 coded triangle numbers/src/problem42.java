import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class problem42 {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list =new ArrayList();
		ArrayList<Integer> num = new ArrayList();
		FileReader  words = new FileReader("C:\\Users\\patel\\Desktop\\p042_words.txt");
		Scanner reads = new Scanner(words);
		reads.useDelimiter(",");
		String tmp;
		int count =0,total=0,terms=2;
		//there are 26 alphabets so i don't want to go over that even though It could not be the sum.
		while(terms<30){
			num.add((terms*(terms-1)/2));
			terms++;
		}
		while(reads.hasNext()){
			total=0;
			tmp = reads.next();
			tmp = tmp.replaceAll("\"", "");
			for(int i=0;i<tmp.length();i++){
				total+=((tmp.charAt(i)-64));
			}
			if(num.contains(total)){
				count++;
			}
		}
		System.out.println(count);
	}
}

/*    
public static void main(String[] a) throws FileNotFoundException {
			Scanner s=new Scanner(new File("words.txt")).useDelimiter("(\"|,)+");
			int result=0,sum;
			while(s.hasNext()) {
    			sum=0;
    			for(char c:s.next().toCharArray())
							sum+=c-64;
    			if(0==(Math.sqrt(sum*8+1)-1)%2)
							++result;
			}
			System.out.println(result);
}
}*/