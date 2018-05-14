package com.java.ch08;

public class Car {
	
	private String name;
	private String color;
	private double price;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {	
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	public void start() {
		System.out.println(name + " 启动了...");
	}

	public void stop() {
		System.out.println(name + " 停止了...");
	}

	public void speed(int speed) {
		System.out.println(name + "以 " + speed + " 码前进...");
	}

	public void show() {
		System.out.println(name + " " + color + " " + price);
	}
}
