package com.java.ch08;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car car=new Car();
        car.setName("奔驰");
        car.setColor("黑");
        car.setPrice(600d);
        
        car.show();
        car.start();
        car.speed(200);
        car.stop();
        
        System.out.println(car.getName()+" "+car.getColor()+" "+car.getPrice());
        
        car=new Car("法拉利","黑",900d);
        car.show();
	}

}
