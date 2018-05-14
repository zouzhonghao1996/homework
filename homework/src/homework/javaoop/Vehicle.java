package homework.javaoop;

public class Vehicle {
	private int speed;
	private int size;

	public void move() {
		System.out.println("以" + speed + "码启动了..." + "\n" + "体积为：" + size);
	}

	public void speedUp() {
		if (speed < 200) {
			speed += 30;
			System.out.println("加速了，当前速度为：" + speed);
		}
	}

	public void speedDown() {
		if (speed > 0) {
			speed -= 30;
			System.out.println("减速了，当前速度为：" + speed);
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
