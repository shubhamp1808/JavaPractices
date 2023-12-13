package JavaCore;

/*
 * any class or method is immutable if their value can not  be changed
 * Make class as final
 * Make variable as final
 * Make variables as private
 * No setters functions, only getters
 * Always make deep copy of object
 */

class Engine {
	int speed;

	public Engine(int speed) {
		super();
		this.speed = speed;
	}

}

public final class ImmutableClassDemo {

	private final int id;
	private final String name;
	private final Engine engine;

	public ImmutableClassDemo(int id, String name, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		Engine newEngine = new Engine(engine.speed);
		this.engine = newEngine;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Engine getEngine() {
		return engine;
	}

	public static void main(String[] args) {
		Engine e = new Engine(50);

		ImmutableClassDemo im = new ImmutableClassDemo(1, "JAVA", e);

		System.out.println(im.name == "JAVA");
//		im.name="Hi";                        // cannot set any other value because it is final variable
		System.out.println(im.name);
		System.out.println(im.engine.speed);
		e.speed=56;							// this value will not set because using deep copy not shallow copy
		System.out.println(im.engine.speed);
	}

}
