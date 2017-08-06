import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PentaHexaTri {

	public static void main(String[] args) {
		//Takes less than 30 second on my old computer. Nor very efficient code, but simple enough to understand.
		ArrayList<Long> Triangle = new ArrayList();
		ArrayList<Long> Pentagonals = new ArrayList();
		ArrayList<Long>Hexagonals = new ArrayList();
		Set<Long> intersection = new HashSet(); // You don't real need this you can do retainAll() twice.
		long n =285;
		while(n<60000){
			Triangle.add(n*(n+1)/2);
			Pentagonals.add(n*(3*n-1)/2);
			Hexagonals.add(n*(2*n-1));
			n++;
		}
		Triangle.retainAll(Pentagonals); //Intersection of triangle and pentagonals
		intersection.addAll(Triangle); // adding all triangle elements
		intersection.retainAll(Hexagonals); //Intersection with hexagonal
		System.out.println(intersection);
	}

}

