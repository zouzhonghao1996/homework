package homework.javaoop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WuMingFen f1 = new WuMingFen("牛肉",3,true);
		f1.check();
		WuMingFen f2 = new WuMingFen("牛肉",2);
		f2.check();
		WuMingFen f3 = new WuMingFen();
		f3.check();
		
		/*Vehicle ve=new Vehicle();
		ve.setSpeed(200);
		ve.setSize(80);
		ve.move();
		ve.speedDown();
		ve.speedUp();*/
	/*	
		MyTime mt=new MyTime(23,59,59);
		mt.display();
		mt.addSecond(1);
		mt.display();*/
	}

}
