import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

import javax.imageio.stream.FileImageInputStream;

public class largesum{
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\patel\\Desktop\\Largesum.txt");
		 FileImageInputStream r=new FileImageInputStream(file);
	        BigInteger big=new BigInteger("0");
	        String temp;
	        while((temp=r.readLine())!=null){
	        BigInteger b=new BigInteger(temp);
	        big=b.add(big);
	        }
	        System.out.println (big.toString().substring(0, 10));
	}

}
