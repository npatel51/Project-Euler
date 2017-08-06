import java.util.stream.IntStream;

public class main {
/**
 * @Problem 31 Euler
 * @Coins sum
 * @author patel
 */
	public static void main(String[] args) {
		int limit = 200;
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int[] ways = new int[201];
		int wayssum =0;
		ways[0] = 1;
		 //shortest way of doing it.
		for (int i = 0; i < coins.length; i++) {
		    for (int j = coins[i]; j <= limit; j++) {
		        ways[j] += ways[j - coins[i]];
		    }
		}
		System.out.println(ways[200]);
		int countways=1;
		for (int a=0; a<=200; a++) { // max 200 one's
			for (int b=0; b<=100; b++){ //max 100 2's
				for (int c=0; c<=40; c++){ //max 40 5's
					for (int d=0; d<=20; d++) { //max 20 10's
						for (int e=0; e<=10; e++){ //max 10 20's
							for (int f=0; f<=4; f++){ //max 4 50's
								for (int g=0; g<=2; g++){ //max 100 2's
									if(a + 2*b + 5*c + 10*d + 20*e + 50*f + 100*g == 200){ //Mathematical equation to solve
										countways++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(countways);
	}
}


/*Alternate solution:
	int target  = 200;
	int ways = 0;
	 
	for (int a = target; a >= 0; a -= 200) {
	    for (int b = a; b >= 0; b -= 100) {
	        for (int c = b; c >= 0; c -= 50) {
	            for (int d = c; d >= 0; d -= 20) {
	                for (int e = d; e >= 0; e -= 10) {
	                    for (int f = e; f >= 0; f -= 5) {
	                        for (int g = f; g >= 0; g -= 2) {
	                            ways++;
	                        }
	                    }
	                }
	            }
	        }
	    }
	}
	System.out.println(ways);
}*/