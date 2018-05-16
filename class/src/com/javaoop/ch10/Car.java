package com.javaoop.ch10;

public class Car {
	private String name;
	private String color;
	private double price;
	private int speed;

	public Car() {

	}

	public Car(String name, String color, double price) {

		this.name = name;
		this.color = color;
		this.price = price;
	}

	public void speedUp() {
		speed++;
	}

	public void speedUp(int speed) {
		this.speed += speed;
	}

	public void display() {
		System.out.println(name + " " + color + " " + price);
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
