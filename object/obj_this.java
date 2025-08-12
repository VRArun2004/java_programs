package object;

public class obj_this {
	String brand;
	String model;
	double price;
	public void get(String brand,String model,double price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void print() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
public static void main(String[] args) {
	obj_this lap=new obj_this();
	lap.get("hp", "victos",40700.4);
	lap.print();
	obj_this lap1=new obj_this();
	lap1.get("lenova", "LOQ",60745.0);
	lap1.print();
	
}
}
