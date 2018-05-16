package com.javaoop.ch10;

public class CarTest {

	public static void main(String[] args) {
           Car car=new Car();
           car.setName("bmw");
           car.setColor("blue");
           car.setPrice(8000);
           
           car.display();
           
           Car car1=new Car("兰博基尼","red",9000);
           car1.display();
          
           
	}

}
