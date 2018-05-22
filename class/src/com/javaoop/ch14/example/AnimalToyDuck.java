package com.javaoop.ch14.example;

public class AnimalToyDuck implements Animal, Toy {

	@Override
	public void play() {
		// TODO Auto-generated method stub
       System.out.println("玩具鸭跑...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("动物鸭玩...");
	}
    
	public static void main(String[] args) {
		AnimalToyDuck duck=new AnimalToyDuck();
		duck.play();
		duck.run();
		
		Animal animal=new AnimalToyDuck();
		animal.run();
		
		Toy toy=new AnimalToyDuck();
		toy.play();
		((Animal) toy).run();
	}
}
