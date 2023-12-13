package JavaCore;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortUserDef {

	public static void main(String[] args) {
		Set<Laptop> laps = new TreeSet<Laptop>();
		
		laps.add(new Laptop("Dell", 12, 900));
		laps.add(new Laptop("Lenovo", 8, 800));
		laps.add(new Laptop("Apple", 6, 1200));
		
		for(Laptop l :laps) {
			System.out.println(l);
		}

	}

}
