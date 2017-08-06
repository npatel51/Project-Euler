
public class Countingsum {

	public static void main(String[] args) {
		//This immediately reminds me of problem 31.
		int[] ways = new int[101];
		ways[0]=1;
		for (int i = 1; i <100; i++) {
		    for (int j = i; j <= 100; j++) {
		        ways[j] += ways[j - i];
		    }
		}
		System.out.println(ways[100]);
		System.out.println(solveFor(100,99));

	}
	//recursion Idk
	public static int solveFor(int n, int k)
	    {
	        if(k == 1 || n==0)
	            return 1;
	        if(k <= 0 || n < 0)
	            return 0;
	        return solveFor(n,k-1) + solveFor(n-k,k);
	    }

}
