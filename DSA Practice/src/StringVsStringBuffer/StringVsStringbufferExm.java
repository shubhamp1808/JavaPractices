package StringVsStringBuffer;

public class StringVsStringbufferExm {

	public static void main(String[] args) {
		
		String myName = new String("Shubham");
		System.out.println(myName.hashCode());
		
		String myUpdateName = myName.concat(" Pandey");
		System.out.println(myUpdateName.hashCode());
		
		StringBuffer myName1 = new StringBuffer("Shubham");
		System.out.println(myName1.hashCode());
		
		StringBuffer myUpdateName1 = myName1.append(" Pandey");
		System.out.println(myUpdateName1.hashCode());
	}
}
