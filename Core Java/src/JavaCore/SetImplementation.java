package JavaCore;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {

	//Set is an interface and has HashSet, TreeSet, TreeHashSet as its implementations
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		/*has unordered collection
		do not contain duplicate values
		faster than treeSet
		not synchronized*/
		hashSet.add(43);
		hashSet.add(27);
		hashSet.add(9);
		hashSet.add(82);
		hashSet.add(27);
		hashSet.add(3);
		
		for(int s : hashSet) {
			System.out.println(s);
		}
		
		System.out.println("");
		
		Set<Integer> treeSet = new TreeSet<>();
		/*has ordered collection
		do not contain duplicate values
		not synchronized*/
		treeSet.add(43);
		treeSet.add(27);
		treeSet.add(9);
		treeSet.add(82);
		treeSet.add(27);
		treeSet.add(3);
		
		for(int s : treeSet) {
			System.out.println(s);
		}
		
//		treeSet.clear();          //clear set
//		treeSet.remove(82);       //returns true if object found and removed
//		treeSet.contains(27);     //return true if present
	}

}
