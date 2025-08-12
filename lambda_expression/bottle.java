package lambda_expression;

public class bottle implements Comparable<bottle> {
String brand;
int capacity;
public bottle(String brand, int capacity) {
	super();
	this.brand = brand;
	this.capacity = capacity;
}
@Override
public String toString() {
	return "bottle [brand=" + brand + ", capacity=" + capacity + "]";
}
@Override
public int compareTo(bottle o) {
	return this.brand.compareToIgnoreCase(o.brand);
}
}
