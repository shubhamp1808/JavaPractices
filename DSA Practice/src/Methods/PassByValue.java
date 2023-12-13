package Methods;

// JAVA is by default Pass By Value, not Pass By Reference
public class PassByValue {

	public static void main(String[] args) {
		String name = "OriginalName";
		changeName(name);
		System.out.println(name);
	}
	
	static String changeName(String name) {
		name = "ChangedName";
		return name;
	}
}
