package com.java.ch12;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal=new Beast();
		animal.run();
		
        ((Beast)animal).suck();
        
        
	}

}
