package com.javaoop.ch11;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.eat();
		animal.run();
       
		Beast beast=new Beast();
		beast.eat();
		beast.run();
		
		Tiger tiger=new Tiger();
		tiger.eat();
		tiger.run();
		
		Lion lion=new Lion();
		lion.eat();
		lion.run();
	}

}
