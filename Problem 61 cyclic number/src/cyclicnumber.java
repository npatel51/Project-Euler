import java.util.ArrayList;

public class cyclicnumber {

	public static void main(String[] args) {
		ArrayList<String> polygonal = new ArrayList(); 
		for(int n=1;n<200;n++){
			if(Integer.toString(n*(n+1)/2).length()==4){
				polygonal.add(Integer.toString((n*(n+1)/2)));
			}
			if(Integer.toString(n*n).length()==4){
				polygonal.add(Integer.toString(n*n));
			}
			if(Integer.toString(n*(3*n-1)/2).length()==4){
				polygonal.add(Integer.toString(n*(3*n-1)/2));
			}
			if(Integer.toString(n*(2*n-1)).length()==4){
				polygonal.add(Integer.toString(n*(2*n-1)));
			}
			if(Integer.toString(n*(5*n-3)/2).length()==4){
				polygonal.add(Integer.toString(n*(5*n-3)/2));
			}
			if(Integer.toString(n*(3*n-2)).length()==4){
				polygonal.add(Integer.toString(n*(3*n-2)));
			}
		}

		for(int i=0;i<polygonal.size();i++){
			String lastTwo = polygonal.get(i).substring(2,4);
			for(int j=0;j<polygonal.size();j++){
				if(lastTwo.equals(polygonal.get(j).substring(0,2))){
					lastTwo = polygonal.get(j).substring(2,4);
					for(int k=0;k<polygonal.size();k++){
						if(lastTwo.equals(polygonal.get(k).substring(0,2))){
							lastTwo = polygonal.get(k).substring(2,4);
							System.out.println(polygonal.get(i)+" "+polygonal.get(j) +" "+polygonal.get(k));
							for(int l=0;l<polygonal.size();l++){
								if(lastTwo.equals(polygonal.get(l).substring(0,2)) && (polygonal.get(l).substring(2, 4).equals(polygonal.get(i).substring(0,2)))){
									//lastTwo = polygonal.get(l).substring(2,4);
									//System.out.println(polygonal.get(i)+" "+polygonal.get(j) +" "+polygonal.get(k) +" "+polygonal.get(l));
								}
							}
						}
					}
				}

			}
		}

	}
}


/*for(int i=0;i<triangle.size();i++){
int lastTwo = triangle.get(i)%100;
for(int j=0;j<square.size();j++){
	if(lastTwo == (int)square.get(j)/100){
		for(int k=0;k<pentagonal.size();k++){
			lastTwo = square.get(j)%100;
			if((lastTwo == (int)pentagonal.get(k)/100)){
				for(int l=0;l<hexagonal.size();l++){
					lastTwo = pentagonal.get(k)%100;
					if((lastTwo == (int)hexagonal.get(l)/100)){
						lastTwo = hexagonal.get(l)%100;
						for(int m=0;m<heptagonal.size();m++){
							if((lastTwo == (int)heptagonal.get(m)/100)){
								lastTwo = heptagonal.get(m)%100;
								for(int n=0;n<octagonal.size();n++){
									if((lastTwo == (int)octagonal.get(n)/100)){

System.out.println(triangle.get(i)+" "+square.get(j) +" "+pentagonal.get(k)+" "+hexagonal.get(l)+" "
		+ ""+heptagonal.get(m)+" "+octagonal.get(n));
									break;
									}
								}
							}
						}
					}

				}
			}

		}
	}
}
}*/