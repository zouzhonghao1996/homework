package homework.javaoopch09;

public class Truck extends Vehicles {
	protected float load;

	public Truck(String brand, String color, float load) {
		super(brand, color);
		this.load = load;
	}
   public void showTruck() {
	   System.out.println("商标:" + brand + "\n颜色:" + color+"\n载重:"+load);
   }
}
