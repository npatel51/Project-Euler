import java.util.ArrayList;

public class problem44 {

	public static void main(String[] args) {
		ArrayList<Integer> pentagonals = new ArrayList();
		int num=100,diff=0,sum=0;
		//Just tried 1000,2000,and 3000 as we want the minimized value
		while(num<3000){
			pentagonals.add(((num*(3*num-1))/2));
			num++;
		}
		for(int i=0;i<pentagonals.size();i++){
			for(int j=i;j<pentagonals.size();j++){
				sum=pentagonals.get(i)+pentagonals.get(j);
				diff=pentagonals.get(j)-pentagonals.get(i);
				if(pentagonals.contains(sum)&& pentagonals.contains(diff)){
					System.out.println(diff);
					break;
				}
			}

		}
	}

}
