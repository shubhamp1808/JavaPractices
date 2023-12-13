package Java8;

import java.util.ArrayList;
import java.util.List;

/*
till JAVA 7
--Any method in interface will be public abstract by default
--Interface will only have abstract methods, but abstract class can have abstract or defined method both
*/

/*
From JAVA 8
--Methods in interface can have default/static methods with definition block
--If defined block is present in two interfaces and a class implements both interface then class should 
  have it's own definition block for that method to call, as Java does not support multiple inheritance
--And if that defined method is in one of the class also then if called from other from other class, 
  method in one of the class will be executed unlike the interfaces one, that's the Third Rules
--Static methods do not need any object creating to be executed. interfacename.methodname will work
*/
public interface InterfaceExm {
	
	void show();
	
	List<Integer> list1 = new ArrayList<>();
	
	/*
	default boolean equals(Object o) {
		//no overriden of object class methods can be done in interfaces
	}
	*/

}
