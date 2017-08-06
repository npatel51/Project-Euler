
public class CountingRectangle {

	public static void main(String[] args) {
		/*I went through all the possible grids until I found one that forms rectangles close to 2 million. 
		I found the pattern, which is true for any grid.For example in 3X3 there are  36 rectangles.
		 and it could be found the following way :
		(3*1+3*2+3*3)+(2*1+2*2+2*3)+(1*1+1*2+1*3)
		   1x1 1x2 1x3
		   (9) (6) (3)
		   2x1 2x2 2x3  Total = 9 + 6 + 3 + 6 + 4 + 2 + 3 + 2 + 1 = 36
           (6) (4) (2)
           3x1 3x2 3x3
           (3) (2) (1)
		 */
		int length=3,rectangles=0;
		boolean isFound=true;
		while(isFound){
			for(int width=length;width>1;width--){
				for(int l=length;l>=1;l--){
					for(int i=1;i<=width;i++){
						rectangles+=l*i;
					}
				}
				if(rectangles>1999990 && rectangles<2000000){
					System.out.println(rectangles);	
					System.out.println(length+"*"+width +"="+length*width);
					isFound=false;
				}
				rectangles=0;
			}
			length++;
		}

	}

}
