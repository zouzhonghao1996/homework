package com.javaoop.ch14;

public class AnimalTest {

	public  static void main(String[] args) {
		Animal animal=new GoldFish();
        animal.run();
        ((Fish) animal).breath();
        
        Animal animal1=new Beast();
        animal1.run();
        ((Beast)animal1).suck();
	}

}
