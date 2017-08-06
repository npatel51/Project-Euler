
public class main {

	public static void main(String[] args) {
		int maxsol =0,solutions,maxP=0;
		// for pythagorean a^2+b^2 = c^2 but we don't know c, solve for s from equation and substitute in a+b+c =p
		//Thus a+b+ Math.sqrt(Math.pow(i,2)+Math.pow(j,2)) which is c
		for(int p =100;p<1000;p++){
			solutions =0;
			for (int a=10; a<p; a++) {
				for (int b=10; b<p-a; b++) {
					if (Math.sqrt(Math.pow(a,2)+Math.pow(b,2))+a+b == p && (a<b)){
						solutions++;
					} 
				}
				if(solutions>maxsol){
					maxsol=solutions;
					maxP=p;
				}
			}
		}
		System.out.println(maxP);
	}
}