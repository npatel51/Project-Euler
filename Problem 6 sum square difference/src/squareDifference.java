
public class squareDifference {

	public static void main(String[] args) {
		int sum=0,sumSquare=0;
		for(int num =1;num<101;num++){
			sum+=num;
			sumSquare+=num*num;
		}
		System.out.println(sum*sum - sumSquare);
	}

}
