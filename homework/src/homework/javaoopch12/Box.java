package homework.javaoopch12;

public class Box {
	private double width;
	private double height;
	private double depth;

	public Box() {
		this.width = -1;
		this.height = -1;
		this.depth = -1;
		System.out.println("我是一个盒子");
	}

	public Box(Box box) {
		this.width = box.width;
		this.height = box.height;
		this.depth = box.depth;
	}

	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
    public static  void  vloume(Box box) {
    	System.out.println(box.depth*box.height*box.width); 
    }
}
