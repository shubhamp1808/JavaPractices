package Methods;

public class PassByReference1 {

	public static void main(String[] args) {
		Car a = new Car();
		a.name = "BMW";
		a.cost = 75;
		a.mileage = 10.8f;
		
		System.out.println(a.name);
		System.out.println(a.cost);
		System.out.println(a.mileage);
		
		Car b = a;
		
		System.out.println(b.name);
		System.out.println(b.cost);
		System.out.println(b.mileage);
		
		b.name = "TATA";
		b.cost = 15;
		b.mileage = 15.7f;
		
		//Value changed
		System.out.println("\n\t\tNew Values\n");
		
		System.out.println(b.name);
		System.out.println(b.cost);
		System.out.println(b.mileage);
		
		System.out.println(a.name);
		System.out.println(a.cost);
		System.out.println(a.mileage);

	}
}
