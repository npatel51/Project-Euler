import java.util.HashSet;

public class SingRightTriangle {

	public static void main(String[] args) {
		HashSet<Integer> triplets = new HashSet<Integer>();
		int limit = 1500000;
		int[] triangles = new int[limit+1];
		int result =0;
		int mlimit = (int)Math.sqrt(limit / 2);
		for (int m = 2; m < mlimit; m++) {
			for (int n = 1; n < m; n++) {
				if (((n + m) % 2) == 1 && gcd(n, m) == 1) {
					int a = m * m + n * n;
					int b = m * m - n * n;
					int c = 2 * m * n;
					int sum = a + b + c;
					//keeps unique set of number in array, you could also use  HashSet
					while(sum <= limit){
						triangles[sum]++;
						if (triangles[sum] == 1) {
							result++;
						}
						if (triangles[sum] == 2) {
							result--;
						}
						sum += a+b+c;
					}
				}
			}
		}
		System.out.println(result);
	}
			public static  int gcd(int n, int m){
				if (n % m == 0)
					return m;
				else
					return gcd(m, n % m);
			}
		}
