package project;

import java.util.Arrays;

public class Shoe {
	private String brand;
	private double price;
	private String type;
	private int size;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Shoe(String brand, double price, String type, int size) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.size = size;

	}
	

}
