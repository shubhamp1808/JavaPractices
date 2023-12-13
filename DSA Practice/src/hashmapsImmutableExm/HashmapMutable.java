package hashmapsImmutableExm;

import java.util.HashMap;

public class HashmapMutable {

	public static void main(String[] args) {
		
		HashMap<Student, String> map = new HashMap<>();
		
		StudentMutable fakeStudentObj = new StudentMutable("Shubham");
		
		Student student = fakeStudentObj;
		
		map.put(student, "India");
		
//		fakeStudentObj.setFakeName("xyz");
		
		System.out.println(map.get(student));
	}
}
