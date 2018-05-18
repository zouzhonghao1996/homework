package homework.javaoopch09;

public  class Car extends Vehicles {
	protected int seats;

	public Car(String brand, String color, int seats) {
		super(brand, color);
		this.seats = seats;
	}

	public void showCar() {
		System.out.println("商标:" + brand + "\n颜色:" + color + "\n座位:" + seats);
	}
}
