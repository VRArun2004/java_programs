package object;

public class obj_constructor {
	String brand;
	String model;
	double price;

	public
	obj_constructor(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public void print() {
		System.out.println("===========================");
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		obj_constructor lap = new obj_constructor("hp", "victos", 40700.4);
		lap.print();
		obj_constructor lap2 = new obj_constructor("lenova", "LOQ", 60745.0);
		lap2.print();

	}
}
