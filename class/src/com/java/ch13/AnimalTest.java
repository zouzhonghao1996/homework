package com.java.ch13;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animal= {new Fish(),new Bird(),new Beast()};	
		go(animal);
	}

	private static void go(Animal[] animal) {
		for(Animal animals:animal) {
			animals.run();
			
		}
		/*for(int i=0;i<animal.length;i++) {
			Animal animals=animal[i];
			animals.run();
		}*/
		
	}

}
