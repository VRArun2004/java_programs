package HashSet_prog;

import java.util.Objects;

public class Car implements Comparable<Car> {
	String brand;
	int price;

	public Car(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

	public boolean equals(Object o) {
		Car c = (Car) o;
		if (this.brand != c.brand)
			return false;
		if (this.price != c.price)
			return false;
		return true;
	}

	public int hashCode() {
		return Objects.hash(brand, price);
	}

	@Override
	public int compareTo(Car c) {
		return this.brand.compareToIgnoreCase(c.brand);
	}
}
