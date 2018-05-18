package homework.javaoopch12;

public class Car {
	protected String color;
	protected String model;

	public Car() {
		color = "红色";
		model = "轿车";
	}

	public Car(String color, String model) {

		this.color = color;
		this.model = model;
	}

	public void showColor() {
		System.out.println(color);
	}

	public void showModel() {
		System.out.println(model);
	}
}
