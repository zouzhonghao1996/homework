package com.java.ch07;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog dog=new Dog();
        dog.name="旺财";
        dog.variety="拉布拉多";
        dog.age=1;
        dog.color="白色";
        
        System.out.println(dog.name+" "+dog.age+" "+dog.color+" "+dog.variety);
        dog.run();
        dog.eat();
	}

}
