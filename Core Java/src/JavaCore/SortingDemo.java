package JavaCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {

		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 12, 900));
		laps.add(new Laptop("Lenovo", 8, 800));
		laps.add(new Laptop("Apple", 6, 1200));

		Collections.sort(laps);
		System.out.println("Sorting based on Price::");

		for (Laptop i : laps) {
			System.out.println(i);
		}

		class RamCompare implements Comparator<Laptop> {
			public int compare(Laptop l1, Laptop l2) {
				if (l1.getRam() < l2.getRam())
					return -1;
				if (l1.getRam() > l2.getRam())
					return 1;
				else
					return 0;
			}
		}

		RamCompare ram = new RamCompare();
		Collections.sort(laps, ram);
		System.out.println("Sorting based on RAM::");

		for (Laptop i : laps) {
			System.out.println(i);
		} 	
	}
}
